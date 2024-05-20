package com.example.democfx.apis.dto;

import java.util.List;

public class Move {

    private String name;
    private String url;
    private Integer powerPoints;
    private Integer power;

    private List<Pokemon> learned_by_pokemon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPowerPoints() {
        return powerPoints;
    }

    public void setPowerPoints(Integer powerPoints) {
        this.powerPoints = powerPoints;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Pokemon> getLearned_by_pokemon() {
        return learned_by_pokemon;
    }

    public void setLearned_by_pokemon(List<Pokemon> learned_by_pokemon) {
        this.learned_by_pokemon = learned_by_pokemon;
    }
}
