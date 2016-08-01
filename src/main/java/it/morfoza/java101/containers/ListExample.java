package it.morfoza.java101.containers;

import it.morfoza.java101.pokemon.Pokemon;

import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {

        ArrayList<Pokemon> lista = new ArrayList<>();

        Pokemon piotrek = new Pokemon("Piotrek", 33);

        lista.add(piotrek);

        Pokemon pokemon1 = lista.get(0);
        System.out.println(lista.size());
        Pokemon pokemon2 = lista.get(1);

        System.out.println(piotrek == pokemon1);

    }
}
