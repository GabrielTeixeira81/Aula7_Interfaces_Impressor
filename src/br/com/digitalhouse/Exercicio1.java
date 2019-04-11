package br.com.digitalhouse;

public class Exercicio1 {

    public static void main(String[] args) {

        Contrato novoContrato = new Contrato("TCC","documentario");
        Foto novaFoto = new Foto("Myself","JPG");
        Documento novoDocumento = new Documento("Android", "word");

        Impressora impressora = new Impressora();
        impressora.adicionarImprimivel(novoContrato);
        impressora.adicionarImprimivel(novaFoto);
        impressora.adicionarImprimivel(novoDocumento);

        impressora.imprimirTudo();
    }



}
