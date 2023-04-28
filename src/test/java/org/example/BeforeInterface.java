package org.example;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.lang.reflect.Method;

public interface BeforeInterface {
    @BeforeClass
    default void beforeClass() {
        System.out.println("Починається загальне тестування");
    }

    @BeforeMethod
    default void beforeMethod(Method method) {
        System.out.println("Починається тестування " + method.getName());
    }
}


