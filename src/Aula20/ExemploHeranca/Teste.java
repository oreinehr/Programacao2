package Aula20.ExemploHeranca;

public class Teste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Jonas", "Silva");
        f1.setNome("Jonas");
        f1.setSobrenome("Silva");
        f1.setSalario(1500);

        Motorista m1= new Motorista("Ana", "Silva");
        m1.setNome("Ana");
        m1.setSobrenome("Silva");
    }
}
