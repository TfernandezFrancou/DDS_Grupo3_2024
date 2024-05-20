package com.example.democfx.apis.dto;

public class Move {

    private String name;
    private String url;
    private Integer powerPoints;
    private Integer power;

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
}
