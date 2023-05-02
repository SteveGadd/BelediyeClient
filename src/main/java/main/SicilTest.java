package main;

import com.example.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SicilTest {

    private final EDevletBelediyeService service = new EDevletBelediyeService();
    private final BelediyePortType port = service.getBelediyePortTypeBindingPort();

    KisiselSorgulamaGType request = new KisiselSorgulamaGType();
    SicilSorgulamaCType response = port.sicilSorgula(request);
    private final List<SicilBilgisiType> sicilList = response.getSicilListesi().getSicilBilgisi();

    @Test(priority = 1)
    void multipleTest(){
        Assert.assertTrue(sicilList.size()>0);
    }
    @Test(priority = 2,dependsOnMethods = {"multipleTest"})
    void consistencyTest(){
        boolean isConsistent=true;
        String reason = "";
        SicilBilgisiType first = sicilList.get(0);
        for (SicilBilgisiType sicil:sicilList){
            if (!first.getAdi().equals(sicil.getAdi())) {
                isConsistent = false;
                if (!reason.equals(""))reason = reason.concat(", isimler");
                else reason= reason.concat("İsimler");
            }
            if (!first.getSoyadi().equals(sicil.getSoyadi())) {
                isConsistent = false;
                if (!reason.equals(""))reason = reason.concat(", soyisimler");
                else reason = reason.concat("Soyisimler");
            }
        }
        Assert.assertTrue(isConsistent,reason+" çakıştığı için sicil bilgileri uyuşmuyor.");
    }
}
