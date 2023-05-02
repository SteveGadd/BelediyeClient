package main;

import com.example.*;
import org.apache.commons.lang3.math.NumberUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BeyanTest {
    private final EDevletBelediyeService service = new EDevletBelediyeService();
    private final BelediyePortType port = service.getBelediyePortTypeBindingPort();
    KisiselSorgulamaGType request = new KisiselSorgulamaGType();

    List<BeyanBilgisiType>beyanList = port.beyanBilgisiSorgula(request).getBeyanListesi().getBeyanBilgisi();




    @Test(priority = 1)
    void nullTest() {
        Assert.assertTrue(beyanList.size() > 0);
    }
    @Test(priority = 2,dependsOnMethods = {"nullTest"})
    void primeAttrValidityTest() {
        boolean check = true;
        String reason = "";
        ArrayList<String> beyanTurleri = new ArrayList<>(5);
        beyanTurleri.add("Emlak");
        beyanTurleri.add("Çevre Temizlik");
        beyanTurleri.add("Harcama İştirak");
        beyanTurleri.add("İlan Reklam");
        beyanTurleri.add("Katı Atık");
        for (int i = 0; i < beyanList.size(); i++) {
            if (!NumberUtils.isParsable(beyanList.get(i).getBeyanNo())) {
                reason = reason.concat((i + 1) + ". sıradaki beyan no geçersiz.\n");
                check = false;
            }
            if (!NumberUtils.isParsable(beyanList.get(i).getSicilNo())) {
                reason = reason.concat((i + 1) + ". sıradaki sicil no geçersiz.\n");
                check = false;
            }
            if (!beyanTurleri.contains(beyanList.get(i).getBeyanTuru())) {
                reason = reason.concat((i + 1) + ". sıradaki beyan türü tanımsız.\n");
                check = false;
            }
            if (!beyanList.get(i).getBeyanTarih().isValid()) {
                reason = reason.concat((i + 1) + ". sıradaki beyan tarihi geçersiz.\n");
                check = false;
            }
            if (beyanList.get(i).getBeyanTuru().equals("Emlak") || beyanList.get(i).getBeyanTuru().equals("Harcama İştirak"))
                if (!NumberUtils.isParsable(beyanList.get(i).getParsel()) || !NumberUtils.isParsable(beyanList.get(i).getAda()))
                    reason = reason.concat((i + 1) + ". sıradaki parsel ve ada bilgileri geçersiz.\n");

        }
        Assert.assertTrue(check, reason);
    }

    @Test(priority = 3, dependsOnMethods = {"nullTest"})
    void consistencyTest() {
        boolean isConsistent = true;
        String reason = "";
        BeyanBilgisiType first = beyanList.get(0);
        for (BeyanBilgisiType sicil : beyanList) {
            if (!first.getSicilNo().equals(sicil.getSicilNo())) {
                isConsistent = false;
                reason = reason.concat("Sicil nolar çakıştığı için tahakkuk bilgileri uyuşmuyor.");
                break;
            }
        }
        Assert.assertTrue(isConsistent, reason);
    }
}