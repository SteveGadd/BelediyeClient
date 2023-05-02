package main;

import com.example.*;
import org.apache.commons.lang3.math.NumberUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.List;

public class TahakkukTest {
    private final EDevletBelediyeService service = new EDevletBelediyeService();
    private final BelediyePortType port = service.getBelediyePortTypeBindingPort();
    TahakkukSorgulamaGType query = new TahakkukSorgulamaGType();
    private final List<TahakkukBilgileriType> tahakkukList = port.tahakkukSorgula(query).getTahakkukListesi().getTahakkukBilgisi();

    @Test(priority = 1)
    void nullTest(){
        Assert.assertTrue(tahakkukList.size()>0);
    }
    @Test(priority = 2)
    void primeAttrNullTest(){
        boolean check = true;
        String reason = "";
        for (int i = 0; i < tahakkukList.size(); i++) {
            if (!NumberUtils.isParsable(tahakkukList.get(i).getTahakkukNo())) {
                reason = reason.concat((i + 1) + ". sıradaki tahakkuk no geçersiz.\n");
                check = false;
            }
            if (!NumberUtils.isParsable(tahakkukList.get(i).getSicilNo())) {
                reason = reason.concat((i + 1) + ". sıradaki sicil no geçersiz.\n");
                check = false;
            }
            if (!NumberUtils.isParsable(tahakkukList.get(i).getSicilNo())) {
                reason = reason.concat((i + 1) + ". sıradaki sicil no geçersiz.\n");
                check = false;
            }
            if (tahakkukList.get(i).getTahakkukDurumu().equals("")) {
                reason = reason.concat((i + 1) + ". sıradaki tahakkuk durumu yok.\n");
                check = false;
            }
            if (tahakkukList.get(i).getTahakkukAdi().equals("")) {
                reason = reason.concat((i + 1) + ". sıradaki tahakkuk adı yok.\n");
                check = false;
            }
            if (tahakkukList.get(i).getAdSoyadUnvan().equals("")) {
                reason = reason.concat((i + 1) + ". sıradaki ad soyad unvan bilgisi yok.\n");
                check = false;
            }
            if (!tahakkukList.get(i).getTahakkukTarihi().isValid()) {
                reason = reason.concat((i + 1) + ". sıradaki beyan tarihi geçersiz.\n");
                check = false;
            }
            if (!tahakkukList.get(i).getSonOdemeTarihi().isValid()) {
                reason = reason.concat((i + 1) + ". sıradaki son ödeme tarihi geçersiz.\n");
                check = false;
            }
        }
    }
    @Test(priority = 3,dependsOnMethods = {"nullTest"})
    void consistencyTest(){
        boolean isConsistent=true;
        String reason = "";
        TahakkukBilgileriType first = tahakkukList.get(0);
        for (TahakkukBilgileriType sicil:tahakkukList){
            if (!first.getAdSoyadUnvan().equals(sicil.getAdSoyadUnvan())) {
                isConsistent = false;
                if (!reason.equals("")){
                    reason = reason.concat(" ve isimler");
                    break;
                }
                else reason= reason.concat("İsimler");
            }
            if (!first.getSicilNo().equals(sicil.getSicilNo())) {
                isConsistent = false;
                if (!reason.equals("")){
                    reason = reason.concat(" ve sicil nolar");
                    break;
                }
                else reason= reason.concat("Sicil nolar");
            }
        }
        Assert.assertTrue(isConsistent,reason+" çakıştığı için tahakkuk bilgileri uyuşmuyor.");
    }
    @Test(priority = 4,dependsOnMethods = {"nullTest"})
    void paymentExceedTest() {
        boolean check = true;
        String reason = "";
        for (int i = 0; i < tahakkukList.size(); i++) {
            if (tahakkukList.get(i).getOdenenTutar()!=null && tahakkukList.get(i).getOdenenTutar().compareTo(tahakkukList.get(i).getToplamTutar()) > 0) {
                reason = reason.concat((i + 1) + ". sıradaki ödenen miktar toplam miktardan fazla.\n");
                check = false;
            }
        }
    }
}
