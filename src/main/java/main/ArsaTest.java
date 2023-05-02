package main;

import com.example.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class ArsaTest {
    private final EDevletBelediyeService service = new EDevletBelediyeService();
    private final BelediyePortType port = service.getBelediyePortTypeBindingPort();

    private List<ArsaRayicBedelBilgisiType> rayicBedelListesi;

    @Test(priority = 1)
    void rayicZeroTest() {

        ArsaRayicBedelBilgisiGType query = new ArsaRayicBedelBilgisiGType();
        rayicBedelListesi = port.arsaRayicBedelSorgula(query).getArsaRayicBedelListesi().getArsaRayicBedelBilgisi();
        Assert.assertTrue(rayicBedelListesi.size()>0);
    }
    @Test(priority = 2,dependsOnMethods = {"rayicZeroTest"})
    void rayicRepetitionTest(){
        HashMap<String,Integer>rayicler= new HashMap<>();
        boolean areUnique = true;
        rayicler.put(rayicBedelListesi.get(0).getMahalleAdi().concat(rayicBedelListesi.get(0).getCaddeSokakAdi()).concat(rayicBedelListesi.get(0).getYil().toString()),1);

        for(ArsaRayicBedelBilgisiType i:rayicBedelListesi.subList(1,rayicBedelListesi.size())){
            if (rayicler.containsKey(i.getMahalleAdi().concat(i.getCaddeSokakAdi()).concat(i.getYil().toString()))){
                areUnique=false;
                break;
            }
            rayicler.put(i.getMahalleAdi().concat(i.getCaddeSokakAdi()).concat(i.getYil().toString()),1);
        }
        Assert.assertTrue(areUnique);
    }
    @Test(priority = 3,dependsOnMethods = {"rayicZeroTest"})
    void rayicKelimeTest(){
        boolean areCorrect=true;
        for (ArsaRayicBedelBilgisiType i :rayicBedelListesi) {
            boolean tmp = kelimeCheck(i.getCaddeSokakAdi());
            if (!tmp){
                areCorrect=false;
                break;
            }
            tmp = kelimeCheck(i.getMahalleAdi());
            if (!tmp){
                areCorrect=false;
                break;
            }
        }
        Assert.assertTrue(areCorrect);
    }
    static boolean kelimeCheck(String kelime){
        kelime = kelime.toLowerCase(new Locale("tr","TR"));
        return !kelime.contains("bilinmeyen") && !kelime.contains("tanımsız") && !kelime.contains("tanimsiz") &&
                !kelime.contains("x") && !kelime.contains("sil") && !kelime.contains("bilinmiyor");
    }
}
