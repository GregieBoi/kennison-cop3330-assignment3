package org.example.ex46;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    String fileDir = System.getProperty("user.dir");
    String path = fileDir + "\\src\\main\\java\\org\\example\\ex46\\exercise46_input.txt";
    File file = new File(path);
    Scanner sc = new Scanner(file);

    appTest() throws FileNotFoundException { // for file not found exception
    }

    @Test
    @DisplayName("testCreateInput")
    void createInput() {

        ArrayList<Word> words  = app.createInput(sc);

        assertEquals(7, words.get(0).getCount());
        assertEquals(2, words.get(1).getCount());
        assertEquals(1, words.get(2).getCount());

    }

    @Test
    @DisplayName("testSortWords")
    void sortWords() {

        Word greg = new Word();
        Word dog = new Word();
        Word cat = new Word();

        greg.setName("greg");
        dog.setName("dog");
        cat.setName("cat");
        greg.count = 1;
        dog.count = 2;
        cat.count = 3;

        ArrayList<Word> words  = new ArrayList<Word>();

        words.add(greg);
        words.add(dog);
        words.add(cat);

        app.sortWords(words);

        assertEquals("cat", words.get(0).getWord());
        assertEquals("dog", words.get(1).getWord());
        assertEquals("greg", words.get(2).getWord());

    }

    @Test
    @DisplayName("testPrintOutput")
    void printOutput() {

        Word greg = new Word();
        Word dog = new Word();
        Word cat = new Word();

        greg.setName("greg");
        dog.setName("dog");
        cat.setName("cat");
        greg.count = 1;
        dog.count = 2;
        cat.count = 3;

        ArrayList<Word> words  = new ArrayList<Word>();

        words.add(greg);
        words.add(dog);
        words.add(cat);

        app.printOutput(words);

    }

    @Test
    @DisplayName("testFindBigWordLen")
    void findBigWordLen() {

        Word greg = new Word();
        Word dog = new Word();
        Word cat = new Word();

        greg.setName("greg");
        dog.setName("dog");
        cat.setName("cat");
        greg.count = 1;
        dog.count = 2;
        cat.count = 3;

        ArrayList<Word> words  = new ArrayList<Word>();

        words.add(greg);
        words.add(dog);
        words.add(cat);

        assertEquals(4, app.findBigWordLen(words));

    }
}