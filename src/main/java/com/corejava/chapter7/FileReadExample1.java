package com.corejava.chapter7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample1 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("src/main/resources/existentFile.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.println((char) character);
            }

            /**
             * java.lang.Object
             *      java.lang.Throwable
             *          java.lang.Exception
             *              java.lang.IOException
             *                  java.lang.FileNotFoundException
             */

        } catch (IOException ioe) {
            System.out.println("An I/O error occurred: " + ioe.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("Resource closed");
                }
            } catch (IOException ioe) {
                System.out.println("Error closing the reader: " + ioe.getMessage());
            }
        }
    }
}
