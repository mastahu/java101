package it.morfoza.java101.pokemon;

public interface Pokemon {

    void takeAttack(long attackStrength);

    boolean isAlive();

    void attack(Pokemon enemy) ;
}
