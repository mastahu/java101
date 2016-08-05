package it.morfoza.java101.pokemon;

public abstract class PokemonBase implements Pokemon {

    protected String name;
    protected long health = 1000;
    protected long combatPower;

    public String toString() {
        return "Pokemon: " + name + " health: " + health;
    }

    public void takeAttack(long attackStrength) {
        health -= attackStrength;
    }

}
