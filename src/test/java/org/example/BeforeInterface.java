package org.example;

import java.lang.reflect.Method;

public interface BeforeInterface {
    public default void beforeClass() {
    }

    public default void beforeMethod(Method method) {
    }
}


