package main;

import com.example.ArrayOfSokakCaddeBilgisi;
import com.example.BelediyePortType;
import com.example.EDevletBelediyeService;
import com.example.SokakCaddeSorgulamaGType;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SokakTest {

    EDevletBelediyeService service = new EDevletBelediyeService();
    BelediyePortType port = service.getBelediyePortTypeBindingPort();
    @Test(priority = 3)
    void sokakTest(){
        SokakCaddeSorgulamaGType query = new SokakCaddeSorgulamaGType();
        ArrayOfSokakCaddeBilgisi sokaklar = port.sokakCaddeSorgula(query).getSokakCaddeListesi();
        Assert.assertNotEquals(sokaklar.getSokakCaddeBilgisi().size(),0);
    }
}
