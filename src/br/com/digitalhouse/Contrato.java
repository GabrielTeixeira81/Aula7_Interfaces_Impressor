package br.com.digitalhouse;

public class Contrato implements Imprimivel {

    String nome;
    String tipo;

    public Contrato (){}

    public Contrato(String name, String tipe){
        nome = name;
        tipo = tipe;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        nome = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipe) {
        tipo = tipe;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um contrato muito legal:" + nome + "." + tipo);
    }
}
