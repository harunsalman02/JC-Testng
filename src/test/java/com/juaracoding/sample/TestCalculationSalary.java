package com.juaracoding.sample;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCalculationSalary {

    Employee employee;
    CalculationSalary calculationSalary;

    @BeforeMethod
    public void setUp() {
        employee = new Employee();
        calculationSalary = new CalculationSalary();
    }

    @Test
    public void testCalculateTaxone() {
        employee.setName("harun");
        employee.setSalary(8000);
        employee.setTax(10);

    double actual = calculationSalary.calculateTax(employee);
    Assert.assertEquals(actual,7200.0);
}

@Test
public void testCalculateTaxTwo(){
    employee.setName("harun");
    employee.setSalary(6000);
    employee.setTax(10);

    double actual = calculationSalary.calculateTax(employee);
    Assert.assertEquals(actual, 6000.0);
}

@Test
public void testGetEmployeeName(){
    employee.setName("Harun");
    employee.setSalary(6000);
    employee.setTax(10);

    String actual = employee.getName();
    Assert.assertEquals(actual, "Harun");
}

@Test
public void testGetEmployeeSalary(){
    employee.setName("Harun");
    employee.setSalary(6000);
    employee.setTax(10);

    double actual = employee.getSalary();
    Assert.assertEquals(actual, 6000.0);
}

@Test
public void testGetEmployeeTax(){
    employee.setName("Harun");
    employee.setSalary(6000);
    employee.setTax(10);

    double actual = employee.getTax();
    Assert.assertEquals(actual, 10.0);
}

}