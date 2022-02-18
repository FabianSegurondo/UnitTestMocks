package cambioMonedaTest;

import CambioDeMonedas.CambioDeMoneda;
import CambioDeMonedas.MonedaUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CambioMonedaTest {
    MonedaUtils objetoMock = Mockito.mock(MonedaUtils.class);

    @Test
    public void verify(){

        Mockito.when(objetoMock.obtenerTipoDeCambio("Dólares", "Bolivianos")).thenReturn(7);
        CambioDeMoneda cambioMoneda = new CambioDeMoneda(objetoMock);
        String expected = "La cantidad de cambio es : [700] Bolivianos";
        String actual = cambioMoneda.saveInNewMoney(100, "Dólares", "Bolivianos");
        Assertions.assertEquals(expected,actual,"ERROR");
        Mockito.verify(objetoMock).obtenerTipoDeCambio("Dólares", "Bolivianos");
    }

    @Test
    public void verifyWrong(){

        Mockito.when(objetoMock.obtenerTipoDeCambio("Euros", "Bolivianos")).thenReturn(7);
        CambioDeMoneda cambioMoneda = new CambioDeMoneda(objetoMock);
        String expected = "Cantidad de cambio incorrecta";
        String actual = cambioMoneda.saveInNewMoney(-100, "Euros", "Bolivianos");
        Assertions.assertEquals(expected,actual,"ERROR");
    }
}
