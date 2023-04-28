package org.example;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
 @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Huston, you have problems...");
    }
}
