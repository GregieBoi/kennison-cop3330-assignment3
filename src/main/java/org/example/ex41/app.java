/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//app
    //Void main()
        //Scan in input file
        //Set ArrayList<name> names to createList
        //Call sortList(names)
        //Set ArrayList<name> sorted_names to sortList
        //Call writeToFile(sorted_names);
    //EndMain
    //ArrayList<name> createList(Scanner sc)
        //Initialize ArrayList<name> names
        //While sc hasNextLine
            //call addNameToList(sc.nextLine(), names)
        //EndWhile
        //return names
    //EndCreateList
    //Void addNameToList(String cur_name, ArrayList<name> names)
        //Initialize new_name
        //Set new_name.last_first to cur_name
        //Add new_name to names
    //EndAddNameToList
    //ArrayList<name> sortList(ArrayList<name> names)
        //Init temp
        //For size of names
            //For size of names
                //if lastFirst at i comes after lastFirst at j alphabetically
                    //set temp to lastFirst at i
                    //set lastFirst at i to lastFirst at j
                    //set lastFirst at j to temp
                //EndIf
            //EndFor
        //EndFor
    //EndSortList
    //void writeToFile(ArrayList<name> sorted_names)
        //Try
            //Set writer to output file
            //Write "Total of " + size of sorted_names + " names\n-----------------\n"
            //For size of sorted_names
                //Write names(i).last_first
            //EndFor
            //Close writer
            //Print "Successfully wrote to file"
        //EndTry
        //Catch IOException e
            //Print "An error occurred."
            //Call e.printStackTrace
        //EndCatch
//EndApp

public class app {

    public static void main(String[] args) throws FileNotFoundException { //checks if fileNotFound

        String fileDir = System.getProperty("user.dir"); //set fileDir to user.dir
        String path = fileDir + "\\src\\main\\java\\org\\example\\ex41\\exercise41_input.txt"; //set path to fileDir + extension
        File file = new File(path); //create new file with path
        Scanner sc = new Scanner(file); //set sc to scan file

        ArrayList<name> names = createList(sc); //set names to return of createlist

        ArrayList<name> sorted_names = sortList(names); //set sorted_names to return of sortList

        writeToFile(sorted_names); //pass sorted_list to writeToFile

    }

    public static ArrayList<name> createList(Scanner sc) { //creates and fills arraylist with initial values

        ArrayList<name> names = new ArrayList<name>(); //create arraylist names

        while (sc.hasNextLine()) { //check if next line in file

            addNameToList(sc.nextLine(), names); //pass nextline and names to addNameToList
        }

        return names; //return names
    }

    public static void addNameToList(String cur_name, ArrayList<name> names) { //adds name to list

        name new_name = new name(); //create new_name
        new_name.setLastFirst(cur_name); //set new_name's lastFirst to curName
        names.add(new_name); //add new_name to arraylist
    }

    public static ArrayList<name> sortList(ArrayList<name> names) { //sorts list alphabetically


        String temp; //initialize temp
        for (int i = 0; i < names.size(); i++) { //for names.size()
            for (int j = 0; j < names.size(); j++) { //for names.size()

                if (names.get(i).getLastFirst().compareTo(names.get(j).getLastFirst()) < 0) { //check if name at i is after name at j alphabetically

                    temp = names.get(i).getLastFirst(); //set temp to names at i
                    names.get(i).setLastFirst(names.get(j).getLastFirst()); //swap names at i to names at j
                    names.get(j).setLastFirst(temp); //set names at j to temp
                }
            }
        }

        return names; //return names
    }

    public static void writeToFile(ArrayList<name> sorted_names) { //writes output to file

        try { //try

            String fileDir = System.getProperty("user.dir"); //set fileDir to user.dir
            String path = fileDir + "\\src\\main\\java\\org\\example\\ex41\\exercise41_output.txt"; //set path to fileDir + path

            FileWriter writer = new FileWriter(path); //Set writer to path

            writer.write("Total of " + sorted_names.size() + " names\n" +
                             "-----------------\n"); //print table heading

            for (int i = 0; i < sorted_names.size(); i++) //for size of arraylist
                writer.write(sorted_names.get(i).getLastFirst() + "\n"); //write sorted_names at i to file

            writer.close(); //close writer
            System.out.println("Successfully wrote to file"); //print confirmation
        }
        catch (IOException e) { //enter catch

            System.out.println("An error occurred."); //print error
            e.printStackTrace(); //call printStackTrace
        }
    }
}

//Name
    //Init lastFirst
    //String getLastFirst()
        //Return lastFirst
    //EndGetLastFirst
    //Void setLastFirst(String names)
        //Set lastFirst to names
    //EndSetLastFirst
//EndName

class name {

    String lastFirst; //initialize lastFirst

    public String getLastFirst() { //fetches lastFirst for name

        return lastFirst; //return lastFirst

    }

    public void setLastFirst(String names) { //takes in string and sets lastFirst to it

        lastFirst = names; //set lastFirst equal to names

    }

}


