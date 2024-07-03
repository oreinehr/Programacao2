package Aula19;

import java.util.Random;
public class Conta {
    String titular;
    String identificador;
    String senha;
    float saldo;

    public Conta (String titular, String senha, float saldo){
        gerarIdentificador();
        this.titular=titular;
        this.senha=senha;
        this.saldo=saldo;
    }

    void gerarIdentificador(){
        String texto = "";
        for (int i=0;i<4;i++){
            texto+=(char) new Random().nextInt(65,91);
        }
        int valor = new Random().nextInt(1000,10000);
        identificador= texto + valor;
    }

    void depositar (float valor) {
        saldo += valor;
    }

    boolean sacar(float valor){
        if (valor <=saldo) {
            saldo-=valor;
            return true;
        }
        return false;
    }

    String verificarSaldo(){
        return "Saldo atual R$ "+String.format("%.2f",saldo);
    }


}
