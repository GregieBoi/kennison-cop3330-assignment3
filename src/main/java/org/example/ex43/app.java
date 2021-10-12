/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex43;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

//app
    //Void main()
        //Set website to createWebsite()
        //Call createDirectory(website)
    //EndMain
    //Website createWebsite()
        //Init website
        //Call website.setName
        //Call website.setAuthor
        //Call website.setJs
        //Call website.setCSS
        //Return website
    //EndCreateWebsite
    //Void createDirectory(Website website)
        //Set dir to file path
        //Call dir.mkdirs()
        //Print "Created ./website/" + website.name"
        //If website.javaScript
            //Call createJs(website, path)
        //EndIf
        //If website.CSS
            //Call createCSS(website, path)
        //EndIf
    //EndCreateDirectory
    //Void createIndex(Website website, String path)
        //Set path to path + "\\index.html"
        //Try
            //Init writer with path
            //Write "<!doctype html>\n" +
//                    "<html>\n" +
//                    "  <head>\n" +
//                    "<meta " + website.getAuthor() + ">\n" +
//                    "    <title>" + website.getName() + "</title>\n" +
//                    "  </head>\n" +
//                    "  <body>\n" +
//                    "    <p>This is ur website.</p>\n" +
//                    "  </body>\n" +
//                    "</html>"
            //Close write
        //EndTry
        //Catch IOException e
            //Call e.printStackTrace()
        //EndCatch
        //Print "Created ./website/" + website.name + "index.html"
    //EndCreateIndex
    //Void createJS(Website website, String path)
        //Set path to path + "\\js"
        //Init dir with path
        //Call dir.mkdirs()
        //Print"Created ./website/" + website.name + "/js/"
    //EndCreateJS
    //Void createCSS(Website website, String path)
        //Set path to path + "\\css"
        //Init dir with path
        //Call dir.mkdirs()
        //Print"Created ./website/" + website.name + "/css/"
    //EndCreateCSS
//EndApp

public class app {

    public static void main(String[] args) { //main

        Website website = createWebsite(); //set website to createWebsite()

        createDirectory(website); //pass to createDirectory

    }

    public static Website createWebsite() { //creates a website class

        Website website = new Website(); //initialize website and set its values
        website.setName();
        website.setAuthor();
        website.setJS();
        website.setCSS();

        return website; //return website

    }

    public static void createDirectory(Website website) { //creates the file directory

        String fileDir = System.getProperty("user.dir"); //create file in proper spot
        String path = fileDir + "\\src\\main\\java\\org\\example\\ex43\\website\\" + website.getName();
        File dir = new File(path);

        dir.mkdirs(); //create directory
        System.out.println("Created ./website/" + website.getName()); //print confirmation

        createIndex(website, path); //pass to create index

        if (website.getJS()) //if js is true pass to createJS
            createJS(website, path);
        if (website.getCSS()) //if css is true pass to createCSS
            createCSS(website, path);

    }

    public static void createIndex(Website website, String path) { //creates the index file

        path = path + "\\index.html"; //update path

        try {

            FileWriter writer = new FileWriter(path); //create file path

            writer.write("<!doctype html>\n" + //write to file
                    "<html>\n" +
                    "  <head>\n" +
                    "<meta charset=\"" + website.getAuthor() + "\">\n" +
                    "    <title>" + website.getName() + "</title>\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "    <p>This is ur website.</p>\n" +
                    "  </body>\n" +
                    "</html>");

            writer.close(); //close writer

        }
        catch (IOException e) { //if file not found
            e.printStackTrace();
        }


        System.out.println("Created ./website/" + website.getName() + "index.html"); //print confirmation

    }

    public static void createJS(Website website, String path) { //creates js folder

        path = path + "\\js"; //update path and create file
        File dir = new File(path);

        dir.mkdirs(); //make dir
        System.out.println("Created ./website/" + website.getName() + "/js/"); //print confirmation

    }

    public static void createCSS(Website website, String path) { //creates css folder

        path = path + "\\css"; //update path and create file
        File dir = new File(path);

        dir.mkdirs(); //make directory
        System.out.println("Created ./website/" + website.getName() + "/css/"); //print confirmation

    }

}

//Website
    //Init name
    //Init author
    //Init javaScript
    //Init css
    //Void setName()
        //Init input
        //Print "Site name: "
        //Set name to input.next()
    //EndSetName
    //String getName()
        //Return name
    //EndGetName
    //Void setAuthor()
        //Init input
        //Print "Author: "
        //Set author to input.next()
    //EndSetAuthor
    //String getAuthor()
        //Return author
    //EndGetAuthor
    //Void setJS()
        //Init input
        //Print "Do you want a folder for JavaScript? "
        //Set yesNo to input.next()
        //If yesNo equals "y"
            //Set javaScript to true
        //EndIf
        //Else
            //Set javaScript to false
        //EndElse
    //EndSetJS
    //Boolean getJS()
        //Return javaScript
    //EndGetJS
    //Void setCSS()
        //Init input
        //Print "Do you want a folder for CSS? "
        //Set yesNo to input.next()
        //If yesNo equals "y"
            //Set css to true
        //EndIf
        //Else
            //Set css to false
        //EndElse
    //EndSetCSS
    //Boolean getCSS()
        //Return css
    //EndGetCSS
//EndWebsite

class Website {

    String name; //variable declarations
    String author;
    boolean javaScript, css;

    public void setName() { //sets name to input

        Scanner input = new Scanner(System.in); //open scanner, input prompt, set name to input
        System.out.print("Site name: ");
        name = input.next();

    }

    public String getName() { //fetches name

        return name; //return name

    }

    public void setAuthor() { //sets author to input

        Scanner input = new Scanner(System.in); //open scanner, input prompt, set author to input
        System.out.print("Author: ");
        author = input.nextLine();

    }

    public String getAuthor() { //fetches author

        return author; //return author

    }

    public void setJS() { //sets js based on input

        Scanner input = new Scanner(System.in); //open scanner, input prompt, set yesNo to input
        System.out.print("Do you want a folder for JavaScript? ");
        String yesNo = input.next();

        if (yesNo.equals("y")) //if yesNo y set to true
            javaScript = true;
        else //else set to false
            javaScript = false;

    }

    public boolean getJS() { //fetches js

        return javaScript; //return js

    }

    public void setCSS() { //sets css based off input

        Scanner input = new Scanner(System.in); //open scanner, prompt input, set yesNo to input
        System.out.print("Do you want a folder for CSS? ");
        String yesNo = input.next();

        if (yesNo.equals("y")) //if yesNo yes set true
            css = true;
        else //else set false
            css = false;

    }

    public boolean getCSS() { //fetches css

        return css; //return css

    }

}


