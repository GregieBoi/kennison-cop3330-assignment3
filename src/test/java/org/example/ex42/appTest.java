package org.example.ex42;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class appTest {

    String fileDir = System.getProperty("user.dir");
    String path = fileDir + "\\src\\main\\java\\org\\example\\ex42\\exercise42_input.txt";
    File file = new File(path);
    Scanner sc = new Scanner(file);

    // for sc
    appTest() throws FileNotFoundException {
    }

    @Test
    @DisplayName("testCreateList")
    void createList() {

        ArrayList<Employee> employees = app.createList(sc);

        assertEquals("LingMai55900", employees.get(0).getLastName() + employees.get(0).getFirstName() + employees.get(0).getSalary());
        assertEquals("JohnsonJim56500", employees.get(1).getLastName() + employees.get(1).getFirstName() + employees.get(1).getSalary());
        assertEquals("JonesAaron46000", employees.get(2).getLastName() + employees.get(2).getFirstName() + employees.get(2).getSalary());
        assertEquals("JonesChris34500", employees.get(3).getLastName() + employees.get(3).getFirstName() + employees.get(3).getSalary());
        assertEquals("SwiftGeoffrey14200", employees.get(4).getLastName() + employees.get(4).getFirstName() + employees.get(4).getSalary());
        assertEquals("XiongFong65000", employees.get(5).getLastName() + employees.get(5).getFirstName() + employees.get(5).getSalary());
        assertEquals("ZarneckiSabrina51500", employees.get(6).getLastName() + employees.get(6).getFirstName() + employees.get(6).getSalary());

    }

    @Test
    @DisplayName("testAddEmployee")
    void addEmployee() {

        ArrayList<Employee> employees = new ArrayList<Employee>();

        app.addEmployee(employees, "Kennison,Greg,100000");

        assertEquals("KennisonGreg100000", employees.get(0).getLastName() + employees.get(0).getFirstName() + employees.get(0).getSalary());

    }

    @Test
    @DisplayName("testParseCharArr")
    void parseCharArr() {

        char[] greg = {'k', 'e', 'n', 'n', 'i', 's', 'o', 'n', ',', 'g', 'r', 'e', 'g', ',', '5', '5', '9', '0', '0'};

        String testStr = app.parseCharArr(0, 7, greg);

        assertEquals("kennison", testStr);

    }

    @Test
    @DisplayName("testPrintOutput")
    void printOutput() {

        ArrayList<Employee> employees = new ArrayList<Employee>();

        app.addEmployee(employees, "Kennison,Greg,100000");
        app.addEmployee(employees, "Cook,Victor,20");
        app.addEmployee(employees, "Holland,Kevin,200000");

        app.printOutput(employees);

    }
}