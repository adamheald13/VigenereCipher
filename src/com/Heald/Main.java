package com.Heald;

import com.Heald.Cipher.Vigenere;
import com.Heald.IO.FileManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to encrypt or decrypt a message?");
        System.out.println("1) encrypt");
        System.out.println("2) decrypt");

        int selection = Integer.parseInt(scanner.next());
        boolean encrypt = false;

        do {
            if (selection == 1) {
                encrypt = true;
                FileManager.fileName = "plaintext.txt";
            }
            else if (selection == 2) {
                encrypt = false;
                FileManager.fileName = "ciphertext.txt";
            }
            else {
                System.out.println("Please enter 1 for encrypt, or 2 for decrypt: ");
                selection = Integer.parseInt(scanner.next());
            }
        } while(selection != 1 && selection != 2);

        Vigenere.setKey("Adam Heald");
        Vigenere.crypt(FileManager.readFile(), encrypt);
    }
}
