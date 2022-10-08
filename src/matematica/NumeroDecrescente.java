package matematica;
public class NumeroDecrescente {

    public static void imprimeOrdemDecrescenteWhile(int n) {
        System.out.println("entrei");
        while (n > 0) {
            n = n - 1;
            System.out.println("imprime em ordem decrescente" + n);
        }
    }

    public static void imprimeOrdemDecrescenteFor(int n) {
        int novoNumero = n;
        for (int i = 0; i <= n; i++) {
            System.out.println("imprimir ordem decrescente" + novoNumero--);
        }
    }

    public static void imprimeOrdemDecrescenteDoWhile(int n) {
        do {
            n = n - 1;
            System.out.println("imprime em ordem decrescente:" + n);
        }
        while (n > 0);
    }

    public static void imprimeVetorOrdemDescrente (int vetor[]){
int auxiliar =  vetor.length - 1;
        for(int i=0; i < vetor.length;i++){
            System.out.print(  vetor[auxiliar] + ": " );
auxiliar = auxiliar - 1;
        }
    }

}


