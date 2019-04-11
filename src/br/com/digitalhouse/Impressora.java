package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Impressora {

    List<Imprimivel> Imprimiveis = new ArrayList<>();

    public void adicionarImprimivel(Imprimivel imprimivel) {
        Imprimiveis.add(imprimivel);
    }

    public void imprimirTudo() {
        for (Imprimivel imprimivel : Imprimiveis) {
            imprimivel.imprimir();
        }
    }
}