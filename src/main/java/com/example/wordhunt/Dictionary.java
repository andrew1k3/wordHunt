package com.example.wordhunt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;


public class Dictionary {
    private static final String ALPHABET = "ABCDEFHIJKLMNOPQRSTUVWXYZ";
    private HashSet<String> words = new HashSet<>();
    private final int lengthMin;

    public Dictionary(int lengthMin) {
        this.lengthMin = lengthMin;
    }

    public HashSet<String> generateAllValidWords() throws FileNotFoundException {
        Scanner in = new Scanner(new File("./data/words.txt"));
        while (in.hasNext()) {
            String word = in.nextLine().toUpperCase();
            if (word.length() >= lengthMin && word.length() <= 16) {
                words.add(word);
            }
        }
        return words;
    }

    public HashSet<String> getWords() {
        return words;
    }

    public static String getALPHABET() {
        return ALPHABET;
    }

    public boolean contains(String string) {
        if (string.length() < lengthMin) return false;
        return words.contains(string.toUpperCase());
    }
}
