package main;

import com.example.AyarOkuGType;
import com.example.BelediyePortType;
import com.example.EDevletBelediyeService;
import com.example.SokakCaddeSorgulamaGType;
import org.testng.Assert;
import org.testng.annotations.Test;
public class MainTest {

    private final EDevletBelediyeService service = new EDevletBelediyeService();
    private final BelediyePortType port = service.getBelediyePortTypeBindingPort();
    @Test(priority = 1)
    void sokakCaddeTest() {

        SokakCaddeSorgulamaGType query = new SokakCaddeSorgulamaGType();
        String result = port.sokakCaddeSorgula(query).getSonucKodu();
        Assert.assertEquals(result,"0000");
    }
    /*
    @Test(priority = 2)
    void ayarOkuTest(){
        EDevletBelediyeService service = new EDevletBelediyeService();
        BelediyePortType port = service.getBelediyePortTypeBindingPort();
        AyarOkuGType query = new AyarOkuGType();
        String result = port.ayarOku(query).getBelediyeKodu()+"\n"+port.ayarOku(query).getSonucKodu();
        System.out.println(result);
    }

     */

}
