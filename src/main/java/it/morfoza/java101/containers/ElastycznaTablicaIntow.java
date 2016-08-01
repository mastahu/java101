package it.morfoza.java101.containers;

public class ElastycznaTablicaIntow {

    private int[] tablica = new int[0];

    public void dodajElement(int jakiśInt) {
        int[] nowaTablica = new int[tablica.length + 1];
        int i = 0;
        while( i < tablica.length) {
            nowaTablica[i] = tablica[i];
            i += 1;
        }
        nowaTablica[i] = jakiśInt;
    }

}
