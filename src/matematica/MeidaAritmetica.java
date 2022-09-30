package matematica;

import java.util.Scanner;

public class MeidaAritmetica {
    public static void calcularMedia(){
        Scanner leitor = new Scanner(System.in);
        double notas [] = new double[4];
        for(int n=0;n < notas.length;n++){
            System.out.println("digite a "+n+"˚ nota");
            notas[n] = leitor.nextDouble();
        }
        double resultado = (notas[0]+notas[1]+notas[2]+notas[3])/4;
        System.out.println("a media é :" +resultado);

    }

}
