package com.Heald;

import com.Heald.Cipher.Vigenere;
import com.Heald.IO.FileManager;

public class Main {
    public static void main(String[] args) {
        Vigenere.setKey("Adam");
        Vigenere.encrypt(FileManager.readFile(), false);
    }
}
