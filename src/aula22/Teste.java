package aula22;

public class Teste {
    public static void main(String[] args) {
        System.out.println(Operacoes.PI);
        Operacoes op = new Operacoes();
        System.out.println(op.pi);
        //não é possível alterar o valor de um atributo final
    }
}
