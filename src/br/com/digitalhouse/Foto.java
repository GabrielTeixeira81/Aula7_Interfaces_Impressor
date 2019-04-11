package br.com.digitalhouse;

public class Foto implements Imprimivel {

    String nome;
    String tipo;

    public Foto (){}

    public Foto(String name, String tipe) {
        nome = name;
        tipo = tipe;
    }


    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie:" + nome + "." + tipo);
    }
}
