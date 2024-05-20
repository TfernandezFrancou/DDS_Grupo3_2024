package com.example.democfx.apis.dto;

import java.util.List;

public class Move {

    private String name;
    private List<Pokemon> learned_by_pokemon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getLearned_by_pokemon() {
        return learned_by_pokemon;
    }

    public void setLearned_by_pokemon(List<Pokemon> learned_by_pokemon) {
        this.learned_by_pokemon = learned_by_pokemon;
    }
}
