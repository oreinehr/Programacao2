package aula22.exemploExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean valido;

        do {
            try {
                System.out.println("Digite um número: ");
                int n1 = ler.nextInt();
                System.out.println("Digite outro número: ");
                int n2 = ler.nextInt();
                int resposta = n1 / n2;
                System.out.println(resposta);
                valido = true;
            } catch (InputMismatchException instancia) {
                System.out.println("Os valores devem ser números");
                valido = false;
                ler.next();
            } catch (ArithmeticException instancia) {
                System.out.println("Não é possível dividir por zero");
                valido = false;
            } finally {
                System.out.println("Sempre sou executeido");
            }
        }while(!valido);

    }
}
