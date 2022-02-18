package VerificacionUnitTestMock;

public class Generador {
    PrimoUtils primoUtils;

    public Generador() {
        this.primoUtils = new PrimoUtils();
    }

    public Generador(PrimoUtils primoUtils) {
        this.primoUtils = primoUtils;
    }

    public String getNumberValues(int n) throws Exception {
        String resultado="";
        if (n <= 0) {
            throw new Exception("dato incorrecto");
        }
        if (this.primoUtils.esPrimo(n)) {
            for (int i = 2; i <= n; i += 2) {
                resultado += i+" ";
            }
        } else {
            for(int i = 1; i<=n ; i+=2) {
                resultado += i+" ";
            }
        }

        return resultado.trim();

    }
}

