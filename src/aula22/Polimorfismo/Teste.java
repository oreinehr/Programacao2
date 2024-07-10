package aula22.Polimorfismo;

public class Teste {
    public static void main(String[] args) {
        Operacoes op = new Operacoes();

        System.out.println("Somando dois números: "+op.soma(5,2, 6));
        System.out.println("Somando três números: "+op.soma(3, 5, 6));
        System.out.println("Somando duass Strings: "+op.soma("Programação", "Java"));
    }
}
