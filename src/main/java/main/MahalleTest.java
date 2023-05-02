package main;

import com.example.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MahalleTest {
    private final EDevletBelediyeService service = new EDevletBelediyeService();
    private final BelediyePortType port = service.getBelediyePortTypeBindingPort();

    @Test(priority = 2)
    void mahalleTest() {


        MahalleSorgulamaGType query = new MahalleSorgulamaGType();
        ArrayOfMahalleBilgisi mahalleler = port.mahalleSorgula(query).getMahalleListesi();
        Assert.assertNotEquals(mahalleler.getMahalleBilgisi().size(),0);
    }

}
