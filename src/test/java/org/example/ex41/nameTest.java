package org.example.ex41;

import junit.framework.TestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class nameTest extends TestCase {



    @Test
    @DisplayName("testGetLastFirst")
    void getLastFirst() {

        name testName = new name();

        testName.setLastFirst("Kennison, Greg");

        assertEquals("Kennison, Greg", testName.getLastFirst());

    }

    @Test
    @DisplayName("testSetLastFirst")
    void setLastFirst() {

        name testName = new name();

        testName.setLastFirst("Kennison, Greg");

        assertEquals("Kennison, Greg", testName.getLastFirst());

    }
}