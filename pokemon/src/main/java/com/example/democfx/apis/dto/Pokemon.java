package com.example.democfx.apis.dto;

import java.util.List;


public class Pokemon {

    private String name;
    private String url;
    private PokemonSprite sprites;
    private List<PokemonMove> moves;

    public String getName() {
        return name;
    }

    public List<PokemonMove> getMoves() {
        return moves;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoves(List<PokemonMove> moves) {
        this.moves = moves;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PokemonSprite getSprites() {
        return sprites;
    }

    public void setSprites(PokemonSprite sprites) {
        this.sprites = sprites;
    }
}