package matematica;

public class Matematica {
    public double fatorial(double n) {
        double resultado = 0;
        double auxiliar;
        while (n >= 1) {
            auxiliar = n;
            n = n - 1;
            if (n != 0) {
                resultado = auxiliar * n;
            }
        }
        return resultado;
    }

    public int fatorial2(int j) {
        int resultado = 0;
        for (int n = j; n >= 1; n--) {
            j = j - 1;
            if (j != 0) {
                resultado = j * n;
            }

        }
        return resultado;

    }


}
