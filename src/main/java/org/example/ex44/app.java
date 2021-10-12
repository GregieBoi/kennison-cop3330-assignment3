/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example.ex44;

import com.google.gson.Gson;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

//app
    //void main()
        //Set products to convertToJava()
        //Set product to productSearch(products)
        //Call printOutput(product)
    //EndMain
    //Products convertToJava()
        //Read file
        //Set Json to file txt
        //Init gson
        //Return Json converted to Products
    //EndConvertToJava
    //Product productSearch(Products products)
        //Init sc
        //Set found to -1
        //While found equals -1
            //Print "What is the product name? "
            //Set found to checkInventory(sc.next(), products)
        //EndWhile
        //Return products.getProducts() at found
    //EndProductSearch
    //Int checkInventory(String search, Products products)
        //For length of products array
            //If search equals name of products at i
                //Return i
            //EndIf
        //EndFor
        //Print "Sorry, that product was not found in our inventory."
        //Return -1
    //EndCheckInventory
    //Void printOutput(Product product)
        //Print "Name: " product name\n
        //  "Price: " product price\n
        //  "Quantity: " product quantity
    //EndPrintOutput
//EndApp

public class app {

       public static void main(String[] args) throws FileNotFoundException { //main

        Products products = convertToJava(); //set products to converToJava()

        Product product = productSearch(products); // set product to productSearch(products)

        printOutput(product); //pass to printOutput(product)

    }

    public static Products convertToJava() throws FileNotFoundException { //converts json file to java objects and returns products

        String fileDir = System.getProperty("user.dir"); //initialize file path and open scanner
        String path = fileDir + "\\src\\main\\java\\org\\example\\ex44\\exercise44_input.json";
        File file = new File(path);
        Scanner sc = new Scanner(file);

        String Json = ""; //Set json to empty

        while (sc.hasNextLine()) //while next line set Json to Json + nextline
            Json = Json + sc.nextLine();

        Gson gson = new Gson(); //initialize new gson

        return gson.fromJson(Json, Products.class); //return Json converted to objects

    }

    public static Product productSearch(Products products) { //searches products and returns product

        Scanner sc = new Scanner(System.in); //initialize scanner

        int found = -1; //set found to -1

        while (found == -1) { //while found equals -1 prompt for product and set found to checkInventory

            System.out.print("What is the product name? ");

            found = checkInventory(sc.next(), products);
        }

        return products.getProducts()[found]; //return specific product

    }

    public static int checkInventory(String search, Products products) { //cycles through products and returns index of searched product if found

        for (int i = 0; i < products.getProducts().length; i++) { //for length of products

            if (search.equals(products.getProducts()[i].name)) //if product is found return i
                return i;

        }

        System.out.println("Sorry, that product was not found in our inventory."); //print invalid input
        return -1; //return -1

    }

    public static void printOutput(Product product) { //prints data of product

        DecimalFormat df = new DecimalFormat("0.00"); //initialize format

        System.out.println("Name: " + product.getName() // print data in format
                + "\nPrice: " + df.format(product.getPrice())
                + "\nQuantity: " + product.getQuantity());

    }

}

//Products
    //Init products array
    //Product[] getProducts()
        //Return products
    //EndGetProducts
    //Void setProducts(Product[] productArr)
        //Set products to productArr
    //EndSetProducts
//EndProducts

class Products {

    Product[] products; //initialize products

    public Product[] getProducts() { // fetches products

        return products; //return products

    }

    public void setProducts(Product[] productArr) { //sets products to parameter

        products = productArr; //set products to productArr

    }

}

//Product
    //Init name
    //Init price
    //Init quantity
    //String getName
        //Return name
    //EndGetName
    //Void setName(String product)
        //Set name to product
    //EndSetName
    //Double getPrice()
        //Return price
    //EndGetPrice
    //Void setPrice(double tag)
        //Set price to tag
    //EndSetPrice
    //Int getQuantity()
        //Return quantity
    //EndGetQuantity
    //Void setQuantity(int amount)
        //Set quantity to amount
    //EndSetQuantity
//EndProduct

class Product {

    String name; //variable declarations
    double price;
    int quantity;

    public String getName() { //fetches name

        return name; //return name

    }

    public void setName(String product) { //sets name to parameter

        name = product; //set name to product

    }

    public double getPrice() { //fetches price

        return price; //return price

    }

    public void setPrice(double tag) { //sets price to parameter

        price = tag; //set price to tag

    }

    public int getQuantity() { //fetches quantity

        return quantity; //return quantity

    }

    public void setQuantity(int amount) { //sets quantity to parameter

        quantity = amount; //set quantity to amount

    }

}
