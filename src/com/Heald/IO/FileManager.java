package com.Heald.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {
    public static String fileName;

    public static String readFile() {
        BufferedReader reader = null;

        try {
            String currentLine;

            reader = new BufferedReader(new FileReader("C:\\Users\\heeal\\IdeaProjects\\VigenereCipher\\src\\com\\Heald\\IO\\" + fileName));

            currentLine = reader.readLine();
            return currentLine;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
