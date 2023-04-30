package org.example;
import com.beust.jcommander.Parameter;
import org.testng.Assert;
import org.testng.annotations.*;
import java.lang.reflect.Method;

//Створити клас Calculation
public abstract class Calculation implements BeforeInterface, AfterInterface {

 /*   @Parameters (value="login")
    @Test
    public void p_test(String param) {
        System.out.println("login is ");
        System.out.println(param);
        Assert.fail();
    }*/

    @BeforeClass
    public abstract void beforeClass();

    @AfterClass
    public abstract void afterClass();

    @BeforeMethod
    public abstract void beforeMethod(Method method);

    @AfterMethod
    public abstract void afterMethod(Method method);

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

