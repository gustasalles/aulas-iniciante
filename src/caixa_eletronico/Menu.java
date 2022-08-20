package caixa_eletronico;

import javax.swing.*;
import java.util.Scanner;

public class Menu {
    static Conta usuario;

    private static void exibirMenu() {
        System.out.println("---Escolha a opção desejada---");
        System.out.println("Digite 1 para inserir dinheiro");
        System.out.println("Digite 2 para sacar ");
        System.out.println("Digite 3 para consultar saldo");
        System.out.println("Digite 4 para editar cadastro");
        System.out.println("Digite 0 para sair");
    }

    public static void escolheOpcao() {
        Scanner teclado;
        int opcao;
        teclado = new Scanner(System.in);
        if (usuario == null) {

            System.out.println("Digite o nome do usuario");
            String nome = teclado.next();
            System.out.println("Insira o valor inicial da conta");
            Double valorInicial = teclado.nextDouble();
            usuario = new Conta(nome, valorInicial);
        }
        do {
            exibirMenu();
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite ai o valor a ser depositado");
                    double valorDeposito = teclado.nextDouble();
                    usuario.inserirSaldo(valorDeposito + usuario.getSaldo());
                    System.out.println("seu saldo atual é de:" + usuario.getSaldo());

                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado");
                    double valorSaque = teclado.nextDouble();

                    if (valorSaque <= usuario.getSaldo()) {
                        usuario.inserirSaldo(usuario.getSaldo() - valorSaque);
                        System.out.println("seu saldo atual e de:" + usuario.getSaldo());
                    }
                    else {
                        System.out.println("não foi possivel realizar o saque pois o valor informado e superior o valor em conta " );
                        System.out.println("valor de saque "+ valorSaque);
                        System.out.println("saldo disponivel em conta  " + usuario.getSaldo());
                    }
                    break;

                case 3:
                    double saldo = usuario.getSaldo();
                    System.out.println("O saldo do " + usuario.getNomeUsuario() + " é:" + saldo);
                    System.out.println("----------------");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
                case 4:
                    System.out.println("Insira o nome do usuario");
                    usuario.setNomeUsuario(teclado.next());
                    break;
            }

        } while (opcao != 0);
    }

}

