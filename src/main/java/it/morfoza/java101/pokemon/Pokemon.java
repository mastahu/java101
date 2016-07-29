package it.morfoza.java101.pokemon;

public class Pokemon {

    private String name;
    private long health = 1000;
    private long combatPower;

    public Pokemon(String name, long combatPower) {
        this.combatPower = combatPower;
        this.name = name;
    }

    public String toString() {
        return "Pokemon: " + name + " health: " + health;
    }

    public void takeAttack(long attackStrength) {
        health -= attackStrength;
    }

    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void attack(Pokemon enemy) {
        if (this != enemy) {
            enemy.takeAttack(combatPower);
        }
    }
}
