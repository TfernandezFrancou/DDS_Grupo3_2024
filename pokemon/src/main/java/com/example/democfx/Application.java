package com.example.democfx;

import com.example.democfx.apis.PokemonAPI;
import com.example.democfx.apis.Pokemones;
import com.example.democfx.apis.dto.Move;

import java.util.List;

import static com.example.democfx.apis.Pokemones.BULBASAUR;
import static java.sql.Types.NULL;

public class Application {

    public static void main(String[] args) throws Exception {

        Application app = new Application();

        // System.out.println("Movimientos: " + pokemonAPI.ObtenerMovimientosPokemon(BULBASAUR.getIndice()));

        // System.out.println("Pokemones: " + pokemonAPI.ObtenerNombrePokemones());

        app.DevolverImagenYMovimientosDeUnPokemon("bulbasaur");

    }

    public static int obtenerIndicePokemon(String nombrePokemon) {

        nombrePokemon = nombrePokemon.toUpperCase();

        for (Pokemones pokemon : Pokemones.values()) {
            if (pokemon.name().equals(nombrePokemon)) {
                return pokemon.getIndice();
            }
        }
        return NULL;
    }

    public void DevolverImagenYMovimientosDeUnPokemon(String nombrePokemon) throws Exception{

        PokemonAPI pokemonAPI = new PokemonAPI();

        List<String> nombresMovimientos = pokemonAPI.ObtenerMovimientosPokemon(obtenerIndicePokemon(nombrePokemon));
        System.out.println("Movimientos del Pokémon: " + nombresMovimientos);

        System.out.println("Pokemones: " + pokemonAPI.ObtenerImagenPokemon(obtenerIndicePokemon(nombrePokemon)));
    }
}
