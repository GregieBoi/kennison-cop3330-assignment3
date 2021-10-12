package org.example.ex46;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    @DisplayName("testSetName")
    void setName() {

        Word testWord = new Word();

        testWord.setName("Greg");

        assertEquals("Greg", testWord.getWord());

    }

    @Test
    @DisplayName("testGetName")
    void getName() {

        Word testWord = new Word();

        testWord.setName("Greg");

        assertEquals("Greg", testWord.getWord());

    }

    @Test
    @DisplayName("testIncrementCount")
    void incrementCount() {

        Word testWord = new Word();

        testWord.incrementCount();

        assertEquals(1, testWord.getCount());

    }

    @Test
    @DisplayName("testGetCount")
    void getCount() {

        Word testWord = new Word();

        assertEquals(0, testWord.getCount());

    }
}