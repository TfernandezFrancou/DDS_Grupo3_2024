package com.example.democfx.apis;

import com.example.democfx.apis.dto.Move;
import com.example.democfx.apis.dto.PokemonMove;
import com.example.democfx.apis.dto.PokemonResponse;
import com.example.democfx.apis.dto.Pokemon;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PokemonAPI {
    public String ObtenerImagenPokemon(Integer idPokemon) throws Exception{
        WebClient clientUsers = WebClient.create("https://pokeapi.co/api/v2/pokemon/" + idPokemon);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Response response = clientUsers
                .header("Content-Type", "application/json")
                .get();

        int status = response.getStatus();
        System.out.println("Status: " + status);

        String responseBody = response.readEntity(String.class);

        if (status == 200) {
            Pokemon pokemon = objectMapper.readValue(responseBody, Pokemon.class);

            return pokemon.getSprites().getFront_default();
        } else {
            System.out.println("Error response = " + responseBody);
            throw new Exception("Error en la llamada a /api/user");
        }
    }
    public List<String> ObtenerMovimientosPokemon(Integer idPokemon) throws Exception{
        WebClient clientUsers = WebClient.create("https://pokeapi.co/api/v2/pokemon/" + idPokemon);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Response response = clientUsers
                .header("Content-Type", "application/json")
                .get();

        int status = response.getStatus();
        System.out.println("Status: " + status);

        String responseBody = response.readEntity(String.class);

        if (status == 200) {
            Pokemon pokemon = objectMapper.readValue(responseBody, Pokemon.class);

            List<String> nombresMovimientos = new ArrayList<>();

            // System.out.println("Movimientos: " + pokemon.getMoves());
            for (PokemonMove pokemonMove : pokemon.getMoves()) {
                nombresMovimientos.add(pokemonMove.getMove().getName());
                // System.out.println("Movimiento: " + pokemonMove.getMove());
                // System.out.println("Nombre: " + pokemonMove.getMove().getName());
            }
            return nombresMovimientos;
        } else {
            System.out.println("Error response = " + responseBody);
            throw new Exception("Error en la llamada a /api/user");
        }
    }
    public List<String> ObtenerURLPokemones() throws Exception {

        WebClient clientUsers = WebClient.create("https://pokeapi.co/api/v2/pokemon");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Response response = clientUsers
                .header("Content-Type", "application/json")
                .get();

        int status = response.getStatus();
        System.out.println("Status: " + status);

        String responseBody = response.readEntity(String.class);

        System.out.println("response = " + responseBody);

        if (status == 200) {
            PokemonResponse pokemonResponse = objectMapper.readValue(responseBody, PokemonResponse.class);

            return pokemonResponse.getResults().stream()
                    .map(Pokemon::getUrl)
                    .collect(Collectors.toList());
        } else {
            System.out.println("Error response = " + responseBody);
            throw new Exception("Error en la llamada a /api/user");
        }
    }

    public List<String> ObtenerNombrePokemones() throws Exception {

        WebClient clientUsers = WebClient.create("https://pokeapi.co/api/v2/pokemon");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Response response = clientUsers
                .header("Content-Type", "application/json")
                .get();

        int status = response.getStatus();
        System.out.println("Status: " + status);

        String responseBody = response.readEntity(String.class);

        System.out.println("response = " + responseBody);

        if (status == 200) {
            PokemonResponse pokemonResponse = objectMapper.readValue(responseBody, PokemonResponse.class);

            return pokemonResponse.getResults().stream()
                    .map(Pokemon::getName)
                    .collect(Collectors.toList());
        } else {
            System.out.println("Error response = " + responseBody);
            throw new Exception("Error en la llamada a /api/user");
        }
    }
}
