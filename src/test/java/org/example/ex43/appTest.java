package org.example.ex43;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    @DisplayName("testCreateWebsite")
    void createWebsite() {

        //trouble making test for function requiring user input

    }

    @Test
    @DisplayName("testCreateDirectory")
    void createDirectory() {

        Website website = new Website();
        website.name = "mySite";
        website.author = "JoeShmo";
        website.javaScript = true;
        website.css = true;

        app.createDirectory(website);

        String fileDir = System.getProperty("user.dir");
        String path = fileDir + "\\src\\main\\java\\org\\example\\ex43\\website\\" + website.getName();
        File dir = new File(path);

        Path path1 = Paths.get(path);

        assertTrue(Files.exists(path1));

    }

    @Test
    @DisplayName("testCreateIndex")
    void createIndex() {

        Website website = new Website();
        website.name = "mySite";
        website.author = "JoeShmo";
        website.javaScript = true;
        website.css = true;

        String fileDir = System.getProperty("user.dir");
        String path = fileDir + "\\src\\main\\java\\org\\example\\ex43\\website\\" + website.getName();

        app.createIndex(website, path);

        path = path + "\\index.html";

        Path path1 = Paths.get(path);

        assertTrue(Files.exists(path1));

    }

    @Test
    @DisplayName("testCreateJS")
    void createJS() {

        Website website = new Website();
        website.name = "mySite";
        website.author = "JoeShmo";
        website.javaScript = true;
        website.css = true;

        String fileDir = System.getProperty("user.dir");
        String path = fileDir + "\\src\\main\\java\\org\\example\\ex43\\website\\" + website.getName();

        app.createJS(website, path);

        path = path + "\\js";

        Path path1 = Paths.get(path);

        assertTrue(Files.exists(path1));

    }

    @Test
    @DisplayName("testCreateCSS")
    void createCSS() {

        Website website = new Website();
        website.name = "mySite";
        website.author = "JoeShmo";
        website.javaScript = true;
        website.css = true;

        String fileDir = System.getProperty("user.dir");
        String path = fileDir + "\\src\\main\\java\\org\\example\\ex43\\website\\" + website.getName();

        app.createCSS(website, path);

        path = path + "\\css";

        Path path1 = Paths.get(path);

        assertTrue(Files.exists(path1));

    }
}