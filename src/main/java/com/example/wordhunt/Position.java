package com.example.wordhunt;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Position translate(int x, int y) {
        this.setX(this.x + x);
        this.setY(this.y + y);
        return new Position(this.x + x, this.y + y);
    }
}
