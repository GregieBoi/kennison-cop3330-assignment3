/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//app
    //Void main()
        //Open file
        //Set words to return of createInput(sc)
        //Call setWords(words)
        //Call printOutput(words)
    //EndMain
    //ArrayList<Word> createInput(Scanner sc)
        //Init words
        //While sc.hasNext()
            //Set next to sc.next()
            //Set counter to 0
            //For size of words
                //If next equals words at i
                    //Call incrementCount()
                    //Increment counter
                //EndIf
            //EndFor
            //If counter equals 0
                //Init newWord
                //Call newWord.setName(next)
                //Call newWord.incrementCount()
                //Add newWord to words
            //EndIf
        //EndWhile
        //Return words
    //EndCreateInput
    //Void sortWords(ArrayList<Word> words)
        //For size of words
            //For size of words
                //If words at i greater than words at j
                    //Set tmp to words.get(i)
                    //Set words(i) to words(j)
                    //Set words(j) to tmp
                //EndIf
            //EndFor
        //EndFor
    //EndSortWords
    //Void printOutput(ArrayList<Word> words)
        //Set bigWordLen to return of findBigWordLen(words)
        //For size of words
            //Print words.get(i).word + ": "
            //For bigWordLen - words.get(i).word.length()
                //Print " "
            //EndFor
            //For count of words at i
                //Print "*"
            //EndFor
            //Print "\n"
        //EndFor
    //EndPrintOutput
    //Int findBigWordLen(ArrayList<Word> words)
        //Set bigWordLen to 0
        //For size of words
            //If length of word at i is greater than bigWordLen
                //Set bigWordLen to length of word at i
            //EndIf
        //EndFor
        //Return bigWordLen
    //EndFindBigWordLen
//EndApp

public class app {

    public static void main(String[] args) throws FileNotFoundException { //main

        String fileDir = System.getProperty("user.dir"); //open file and scan
        String path = fileDir + "\\src\\main\\java\\org\\example\\ex46\\exercise46_input.txt";
        File file = new File(path);
        Scanner sc = new Scanner(file);

        ArrayList<Word> words = createInput(sc); //set words to createInput

        sortWords(words); //pass to sortWords

        printOutput(words); //pass to printOutput

    }

    public static ArrayList<Word> createInput(Scanner sc) { //takes input and file and convert to ArrayList

        ArrayList<Word> words  = new ArrayList<Word>(); //Initialize words

        while (sc.hasNext()) { //while file has next line

            String next = sc.next(); //set next to sc.next

            int counter = 0; //set counter to 0

            for (int i = 0; i < words.size(); i++) { //size of words

                if (next.equals(words.get(i).getWord())) { //if next equals words at i up word.count and counter

                    words.get(i).incrementCount();
                    counter++;

                }

            }

            if (counter == 0) { //if counter equals 0 create new word

                Word newWord = new Word();
                newWord.setName(next);
                newWord.incrementCount();
                words.add(newWord);

            }

        }

        return words; //return arraylist of words

    }

    public static void sortWords(ArrayList<Word> words) { //sorts words from highest count to lowest count

        for (int i = 0; i < words.size(); i++) { // for size of words
            for (int j = 0; j < words.size(); j++) { // for size of words

                if (words.get(i).count > words.get(j).count) { //if count at i is greater than count at j

                    Word tmp = words.get(i); //set tmp to word at i
                    words.set(i, words.get(j)); //swap word at i with word j
                    words.set(j, tmp); //set word at j to tmp

                }

            }
        }

    }

    public static void printOutput(ArrayList<Word> words) { //prints table graph

        int bigWordLen = findBigWordLen(words); //set bigWordLen to findBigWordLen

        for (int i = 0; i < words.size(); i++) { //for size of words

            System.out.print(words.get(i).getWord() + ": "); //row header

            for (int j = 0; j < bigWordLen - words.get(i).getWord().length(); j++) //for length of biggest word minus current word
                System.out.print(" "); //print space

            for (int j = 0; j < words.get(i).getCount(); j++) //for size of words
                System.out.print("*"); //print *

            System.out.println(""); //print new line
        }

    }

    public static int findBigWordLen(ArrayList<Word> words) { //takes in words and finds length of biggest word

        int bigWordLen = 0; //set bigWordLen to 0

        for (int i = 0; i < words.size(); i++) //for size of words
            if (words.get(i).getWord().length() > bigWordLen) //if length of word at i is bigger than bigWordLen set BigWordLen to length of word at i
                bigWordLen = words.get(i).getWord().length();

        return bigWordLen;

    }

}

//Word
    //Init word
    //Set count to 0
    //Void setName(String name)
        //Set word to name
    //EndSetName
    //String getName()
        //Return name
    //EndGetName
    //Void incrementCount()
        //Increment count
    //EndIncrementCount
    //Int getCount()
        //Return count
    //EndGetCount
//EndWord

class Word {

    String word;
    int count = 0;

    public void setName(String name) {

        word = name;

    }

    public String getWord() {

        return word;

    }

    public void incrementCount() {

        count++;

    }

    public int getCount() {

        return count;

    }

}
