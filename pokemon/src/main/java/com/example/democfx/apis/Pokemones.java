package com.example.democfx.apis;

public enum Pokemones {
    BULBASAUR(1),
    IVYSAUR(2),
    VENUSAUR(3),
    CHARMANDER(4),
    CHARMELEON(5),
    CHARIZARD(6),
    SQUIRTLE(7),
    WARTORTLE(8),
    BLASTOISE(9),
    CATERPIE(10),
    METAPOD(11),
    BUTTERFREE(12),
    WEEDLE(13),
    KAKUNA(14),
    BEEDRILL(15),
    PIDGEY(16),
    PIDGEOTTO(17),
    PIDGEOT(18),
    RATTATA(19),
    RATICATE(20);

    private final int indice;

    private Pokemones(int indice) {
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
    }

}
