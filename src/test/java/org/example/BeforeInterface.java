package org.example;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import java.lang.reflect.Method;

public interface BeforeInterface {
    @BeforeClass
    void beforeClass();

    @BeforeMethod
    void beforeMethod(Method method);
}


