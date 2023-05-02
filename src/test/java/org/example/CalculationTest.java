package org.example;
import org.testng.Assert;
import org.testng.annotations.*;

//Створити клас CalculationTest
public class CalculationTest implements BeforeInterface, AfterInterface {
//В ньому створити 4 тестові методи

    //для перевірки додавання;
    @Test(dataProvider = "additionDataProvider", dataProviderClass = DataProviders.class)
    public void testAddition(int a, int b, int expected) {
        Assert.assertEquals(a + b, expected);
    }

    //для перевірки віднімання;
    @Test(dataProvider = "subtractionDataProvider", dataProviderClass = DataProviders.class)
    public void testSubtraction(int a, int b, int expected) {
        Assert.assertEquals(a - b, expected);
    }

    //для перевірки множення;
    @Test(dataProvider = "multiplicationDataProvider", dataProviderClass = DataProviders.class)
    public void testMultiplication(int a, int b, int expected) {
        Assert.assertEquals(a * b, expected);
    }

    //для перевірки ділення.
    @Test(dataProvider = "divisionDataProvider", dataProviderClass = DataProviders.class)
    public void testDivision(int a, int b, int expected) {
        Assert.assertEquals(a / b, expected);
    }
}

