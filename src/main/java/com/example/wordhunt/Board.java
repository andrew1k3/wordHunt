package com.example.wordhunt;

import java.util.Random;

public class Board {
    private Tile[][] board;
    private Dictionary dictionary;
    final int BOARD_LENGTH;
    private final String ALPHABET = Dictionary.getALPHABET();

    public Board(int boardLength, int wordLengthMin) {
        this.BOARD_LENGTH = boardLength;
        this.board = new Tile[BOARD_LENGTH][BOARD_LENGTH];
        this.dictionary = new Dictionary(wordLengthMin);
    }

    public Tile[][] getBoard() {
        return board;
    }

    public void populateBoard() {
        Random random = new Random();
        for (int i = 0; i < BOARD_LENGTH; i++) {
            for (int j = 0; j < BOARD_LENGTH; j++) {
                char letter = ALPHABET.charAt(random.nextInt(0, ALPHABET.length()));
                board[i][j] = new Tile(letter, new Position(i, j));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < BOARD_LENGTH; i++) {
            StringBuilder tmp = new StringBuilder();
            for (int j = 0; j < BOARD_LENGTH; j++) {
                tmp.append(board[i][j].getLetter() + " ");
            }
            out.append(tmp).append("\n");
        }
        out.append("com.example.wordhunt.Board Size: " + BOARD_LENGTH);
        return out.toString();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Board in = new Board(i, 4);
            in.populateBoard();
            System.out.println(in);
        }

    }
}
