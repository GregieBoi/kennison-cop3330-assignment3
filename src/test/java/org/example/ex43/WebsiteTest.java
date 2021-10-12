package org.example.ex43;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteTest {

    @Test
    void setName() {

        //trouble creating test for methods that require user input

    }

    @Test
    @DisplayName("testGetName")
    void getName() {

        Website website = new Website();
        website.name = "mySite";
        website.author = "JoeShmo";
        website.javaScript = true;
        website.css = true;

        assertEquals("mySite", website.getName());

    }

    @Test
    void setAuthor() {

        //trouble creating test for methods that require user input

    }

    @Test
    @DisplayName("testGetAuthor")
    void getAuthor() {

        Website website = new Website();
        website.name = "mySite";
        website.author = "JoeShmo";
        website.javaScript = true;
        website.css = true;

        assertEquals("JoeShmo", website.getAuthor());
    }

    @Test
    void setJS() {

        //trouble creating test for methods that require user input

    }

    @Test
    @DisplayName("testGetJS")
    void getJS() {

        Website website = new Website();
        website.name = "mySite";
        website.author = "JoeShmo";
        website.javaScript = true;
        website.css = true;

        assertEquals(true, website.getJS());

    }

    @Test
    void setCSS() {

        //trouble creating test for methods that require user input

    }

    @Test
    @DisplayName("testGetCSS")
    void getCSS() {

        Website website = new Website();
        website.name = "mySite";
        website.author = "JoeShmo";
        website.javaScript = true;
        website.css = true;

        assertEquals(true, website.getCSS());

    }
}