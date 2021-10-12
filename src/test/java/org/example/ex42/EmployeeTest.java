package org.example.ex42;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    @DisplayName("testSetFirstName")
    void setFirstName() {

        String greg = "Greg";

        Employee testEmp = new Employee();

        testEmp.setFirstName(greg);

        assertEquals(greg, testEmp.getFirstName());

    }

    @Test
    @DisplayName("testGetFirstName")
    void getFirstName() {

        String greg = "Greg";

        Employee testEmp = new Employee();

        testEmp.setFirstName(greg);

        assertEquals(testEmp.getFirstName(), greg);

    }

    @Test
    void setLastName() {

        String greg = "Greg";

        Employee testEmp = new Employee();

        testEmp.setLastName(greg);

        assertEquals(greg, testEmp.getLastName());

    }

    @Test
    void getLastName() {

        String greg = "Greg";

        Employee testEmp = new Employee();

        testEmp.setLastName(greg);

        assertEquals(testEmp.getLastName(), greg);

    }

    @Test
    void setSalary() {

        String greg = "Greg";

        Employee testEmp = new Employee();

        testEmp.setSalary(greg);

        assertEquals(greg, testEmp.getSalary());

    }

    @Test
    void getSalary() {

        String greg = "Greg";

        Employee testEmp = new Employee();

        testEmp.setSalary(greg);

        assertEquals(testEmp.getSalary(), greg);

    }
}