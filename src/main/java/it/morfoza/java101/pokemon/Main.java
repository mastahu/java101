package it.morfoza.java101.pokemon;

public class Main {

    public static void main(String[] args) {

        Pokemon pokemon = new Pikachu(100);
        Pokemon pokemon2 = new Charizard(200);
        Pokemon pokemon3 = new Bulbasaur();
        Pokemon pokemon4 = null;

        if (jestWtorek()){
            pokemon = pokemon2;
        }
         pokemon2 = pokemon3;


        Pikachu pika = new Pikachu(4);
        pika.metodaTylkoDlaPikaczu();

        pokemon = pika;
       // pika = pokemon;

        System.out.println(pokemon);
        System.out.println(pokemon2);

        System.out.println();

        pokemon2.attack(pokemon);

        System.out.println(pokemon);
        System.out.println(pokemon2);


        pokemon.attack(pokemon2);
        pokemon.attack(pokemon2);
        pokemon.attack(pokemon2);
        pokemon.attack(pokemon2);
        pokemon.attack(pokemon2);
        pokemon.attack(pokemon2);
        pokemon.attack(pokemon2);
        pokemon.attack(pokemon2);
        pokemon.attack(pokemon2);
        pokemon.attack(pokemon2);
        pokemon.attack(pokemon2);
        pokemon.attack(pokemon2);
        pokemon.attack(pokemon2);
        pokemon.attack(pokemon2);

        System.out.println(pokemon);
        System.out.println(pokemon2);

        if(pokemon.isAlive()) {
            System.out.println(pokemon+  " is alive");
        } else {
            System.out.println(pokemon + " is unconscious");
        }

        if(pokemon2.isAlive()) {
            System.out.println(pokemon2 +  " is alive");
        } else {
            System.out.println(pokemon2 + " is unconscious");
        }

    }

    private static boolean jestWtorek() {
        // TODO Zrobic
        return false;
    }
}
