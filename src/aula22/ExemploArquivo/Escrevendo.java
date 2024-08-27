package aula22.ExemploArquivo;

import java.io.*;

public class Escrevendo {
    public static void main(String[] args) {
        File caminho = new File("C:\\Users\\guire\\Downloads");
        if (caminho.exists())
            System.out.println("O caminho existe");
        else {
            caminho.mkdirs();
            System.out.println("O caminho não existe, tentando criar...");
        }
        Pessoa p1 = new Pessoa();
        p1.setNome("Jonas");
        p1.setSobrenome("Silva");
        File arquivo = new File(caminho, "dadosPessoa.db");
        try {
            ObjectOutputStream objEscrita = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
            objEscrita.writeObject(p1);
            objEscrita.close();


        } catch (FileNotFoundException e) {
            System.out.println("eeerro");
        } catch (IOException e) {
            System.out.println("eerrri");
        }

    }
}
