package CambioDeMonedas;

public class CambioDeMoneda {
    private MonedaUtils util = new MonedaUtils();
    private String message;
    public CambioDeMoneda(){}

    public CambioDeMoneda(MonedaUtils utilMock){
        util = utilMock;
    }

    public String saveInNewMoney(int amount, String monedaOriginal, String monedaDestino){
        if (amount> 0){
            message="La cantidad de cambio es : ["+(amount*util.obtenerTipoDeCambio(monedaOriginal,monedaDestino))+"] "+monedaDestino;
        }else{
            message="Cantidad de cambio incorrecta";
        }
        return message;
    }
}
