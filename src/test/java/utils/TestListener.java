package utils;

import org.testng.*;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.MediaEntityBuilder;

import baseclass.BaseClass;

public class TestListener implements ITestListener {

    private static ExtentReports extent = ExtentManager.getInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest =
                extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        String path =
                BaseClass.takeScreenshot(result.getMethod().getMethodName());

        test.get().fail(result.getThrowable());
        test.get().fail("Screenshot",
                MediaEntityBuilder
                        .createScreenCaptureFromPath(path)
                        .build());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().skip("Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
