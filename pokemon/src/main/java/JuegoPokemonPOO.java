import java.util.Random;
import java.util.Scanner;

public class JuegoPokemonPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("¡Bienvenido al mundo Pokémon GO!");
        System.out.print("Iniciaremos a jugar, ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("¡Hola, Que emocion "  + nombre + "! Es hora de elegir tu Pokémon de preferencia.\n");


        String[] pokemons = {"Charizard", "Pikachu", "Bulbasaur", "Machamp", "Lucario"};
        int[] poderes = {95, 85, 90, 80, 88};
        String[] tecnicas = {"Lanzallamas", "ImpacTrueno", "Latigaso", "Puño Dinamico", "Esfera Aural"};


        System.out.println("Estos son los Pokémon disponibles:");
        for (int i = 0; i < pokemons.length; i++) {
            System.out.println((i + 1) + ". " + pokemons[i] +
                    " | Poder Especial: " + poderes[i] +
                    " | Técnica Secreta: " + tecnicas[i]);
        }


        System.out.print("\nElige tu Pokémon guía (1-" + pokemons.length + "): ");
        int eleccion = sc.nextInt();

        if (eleccion < 1 || eleccion > pokemons.length) {
            System.out.println("Opción inválida. No has podido elegir un Pokémon.");
            return;
        }


        String pokemonElegido = pokemons[eleccion - 1];
        String tecnicaElegida = tecnicas[eleccion - 1];

        System.out.println("\n¡Excelente elección,Ganaremos " + nombre + "!");
        System.out.println("Tu Pokémon guía es: " + pokemonElegido);
        System.out.println("🔥 Técnica Secreta: " + tecnicaElegida);


        String rival = "Chechis, Líder del Equipo Plasma.";
        String pokemonRival = "Charizard";
        String[] ataquesRival = {"Lanzallamas", "Mar Llamas"};
        String[] defensasRival = {"Escudo Ígneo", "Evasión Fantasma"};

        System.out.println("\n⚔ Ha aparecido tu rival: " + rival + " ⚔");
        System.out.println("Su Pokémon guía es: " + pokemonRival);
        System.out.println("🔥 Ataques: " + ataquesRival[0] + ", " + ataquesRival[1]);
        System.out.println("🛡 Defensas: " + defensasRival[0] + ", " + defensasRival[1]);


        int hpJugador = 100;
        int hpRival = 100;

        System.out.println("\nLa batalla comienza!!!");
        System.out.println(nombre + " envía a " + pokemonElegido + "!");
        System.out.println(rival + " envía a " + pokemonRival + "!\n");


        while (hpJugador > 0 && hpRival > 0) {
            esperar();

            System.out.println(pokemonElegido + " usa " + tecnicaElegida + "!");
            int danoJugador = rand.nextInt(15) + 15; // entre 15-30
            hpRival -= danoJugador;
            if (hpRival < 0) hpRival = 0;
            System.out.println(pokemonRival + " recibe " + danoJugador + " de daño. (HP: " + hpRival + ")\n");

            if (hpRival <= 0) break;

            esperar();

            int accion = rand.nextInt(2); // 0 = ataque, 1 = defensa
            if (accion == 0) {
                String ataqueRival = ataquesRival[rand.nextInt(ataquesRival.length)];
                int danoRival = rand.nextInt(11) + 25; // 25-35 daño
                System.out.println(pokemonRival + " ataca con " + ataqueRival + "!");
                hpJugador -= danoRival;
                if (hpJugador < 0) hpJugador = 0;
                System.out.println(pokemonElegido + " recibe " + danoRival + " de daño. (HP: " + hpJugador + ")\n");
            } else {
                String defensaRival = defensasRival[rand.nextInt(defensasRival.length)];
                System.out.println(pokemonRival + " se protege con " + defensaRival + "!");
                esperar();
                int contra = 20;
                System.out.println(pokemonRival + " contraataca aprovechando la defensa!");
                hpJugador -= contra;
                if (hpJugador < 0) hpJugador = 0;
                System.out.println(pokemonElegido + " recibe " + contra + " de daño. (HP: " + hpJugador + ")\n");
            }
        }

        esperar();

        System.out.println("💥 " + pokemonElegido + " ha sido derrotado...");
        System.out.println("Has perdido la batalla contra " + rival + ".");
        System.out.println("\n" + rival + " dice: Caíste ante el poder de la estrategia. \".\"");

        sc.close();
    }


    public static void esperar() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}