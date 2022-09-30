import matematica.NumeroDecrescente;

public class Executar {

    public static void main(String[] args) {
        //matematica.MenorNumero.menorEntreEles(2,5);
        //matematica.MaiorNumero.maiorEntreEles(2,8);
        //NumeroDecrescente.imprimeOrdemDecrescenteWhile(5);
        //NumeroDecrescente.imprimeOrdemDecrescenteWhile(5);
        //NumeroDecrescente.imprimeOrdemDecrescenteFor(5);
        //NumeroDecrescente.imprimeOrdemDecrescenteDoWhile(5);
        //matematica.ParImpar.imprimeSomaNumerosImpares(30);
       // matematica.Matematica matematica = new matematica.Matematica();
       // System.out.println(matematica.fatorial(2));
        //System.out.println(matematica.fatorial2(2));
       // matematica.Vetor vetor = new matematica.Vetor();
        //vetor.percorreVetor();
       // matematica.MeidaAritmetica.calcularMedia();
        int vetor [] = new int[10];
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;
        vetor[4] = 5;
        vetor[5] = 6;
        vetor[6] = 7;
        vetor[7] = 8;
        vetor[8] = 9;
        vetor[9] = 10;
        NumeroDecrescente.imprimeVetorOrdemDescrente(vetor);
    }
}
