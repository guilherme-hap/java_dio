package src;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
           int numero;
           String agencia;
           String nomeCliente;
           double saldo;

        Scanner input = new Scanner(System.in);

        System.out.println("Banco embutido no terminal, faça sua conta agora!");

        System.out.println("Por favor, digite o número da conta: ");
        numero = input.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = input.next();

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = input.next();

        System.out.println("Por favor, digite seu saldo (não minta!): ");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }

}