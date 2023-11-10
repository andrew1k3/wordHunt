package com.example.wordhunt;

public class Tile {
    private final char letter;
    private Position position;
    private int score = 1;

    public Tile(char letter, Position position) {
        this.letter = letter;
        this.position = position;
    }

    public char getLetter() {
        return letter;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.valueOf(getLetter()).toUpperCase();
    }
}
