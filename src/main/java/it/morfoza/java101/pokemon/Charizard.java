package it.morfoza.java101.pokemon;

public class Charizard implements Pokemon {

    private String name;
    private long health = 1000;
    private long combatPower;

    public Charizard(long combatPower) {
        this.combatPower = combatPower;
        this.name = "Charizard";
    }

    public String toString() {
        return "Pokemon: " + name + " health: " + health;
    }

    public void takeAttack(long attackStrength) {
        health -= attackStrength;
    }

    public boolean isAlive() {
        if (health > -100) {
            return true;
        } else {
            return false;
        }
    }

    public void attack(Pokemon enemy) {
        System.out.println("Jestem Charizard i atakuje raz!");
        enemy.takeAttack(combatPower/2);
        System.out.println("Jestem Charizard i atakuje  drugi raz!");
        enemy.takeAttack(combatPower/2);
    }
}
