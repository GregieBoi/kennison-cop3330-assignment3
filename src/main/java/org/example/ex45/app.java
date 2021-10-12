/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//app
    //Void main()
        //Scan in file
        //Set inputTxt to return of createInput(sc)
        //Set outputTxt to return of changeUtilize(inputTxt)
        //Call printOutput(outputTxt)
    //EndMain
    //ArrayList<String> createInput(Scanner sc)
        //Init input
        //While sc.hasNextLine()
            //Set next to sc.nextLine()
            //Add next to input list
        //EndWhile
        //Return input
    //EndCreateInput
    //ArrayList<String> changeUtilize(ArrayList<String> input)
        //For size of input
            //If input at i contains "utilize"
                //Replace "utilize" to "use"
            //EndIf
        //EndFor
        //Return input
    //EndChangeUtilize
    //Void printOutput(ArrayList<String> output)
        //Try
            //Init writer to path
            //For output size
                //Write output.get(i) + "\n"
            //EndFor
            //Close writer
            //Print "Successfully wrote to file"
        //EndTry
        //Catch IOException e
            //Print "An error occurred."
            //Call e.printStackTrace
        //EndCatch
    //EndPrintOutput
    //String getFileOut()
        //Print "What would you like to name the output file? "
        //Scan input
        //Set path to input plus desired destination
        //Return path
    //EndGetFileOut
//EndApp

public class app {

    public static void main(String[] args) throws FileNotFoundException { //main

        String fileDir = System.getProperty("user.dir"); //open input file
        String path = fileDir + "\\src\\main\\java\\org\\example\\ex45\\exercise45_input.txt";
        File file = new File(path);
        Scanner sc = new Scanner(file);

        ArrayList<String> inputTxt = createInput(sc); //set inputTxt to createInput

        ArrayList<String> outputTxt = changeUtilize(inputTxt); //set outputTxt to changeUtilize

        printOutput(outputTxt); //pass to printOutput

    }

    public static ArrayList<String> createInput(Scanner sc) { //returns arraylist of lines of input file

        ArrayList<String> input = new ArrayList<String>(); //initialize arraylist

        while (sc.hasNextLine()) { //while next line

            String next = sc.nextLine(); //set next to next line then add next to input

            input.add(next);
        }

        return input; //return input

    }

    public static ArrayList<String> changeUtilize(ArrayList<String> input) { //changes all utilizes to use in parameter and returns new arraylist

        for (int i = 0; i < input.size(); i++) { //for size of input

            if (input.get(i).contains("utilize")) //if word contains utilize chance utilize to use
                input.set(i, input.get(i).replace("utilize", "use"));

        }

        return input; //return input

    }

    public static void printOutput(ArrayList<String> output) { //writes output to output file

        try { //try

            FileWriter writer = new FileWriter(getFileOut()); //initialize writer

            for (int i = 0; i < output.size(); i++) //for size of output print output at i
                writer.write(output.get(i) + "\n");

            writer.close(); //close write
            System.out.println("Successfully wrote to file"); //print confirmation
        }
        catch (IOException e) { //catch

            System.out.println("An error occurred."); //print error and call printStackTrace
            e.printStackTrace();
        }

    }

    public static String getFileOut() { //returns String path of file destination

        Scanner sc = new Scanner(System.in); //open scanner, prompt input
        System.out.print("What would you like to name the output file? ");

        String fileDir = System.getProperty("user.dir"); //find current directory and add input to end
        String path = fileDir + "\\src\\main\\java\\org\\example\\ex45\\" + sc.next();

        return path; //return path

    }

}
