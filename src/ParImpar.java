public class ParImpar {
    public static boolean ehImpar(int n) {
        if (n % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void imprimeSomaNumerosImpares(int n) {
        int resultadoSoma = 0;
        for (int i = 0; i <= n; i++) {
            if (ehImpar(i)) {
                System.out.println("somando " + i + " + " + resultadoSoma);
                resultadoSoma = i + resultadoSoma;
                System.out.println("resultado: " + resultadoSoma);
            }
        }
    }

    public static boolean ehPar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // multiplicar numeros pares entre 0 e 30.
    public static void multiplicaçaoNumerosPares(int n) {
        int resutadoSoma = 0;
        for (int i = 0; i < n; i++) {
            if (ehPar(i)) {
                if (resutadoSoma != 0) {
                    System.out.println("resultado da multiplicação" + n);
                    resutadoSoma = i * resutadoSoma;
                    System.out.println("resultado " + resutadoSoma);
                }

            }
        }
    }


    public void somaNumeroImpar() {
        int resultadoSoma = 0;
        if (1 % 2 != 0) {
            resultadoSoma = resultadoSoma + 1;
        }
        if (2 % 2 != 0) {
            resultadoSoma = resultadoSoma + 2;
        }
        if (3 % 2 != 0) {
            resultadoSoma = resultadoSoma + 3;
        }
        if (4 % 2 !=0) {
            resultadoSoma = resultadoSoma + 4;
        }
        if (5 % 2 != 0) {
            resultadoSoma = resultadoSoma + 5;
        }
        if (6 % 2 != 0) {
            resultadoSoma = resultadoSoma + 6;
        }
        if (7 % 2 != 0) {
            resultadoSoma = resultadoSoma + 7;
        }
        if (8 % 2 != 0){
            resultadoSoma = resultadoSoma + 8;
        }
        if (9 % 2 != 0){
            resultadoSoma = resultadoSoma + 9;
        }
        if (10 % 2 != 0){
            resultadoSoma = resultadoSoma + 10;
        }
        if (11 % 2 != 0){
            resultadoSoma = resultadoSoma + 11;
        }
        if (12 % 2 != 0){
            resultadoSoma = resultadoSoma + 12;
        }
        if (13 % 2 != 0){
            resultadoSoma = resultadoSoma + 13;
        }
        if (14 % 2 != 0){
            resultadoSoma = resultadoSoma + 14;
        }
        if (15 % 2 != 0){
            resultadoSoma = resultadoSoma + 15;
        }
        if (16 % 2 != 0){
            resultadoSoma = resultadoSoma + 16;
        }
        if (17 % 2 != 0){
            resultadoSoma = resultadoSoma + 17;
        }
        if (18 % 2 != 0){
            resultadoSoma = resultadoSoma + 18;
        }
        if (19 % 2 != 0){
            resultadoSoma = resultadoSoma + 19;
        }
        if (20 % 2 != 0){
            resultadoSoma = resultadoSoma + 20;
        }
        if (21 % 2 != 0){
            resultadoSoma = resultadoSoma + 21;
        }
        if (22 % 2 != 0){
            resultadoSoma = resultadoSoma + 22;
        }
        if (23 % 2 != 0){
            resultadoSoma = resultadoSoma + 23;
        }
        if (24 % 2 != 0){
            resultadoSoma = resultadoSoma + 24;
        }
        if (25 % 2 != 0){
             resultadoSoma = resultadoSoma + 25;
        }
        if (26 % 2 != 0){
            resultadoSoma = resultadoSoma + 26;
        }
        if (27 % 2 != 0){
            resultadoSoma = resultadoSoma + 27;
        }
        if (28 % 2 != 0){
            resultadoSoma = resultadoSoma + 28;
        }
        if (29 % 2 != 0){
            resultadoSoma = resultadoSoma + 29;
        }
        if (30 % 2 != 0){
            resultadoSoma = resultadoSoma + 30;
        }

    }


}










