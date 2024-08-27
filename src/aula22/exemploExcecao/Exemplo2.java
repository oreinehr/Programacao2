package aula22.exemploExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {
    public static int lerInteiro () {
        Scanner ler = new Scanner(System.in);
        int num = 0;
        boolean valido;
        do {
            try {
                System.out.println("Digite um número: ");
                num = ler.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("O valor precisa ser um número");
                ler.next();
                valido = false;
            }
        } while (!valido);
        return num;
    }

    public static void main(String[] args) {
        try{
            int n1 = lerInteiro();
            int n2 = lerInteiro();
            int resposta = n1 / n2;
            System.out.println(resposta);
        }catch (ArithmeticException e) {
            System.out.println("Não é posível dividir por zero");
        }
    }
}