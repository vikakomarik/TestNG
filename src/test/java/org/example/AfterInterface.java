package org.example;

import java.lang.reflect.Method;

public interface AfterInterface {
    public default void afterClass() {
    }

    public default void afterMethod(Method method) {
    }
}

