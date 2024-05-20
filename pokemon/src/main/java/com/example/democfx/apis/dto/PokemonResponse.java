package com.example.democfx.apis.dto;

import java.util.List;
import com.example.democfx.apis.dto.Pokemon;

public class PokemonResponse {

    private List<Pokemon> results;

    public List<Pokemon> getResults() {
        return results;
    }

    public void setResults(List<Pokemon> results) {
        this.results = results;
    }

}
