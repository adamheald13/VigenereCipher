package com.Heald.Cipher;

import java.util.HashMap;
import java.util.Map;

public class Vigenere {
    private static String key;

    public static void crypt(String plaintext, boolean encrypt) {
        plaintext = plaintext.replace(" ", "");
        char[] charArray = plaintext.toCharArray();
        int[] intArray = textToInts(plaintext.replace(" ", ""));
        int[] keyInts = textToInts(key.replace(" ", ""));

        //do the encryption/decryption
        int keyIndex = 0;
        for(int i = 0; i < charArray.length; i++) {
            int temp;
            if(encrypt) {
                temp = (intArray[i] + keyInts[keyIndex]) % 26;
            }
            else {
                temp = (intArray[i] - keyInts[keyIndex]) % 26;
            }

            if(temp < 0)
                temp += 26;

            char replacementChar = intToCharMap.get(temp);
            charArray[i] = replacementChar;

            keyIndex++;
            if(keyIndex >= key.length()) {
                keyIndex = 0;    //go back to the start of the key
            }
        }

        System.out.println(charArray);
    }

    private static int[] textToInts(String plaintext) {
        int[] intArray = new int[plaintext.length()];

        for(int i = 0; i < plaintext.length(); i++) {
            intArray[i] = charToIntMap.get(plaintext.charAt(i));
        }

        return intArray;
    }

    public static void setKey(String key) {
        Vigenere.key = key.replace(" ", "");
    }

    public static final Map<Character, Integer> charToIntMap;
    static {
        charToIntMap = new HashMap<>();
        charToIntMap.put('A', 0);
        charToIntMap.put('a', 0);
        charToIntMap.put('B', 1);
        charToIntMap.put('b', 1);
        charToIntMap.put('C', 2);
        charToIntMap.put('c', 2);
        charToIntMap.put('D', 3);
        charToIntMap.put('d', 3);
        charToIntMap.put('E', 4);
        charToIntMap.put('e', 4);
        charToIntMap.put('F', 5);
        charToIntMap.put('f', 5);
        charToIntMap.put('G', 6);
        charToIntMap.put('g', 6);
        charToIntMap.put('H', 7);
        charToIntMap.put('h', 7);
        charToIntMap.put('I', 8);
        charToIntMap.put('i', 8);
        charToIntMap.put('J', 9);
        charToIntMap.put('j', 9);
        charToIntMap.put('K', 10);
        charToIntMap.put('k', 10);
        charToIntMap.put('L', 11);
        charToIntMap.put('l', 11);
        charToIntMap.put('M', 12);
        charToIntMap.put('m', 12);
        charToIntMap.put('N', 13);
        charToIntMap.put('n', 13);
        charToIntMap.put('O', 14);
        charToIntMap.put('o', 14);
        charToIntMap.put('P', 15);
        charToIntMap.put('p', 15);
        charToIntMap.put('Q', 16);
        charToIntMap.put('q', 16);
        charToIntMap.put('R', 17);
        charToIntMap.put('r', 17);
        charToIntMap.put('S', 18);
        charToIntMap.put('s', 18);
        charToIntMap.put('T', 19);
        charToIntMap.put('t', 19);
        charToIntMap.put('U', 20);
        charToIntMap.put('u', 20);
        charToIntMap.put('V', 21);
        charToIntMap.put('v', 21);
        charToIntMap.put('W', 22);
        charToIntMap.put('w', 22);
        charToIntMap.put('X', 23);
        charToIntMap.put('x', 23);
        charToIntMap.put('Y', 24);
        charToIntMap.put('y', 24);
        charToIntMap.put('Z', 25);
        charToIntMap.put('z', 25);
    }

    public static final Map<Integer, Character> intToCharMap;
    static {
        intToCharMap = new HashMap<>();
        intToCharMap.put(0, 'a');
        intToCharMap.put(1, 'b');
        intToCharMap.put(2, 'c');
        intToCharMap.put(3, 'd');
        intToCharMap.put(4, 'e');
        intToCharMap.put(5, 'f');
        intToCharMap.put(6, 'g');
        intToCharMap.put(7, 'h');
        intToCharMap.put(8, 'i');
        intToCharMap.put(9, 'j');
        intToCharMap.put(10, 'k');
        intToCharMap.put(11, 'l');
        intToCharMap.put(12, 'm');
        intToCharMap.put(13, 'n');
        intToCharMap.put(14, 'o');
        intToCharMap.put(15, 'p');
        intToCharMap.put(16, 'q');
        intToCharMap.put(17, 'r');
        intToCharMap.put(18, 's');
        intToCharMap.put(19, 't');
        intToCharMap.put(20, 'u');
        intToCharMap.put(21, 'v');
        intToCharMap.put(22, 'w');
        intToCharMap.put(23, 'x');
        intToCharMap.put(24, 'y');
        intToCharMap.put(25, 'z');
    }
}
