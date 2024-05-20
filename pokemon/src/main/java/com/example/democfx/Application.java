package com.example.democfx;

import com.example.democfx.apis.PokemonAPI;

import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws Exception {

        Application app = new Application();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un pokemon para obtener su imagen y movimientos: ");
        String pokemon = scanner.nextLine();
        pokemon = pokemon.toLowerCase();

        app.DevolverImagenYMovimientosDeUnPokemon(pokemon);

        System.out.println("Ingrese un movimiento para obtener los pokemones que lo conocen: ");
        String movimiento = scanner.nextLine();
        movimiento = movimiento.toLowerCase();

        app.DevolverPokemonesPorMovimiento(movimiento);

    }

    public void DevolverImagenYMovimientosDeUnPokemon(String nombrePokemon) throws Exception{

        PokemonAPI pokemonAPI = new PokemonAPI();

        List<String> nombresMovimientos = pokemonAPI.ObtenerMovimientosPokemon(nombrePokemon);
        System.out.println("Movimientos del Pokémon: " + nombresMovimientos);

        System.out.println("Pokemones: " + pokemonAPI.ObtenerImagenPokemon(nombrePokemon));
    }

    public void DevolverPokemonesPorMovimiento(String movimiento) throws Exception{

        PokemonAPI pokemonAPI = new PokemonAPI();
        System.out.println("Pokemones de " + movimiento + ": " + pokemonAPI.ObtenerPokemonesConMovimiento(movimiento));
    }
}
