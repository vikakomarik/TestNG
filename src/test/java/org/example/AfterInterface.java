package org.example;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import java.lang.reflect.Method;

public interface AfterInterface {
    @AfterClass
    default void afterClass() {
        System.out.println("Загальне тестування завершено");
    }

    @AfterMethod
    default void afterMethod(Method method) {
        System.out.println("Тестування " + method.getName() + " завершено");
    }
}

