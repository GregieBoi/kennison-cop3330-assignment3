/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//app
    //Void main()
        //Scan in file
        //Set ArrayList employees to createList(sc)
        //Call writeToFile(employees)
    //EndMain
    //ArrayList<Employee> createList(Scanner sc)
        //Init ArrayList employees
        //While sc has next line
            //Call addEmployee(employees, sc.nextLine())
        //EndWhile
        //Return employees
    //EndCreateList
    //Void addEmployee(ArrayList<Employee> employees, String cur_employee)
        //Init Employee new_employee
        //Set char[] new_hire to cur_employee converted to char[]
        //Set counter, firstComma, secondComma all to zero
        //For length of new_hire
            //If new_hire at i is ','
                //Set firstComma to i
                //Increment counter
            //EndIf
            //Else
                //Set secondComma to i
            //EndElse
        //EndFor
        //Set new_employee lastname to parseCharArr(0, firstComma - 1, new_hire)
        //Set new_employee firstname to parseCharArr(firstComma + 1, secondComma - 1, new_hire)
        //Set new_employee salary to parseCharArr(secondComma + 1, new_hire.length - 1, new_hire)
        //Add new_employee to employees
    //EndAddEmployee
    //String parseCharArr(int start, int end, char[] cur_employee)
        //Set counter to start
        //Set length to (end - start) + 1
        //Init part to char[length]
        //For length
            //Set part at i to cur_employee at counter
            //Increment counter
        //EndFor
        //Return part converted to String
    //EndParseCharArr
    //Void printOutput(ArrayList<Employee> employees)
        //Try
            //Set writer to output file
            //Write "Last      First     Salary\n--------------------------\n"
            //For size of employees
                //Write formatted employee at i lastname, firstname, salary
            //EndFor
            //Close writer
            //Print "Successfully wrote to file"
        //EndTry
        //Catch IOException e
            //Print "An error occurred."
            //Call e.printStackTrace
        //EndCatch
    //EndPrintOutput
//EndApp

public class app {

    public static void main(String[] args) throws FileNotFoundException { //main

        String fileDir = System.getProperty("user.dir"); //find current directory
        String path = fileDir + "\\src\\main\\java\\org\\example\\ex42\\exercise42_input.txt"; //update path to specific file
        File file = new File(path); //set file to path
        Scanner sc = new Scanner(file); //scan file

        ArrayList<Employee> employees = createList(sc); //set employees to create list

        printOutput(employees); //pass to printOutput
    }

    public static ArrayList<Employee> createList(Scanner sc) { //creates the arraylist employees

        ArrayList<Employee> employees = new ArrayList<Employee>(); //initialize list

        while (sc.hasNextLine()) { //check if file has next line

            addEmployee(employees, sc.nextLine()); //pass to addEmployee
        }

        return employees; //return employees
    }

    public static void addEmployee(ArrayList<Employee> employees, String cur_employee) { //adds employee to list

        Employee new_employee = new Employee(); //initialize new employee

        char[] new_hire = cur_employee.toCharArray(); //convert current employee to character array

        int counter = 0, firstComma = 0, secondComma = 0; //set values to 0

        for (int i = 0; i < new_hire.length; i++) { //length of new_hire
            if (new_hire[i] == ',') { //if at i is a comma
                if (counter == 0) { //if counter is 0
                    firstComma = i; //set firstcomma to i
                    counter++; //update counter
                }
                else //else
                    secondComma = i; //set secondcomma to i
            }
        }

        new_employee.setLastName(parseCharArr(0, firstComma - 1, new_hire)); //setLastName to parseCharArr at corresponding values
        new_employee.setFirstName(parseCharArr(firstComma + 1, secondComma - 1, new_hire)); //setFirstName to parseCharArr at corresponding values
        new_employee.setSalary(parseCharArr(secondComma + 1, new_hire.length - 1, new_hire)); //setSalary to parseCharArr at corresponding values

        employees.add(new_employee); //add new employee to list

    }

    public static String parseCharArr(int start, int end, char[] cur_employee) { //separates portion of arr and return it as string


        int counter = start; //variable declarations
        int length = (end - start) + 1;

        char[] part = new char[length]; //initialize part

        for (int i = 0; i < length; i++) { //for length of portion
            part[i] = cur_employee[counter]; //add char at i to part
            counter++; //update counter
        }

        return String.valueOf(part); //return part converted to string

    }

    public static void printOutput(ArrayList<Employee> employees) { //prints list in table format

            System.out.println("Last      First     Salary\n" +
                               "--------------------------"); //print table heading

            for (int i = 0; i < employees.size(); i++) //for size of employees
                System.out.format("%-10s%-10s%-6s\n",
                        employees.get(i).getLastName(), employees.get(i).getFirstName(), employees.get(i).getSalary()); //print values of employees at i

    }

}

//Employee
    //Init firstName
    //Init lastName
    //Init salary
    //Void setFirstName(String fName)
        //Set firstName to fName
    //EndSetFirstName
    //String getFirstName()
        //Return firstName
    //EndGetFirstName
    //Void setLastName(String lName)
        //Set lastName to lName
    //EndSetLastName
    //String getLastName()
        //Return LastName
    //EndGetLastName
    //Void setSalary(String pay)
        //Set salary to pay
    //EndSetSalary
    //String getSalary()
        //Return Salary
    //EndGetSalary
//EndEmployee

class Employee {

    //variable declarations
    String firstName;
    String lastName;
    String salary;

    public void setFirstName(String fName) { //sets first name to provided string

        firstName = fName; //set firstname to fname

    }

    public String getFirstName() { //fetches firstname

        return firstName; //return firstname

    }

    public void setLastName(String lName) { //sets lastname to provided string

        lastName = lName; //set lastName to lname

    }

    public String getLastName() { //fetches lastname

        return lastName; //return lastname

    }

    public void setSalary(String pay) { //sets salary to provided string

        salary = pay; //set salary to pay

    }

    public String getSalary() { //fetches salary

        return salary; //return salary

    }

}
