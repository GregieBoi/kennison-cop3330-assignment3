package org.example.ex45;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    String fileDir = System.getProperty("user.dir");
    String path = fileDir + "\\src\\main\\java\\org\\example\\ex45\\exercise45_input.txt";
    File file = new File(path);
    Scanner sc = new Scanner(file);

    appTest() throws FileNotFoundException { //for file not found exception
    }

    @Test
    @DisplayName("testCreateInput")
    void createInput() {

        ArrayList<String> testInput = app.createInput(sc);

        assertEquals("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.", testInput.get(0));
        assertEquals("For example, \"She uses an IDE to write her Java programs\" instead of \"She", testInput.get(1));
        assertEquals("utilizes an IDE to write her Java programs\".", testInput.get(2));

    }

    @Test
    @DisplayName("testChangeUtilize")
    void changeUtilize() {

        ArrayList<String> testInput = app.createInput(sc);

        testInput = app.changeUtilize(testInput);

        assertEquals("One should never use the word \"use\" in writing. Use \"use\" instead.", testInput.get(0));
        assertEquals("For example, \"She uses an IDE to write her Java programs\" instead of \"She", testInput.get(1));
        assertEquals("uses an IDE to write her Java programs\".", testInput.get(2));

    }

    @Test
    @DisplayName("testPrintOutput")
    void printOutput() throws IOException {

        ArrayList<String> testInput = app.createInput(sc);

        ArrayList<String> output = app.changeUtilize(testInput);

        String fileDir = System.getProperty("user.dir");
        String path = fileDir + "\\src\\main\\java\\org\\example\\ex45\\testExercise45_output.txt";

        FileWriter writer = new FileWriter(path);

        for (int i = 0; i < output.size(); i++)
            writer.write(output.get(i) + "\n");

        writer.close();
        System.out.println("Successfully wrote to file");

    }

    @Test
    void getFileOut() {

        //trouble testing methods that require user input

    }
}