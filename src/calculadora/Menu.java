package calculadora;

import java.util.Scanner;
 public class Menu {
    private static void exibirMenu() {
        System.out.println("Digite 1 para somar");
        System.out.println("Digite 2 para subtrair");
        System.out.println("Digite 3 para dividir");
        System.out.println("Digite 4 para multiplicar");
    }

    public static void escolhaOperacao() {
        Scanner teclado;
        int operacao;
        double n1,n2;
        teclado = new Scanner(System.in);

        do {
            exibirMenu();
            operacao = teclado.nextInt();
            switch (operacao) {
                case 1:
                    System.out.println("digite primeiro valor");
                    n1  = teclado.nextDouble();
                    System.out.println("digite segundo valor");
                    n2  = teclado.nextDouble();
                    System.out.println(Operacoes.somar(n1, n2));
                    break;
                case 2:
                    System.out.println("digite primeiro valor");
                    n1 = teclado.nextDouble();
                    System.out.println("digite segunda valor");
                    n2  = teclado.nextDouble();
                    System.out.println(Operacoes.subtrair(n1,n2));
                    break;
                case 3:
                    System.out.println("digite primeiro valor");
                    n1 = teclado.nextDouble();
                    System.out.println("digite segundo valor");
                    n2 = teclado.nextDouble();
                    System.out.println(Operacoes.dividir(n1,n2));
                    break;
                case 4:
                    System.out.println("digite primeiro valor");
                    n1 = teclado.nextDouble();
                    System.out.println("digite segundo valor");
                    n2 = teclado.nextDouble();
                    System.out.println(Operacoes.multiplicar(n1,n2));
                    break;
                default:
            }
        } while (operacao != 0);
    }
}
