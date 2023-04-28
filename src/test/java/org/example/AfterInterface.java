package org.example;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import java.lang.reflect.Method;

public interface AfterInterface {
    @AfterClass
    void afterClass();

    @AfterMethod
    void afterMethod(Method method);
}

