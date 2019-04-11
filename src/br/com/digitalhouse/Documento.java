package br.com.digitalhouse;

public class Documento implements Imprimivel {

    String nome;
    String tipo;

    public Documento() {
    }

    public Documento(String name, String tipe) {
        nome = name;
        tipo = tipe;

    }

    @Override
    public void imprimir() {
        System.out.println("Sou um documento do word:" + nome + "." + tipo);
    }
}
