package com.corejava.chapter7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Custom FileFormatException class
class FileFormatException extends Exception {
    public FileFormatException(String message) {
        super(message);
    }

    public FileFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class FileProcessor {

    public static void processCustomFile(String filePath) throws FileFormatException, IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                // Simulate a format check: e.g., expecting each line to start with "DATA:"
                if (!line.startsWith("DATA:")) {
                    throw new FileFormatException("Invalid file format at line " + lineNumber);
                }
                System.out.println("Processing line: " + line);
            }
        } catch (IOException ioe) {
            // Re-throw as FileFormatException if it's a format related IO issue
            // or simply re-throw the IOException if it's a general IO problem
            throw new IOException("Error reading file: " + ioe.getMessage(), ioe);
        }

    }
    public static void main(String[] args) {
        String validFile = "src/main/resources/valid_data.txt";
        String invalidFile = "src/main/resources/invalid_data.txt";

        // Create dummy files
        try {
            java.nio.file.Files.write(java.nio.file.Paths.get(validFile), "DATA:line1\nDATA:line2".getBytes());
            java.nio.file.Files.write(java.nio.file.Paths.get(invalidFile), "DATA:line1\nBADLINE".getBytes());
        } catch (IOException ioe) {
            System.out.println("Error creating dummy files: " + ioe.getMessage());
            return;
        }

        System.out.println("--- Processing valid file ---");
        try {
            processCustomFile(validFile);
            System.out.println("Valid file processed successfully.");
        } catch (FileFormatException ffe) {
            System.out.println("File format error: " + ffe.getMessage() );
        } catch (IOException ioe) {
            System.out.println("IO error: " + ioe.getMessage());
        }
    }
}
