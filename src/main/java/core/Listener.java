package core;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import java.io.File;
import org.apache.commons.io.FileUtils;


public class Listener implements ITestListener  {




    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("TEST PASSED: "+result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("TEST FAILED: "+result.getName());
        if(DriverManager.getDriver()!=null){
            try{
            TakesScreenshot screenshot=(TakesScreenshot) DriverManager.getDriver();
            File sourcefile= screenshot.getScreenshotAs(OutputType.FILE);
            File destFile= new File("./screenshots/"+ result.getName()+".png");
            FileUtils.copyFile(sourcefile, destFile);
                System.out.println("Screenshot saved at :"+destFile.getAbsolutePath());
            } catch (Exception e) {
                System.out.println("Error in taking the Screenshot"+e.getMessage());
            }
        }
        else {
            System.out.println("Failed to take ScreenShot"+DriverManager.getDriver().getCurrentUrl());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        System.out.println("TEST SKIPPED"+result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);

    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
        System.out.println("Test Suite Started :"+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        System.out.println("TEST FINISHED: "+context.getName());
    }

    @Override
    public boolean isEnabled() {
        return ITestListener.super.isEnabled();
    }
}
