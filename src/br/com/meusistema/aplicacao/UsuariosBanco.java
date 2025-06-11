package br.com.meusistema.aplicacao;

import br.com.meusistema.modelo.SistemaBanco;
import br.com.meusistema.modelo.SistemaBanco;

import java.util.Scanner;

 public class UsuariosBanco {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        SistemaBanco cliente1;

        System.out.println("Digite o numero da sua conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o seu nome: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.println("Deseja depositar valor inicial? (S/N): ");
        char decisao = sc.next().charAt(0);

        if(decisao == 's'){

            System.out.println("Digite um valor inicial: ");
            double icialDeposito = sc.nextDouble();
            cliente1 = new SistemaBanco(numeroConta, nome, icialDeposito);

        }else {
            cliente1 = new SistemaBanco(nome, numeroConta);
        }


        System.out.println();
        System.out.println("Valor do deposito:  ");
        double dep = sc.nextDouble();
        cliente1.depositoBancario(dep);
        System.out.println(cliente1);

        System.out.println();
        System.out.println("Valor do saque: ");
        double saque = sc.nextDouble();
        cliente1.saqueBancario(saque);
        System.out.println(cliente1);

        sc.close();


    }



}
