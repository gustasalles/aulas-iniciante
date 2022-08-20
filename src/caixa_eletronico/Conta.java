package caixa_eletronico;

public class Conta {
    private double saldo;
    private String nomeUsuario;

    public Conta(String nome, Double valorInicial) {
        this.nomeUsuario = nome;
        this.saldo = valorInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void inserirSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
}
