import java.util.Scanner;

public class MaiorNota {
    public static void main(String[] args) {

    }
    public static void calculoNota() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a quantidade de alunos");

        int qtdeAlunos = leitor.nextInt();

        double notas[] = new double[qtdeAlunos];//inicializamos o vetor  com o tamanho relaxionado a qtde de aluno
        String nomes[] = new String[qtdeAlunos];
        for (int n = 0; n < qtdeAlunos; n++) {
            System.out.println("insira o nome do aluno");
            nomes[n] = leitor.next();
            System.out.println("insira nota dos alunos");
            notas[n] = leitor.nextDouble();
        }
    }
       public static int descobrirMaiorNota(double n []){
        for (int i = 0;i<n.length;i++)
        {

        }

            return 0;

        }

}