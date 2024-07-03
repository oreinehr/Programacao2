package Aula19;

import java.util.Arrays;
import java.util.Scanner;

public class Banco {
    public static Conta cadstraConta() {
        System.out.println("Cadastro de conta");
        System.out.println("Qual o titular?");
        String titular = new Scanner(System.in).next();
        String senha = senha = new Scanner(System.in).next();
        System.out.println("Qual o deposito inicial?");
        float valor = new Scanner(System.in).nextFloat();
        return new Conta(titular, senha, valor);
    }

    public static Conta acessaConta(Conta c1) {
        System.out.println("Acessando a conta " + c1.identificador);
        char opc;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("D- DEPOSITAR");
            System.out.println("S- SACAR");
            System.out.println("V- VERIFICAR SALDO");
            System.out.println("E- SAIR");
            opc = new Scanner(System.in).next().toLowerCase().charAt(0);
            switch (opc) {
                case 'D' -> {
                    System.out.println("Qual o valor você deseja depositar:");
                    float valor = new Scanner(System.in).nextFloat();
                    c1.depositar(valor);
                    System.out.println("Valor depositado!");
                }
                case 'S' -> {
                    System.out.println("Qual o valor você deseja sacar:");
                    float valor = new Scanner(System.in).nextFloat();
                    if (c1.sacar(valor))
                        System.out.println("Saque realizado!");
                    else
                        System.out.println("Saldo Insuficiente");
                }
                case 'V' -> System.out.println(c1.verificarSaldo());
            }
        }
        while (opc != 'E');
        return c1;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta[] lista = new Conta[10];
        int cont = 0;
        char opc;
        do {
            System.out.println("C - Cadastrar uma nova conta");
            System.out.println("A - Acessar uma conta");
            System.out.println("L - Listar as contas");
            System.out.println("E - Sair");
            opc = ler.next().toLowerCase().charAt(0);

            switch (opc) {
                case 'C' -> {
                    lista[cont] = cadstraConta();
                    System.out.println("Conta cadastrada obtece identificador " + lista[cont].identificador);
                    cont++;
                }
                case 'A' -> {
                    System.out.println("Digite o identificador:");
                    String id = ler.next();
                    System.out.println("Digite a senha: ");
                    String senha = ler.next();
                    int posicao = -1;
                    for (int i = 0; i < cont; i++) {
                        if (lista[i].identificador.equals(id) && lista[i].senha.equals(senha))
                            posicao = i;
                    }
                    if (posicao >= 0) {
                        lista[posicao] = acessaConta(lista[posicao]);
                    } else
                        System.out.println("DAdos de acesso inválido");
                }
                case 'L' -> {
                    System.out.println("Listagem de contas...");
                    for (int i = 0; i < cont; i++) {
                        System.out.println("Titular: " + lista[i].titular);
                        System.out.println("Identicador: " + lista[i].identificador);
                        System.out.println("----------");
                    }
                }
            }
        }
        while (opc != 'E') ;
    }
}
