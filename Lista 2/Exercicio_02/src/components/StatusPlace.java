package components;

public enum StatusPlace {

    EMPTY(' '), PLAYER_ONE('X'), PLAYER_TWO('O');

    private char simbolo;

    private StatusPlace(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }
}