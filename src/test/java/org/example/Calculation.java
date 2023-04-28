package org.example;
import org.testng.Assert;
import org.testng.annotations.*;
import java.lang.reflect.Method;

//Створити клас Calculation
public class Calculation implements BeforeInterface, AfterInterface {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Починається загальне тестування");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Загальне тестування завершено");
    }

    @BeforeMethod
    public void beforeMethod(Method method) {
        System.out.println("Починається тестування " + method.getName());
    }

    @AfterMethod
    public void afterMethod(Method method) {
        System.out.println("Тестування " + method.getName() + " завершено");
    }

//В ньому створити 4 тестові методи

    //для перевірки додавання;
    @Test(dataProvider = "additionDataProvider")
    public void testAddition(int a, int b, int expected) {
        Assert.assertEquals(a + b, expected);
    }

    //для перевірки віднімання;
    @Test(dataProvider = "subtractionDataProvider")
    public void testSubtraction(int a, int b, int expected) {
        Assert.assertEquals(a - b, expected);
    }

    //для перевірки множення;
    @Test(dataProvider = "multiplicationDataProvider")
    public void testMultiplication(int a, int b, int expected) {
        Assert.assertEquals(a * b, expected);
    }

    //для перевірки ділення.
    @Test(dataProvider = "divisionDataProvider")
    public void testDivision(int a, int b, int expected) {
        Assert.assertEquals(a / b, expected);
    }

    //Для кожного з цих тестових методів створити dataProvider, наповнити його даними та прилінкувати до відповідного тестового методу.
    @DataProvider(name = "additionDataProvider")
    public Object[][] additionDataProvider() {
        return new Object[][] {
                {1, 2, 3},
                {-1, 1, 0},
                {0, 0, 0}
        };
    }

    @DataProvider(name = "subtractionDataProvider")
    public Object[][] subtractionDataProvider() {
        return new Object[][] {
                {1, 2, -1},
                {5, 3, 2},
                {0, 0, 0}
        };
    }

    @DataProvider(name = "multiplicationDataProvider")
    public Object[][] multiplicationDataProvider() {
        return new Object[][] {
                {2, 3, 6},
                {4, -5, -20},
                {0, 1, 0}
        };
    }

    @DataProvider(name = "divisionDataProvider")
    public Object[][] divisionDataProvider() {
        return new Object[][] {
                {6, 3, 2},
                {10, 5, 2},
                {0, 1, 0}
        };
    }
}

