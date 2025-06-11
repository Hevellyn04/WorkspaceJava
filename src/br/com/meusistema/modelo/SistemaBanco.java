package br.com.meusistema.modelo;

public class SistemaBanco {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;


    public SistemaBanco( String nomeTitular, int numeroConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    public SistemaBanco(int numeroConta, String nomeTitular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        depositoBancario(depositoInicial);
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getValorDepositado() {
        return saldo;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }


    public void depositoBancario(double valorDepositado){

        this.saldo += valorDepositado;

    }

    public void saqueBancario(double saque){
        this.saldo -= saque + 5;

    }

    public String toString(){
        return "Nome do titular da conta: " +this.nomeTitular + ". Numero da conta: " +numeroConta+ ". saldo da conta: " + saldo+ ".";
    }
}
