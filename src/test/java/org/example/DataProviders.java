package org.example;

import org.testng.annotations.DataProvider;

public class DataProviders {
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
