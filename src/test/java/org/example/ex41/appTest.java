package org.example.ex41;

import junit.framework.TestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class appTest extends TestCase {

    String fileDir = System.getProperty("user.dir");
    String path = fileDir + "\\src\\main\\java\\org\\example\\ex41\\exercise41_input.txt";
    File file = new File(path);
    Scanner sc = new Scanner(file);

    // formality for file call
    public appTest() throws FileNotFoundException {
    }

    // couldn't figure out how to test main

    @Test
    @DisplayName("testCreateList")
    public void testCreateList() {

        ArrayList<name> names = new ArrayList<name>();

        names = app.createList(sc);

        assertEquals("Ling, Mai", names.get(0).getLastFirst());
        assertEquals("Johnson, Jim", names.get(1).getLastFirst());
        assertEquals("Zarnecki, Sabrina", names.get(2).getLastFirst());
        assertEquals("Jones, Chris", names.get(3).getLastFirst());
        assertEquals("Jones, Aaron", names.get(4).getLastFirst());
        assertEquals("Swift, Geoffrey", names.get(5).getLastFirst());
        assertEquals("Xiong, Fong", names.get(6).getLastFirst());

    }

    @Test
    @DisplayName("testAddNameToList")
    public void testAddNameToList() {

        ArrayList<name> names = new ArrayList<name>();

        name greg = new name();
        name walt = new name();
        name john = new name();
        name chris = new name();

        greg.setLastFirst("Kennison, Greg");
        walt.setLastFirst("Disney, Walt");
        john.setLastFirst("Kennedy, John");
        chris.setLastFirst("Johnson, Chris");

        names.add(greg);
        names.add(walt);
        names.add(john);
        names.add(chris);

        assertEquals(4, names.size());

        app.addNameToList("Soprano, Tony", names);

        assertEquals(5, names.size());
        assertEquals("Soprano, Tony", names.get(4).getLastFirst());

    }

    @Test
    @DisplayName("testSortList")
    public void testSortList() {

        ArrayList<name> names = new ArrayList<name>();

        name greg = new name();
        name walt = new name();
        name john = new name();
        name chris = new name();

        greg.setLastFirst("Kennison, Greg");
        walt.setLastFirst("Disney, Walt");
        john.setLastFirst("Kennedy, John");
        chris.setLastFirst("Johnson, Chris");

        names.add(greg);
        names.add(walt);
        names.add(john);
        names.add(chris);

        ArrayList<name> sorted = app.sortList(names);

        assertEquals(names.get(0).getLastFirst(), "Disney, Walt");
        assertEquals(names.get(1).getLastFirst(), "Johnson, Chris");
        assertEquals(names.get(2).getLastFirst(), "Kennedy, John");
        assertEquals(names.get(3).getLastFirst(), "Kennison, Greg");


    }

    @Test
    @DisplayName("testWriteToFile")
    public void testWriteToFile() {

        ArrayList<name> names = new ArrayList<name>();

        name greg = new name();
        name walt = new name();
        name john = new name();
        name chris = new name();

        greg.setLastFirst("Kennison, Greg");
        walt.setLastFirst("Disney, Walt");
        john.setLastFirst("Kennedy, John");
        chris.setLastFirst("Johnson, Chris");

        names.add(greg);
        names.add(walt);
        names.add(john);
        names.add(chris);

        app.writeToFile(names);
    }

}