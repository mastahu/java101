package it.morfoza.java101.pokemon;

public class Pikachu extends PokemonBase {

    public Pikachu(long combatPower) {
        this.combatPower = combatPower;
        this.name = "Pikachu";
    }

    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void attack(Pokemon enemy) {
        System.out.println("UUUUUUUUUU Pikachu!");
            enemy.takeAttack(combatPower);
    }

    public void metodaTylkoDlaPikaczu() {}
}
