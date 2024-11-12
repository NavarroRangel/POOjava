package br.com.alura.screenmatch.desafios;

import java.util.ArrayList;
import java.util.Collections;

public class OrdemCrescente {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static void main(String[] args) {
        OrdemCrescente numero1 = new OrdemCrescente();
        numero1.setNumero(2);

        OrdemCrescente numero2 = new OrdemCrescente();
        numero2.setNumero(10);

        OrdemCrescente numero3 = new OrdemCrescente();
        numero3.setNumero(4);

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(10);
        lista.add(1);

        Collections.sort(lista);
        System.out.println(lista);


    }
}


