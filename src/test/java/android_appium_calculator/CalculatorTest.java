package android_appium_calculator;

import TestData.TestData;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.qameta.allure.*;

@Listeners(core.Listener.class)
public class CalculatorTest {
    public AndroidDriver driver;

    @BeforeClass
    public void setUp() {
        stepLog("===Launch Calculator App===");
        System.out.println("===== Setting up Appium Calculator Test =====");
        boolean isAppOpened = Calculator.openCalculatorApp();
        if (!isAppOpened) {
            System.err.println("Device not connected or app launch failed. Check emulator/device and Appium server.");
        }
        Assert.assertTrue(isAppOpened, "App failed to open");
        boolean isdownarrowClicked = Calculator.clickDownArrow();
        if (!isdownarrowClicked) {
            System.err.println("Down Arrow Not clicked");
        }

    }


    @BeforeMethod
    public void resetCalculator() throws InterruptedException {
        Calculator.EraseAll();
    }

    @Test(priority = 1,description = "TC_01: TEST ADDITION")
    public void testAddition() {
        stepLog("===perform addition===");
        System.out.println("===TC_01: TEST ADDITION===");
        String result = Calculator.performAddition();
        Assert.assertEquals(result.trim(), TestData.getExpectedData("expected add ans"), "Result should be 3");
        System.out.println("=====ADDITION TEST SUCCESSFULLY COMPLETED====");

    }

    @Test(priority = 2, description = "TC_02:TEST SUBTRACTION")
    public void testSubtraction() {
        stepLog("===perform Subtraction===");
        System.out.println("===TC_02: TEST SUBTRACTION===");
        String result = Calculator.performSubtraction();
        Assert.assertEquals(result.trim(), TestData.getExpectedData("expected sub ans"), "Result should be 1");
        System.out.println("====SUBTRACTION TEST SUCCESSFULLY COMPLETED===");

    }

    @Test(priority = 3)
    public void testMultiplication() {
        stepLog("===perform Multiplication===");
        System.out.println("===TC_03: TEST MULTIPLICATION===");
        String result = Calculator.performMultiplication();
        Assert.assertEquals(result.trim(), TestData.getExpectedData("expected multi ans"), "Result should be 35");
        System.out.println("====MULTIPLICATION TEST SUCCESSFULLY COMPLETED===");
    }

    @Test(priority = 4)
    public void testDivision() {
        stepLog("===perform Division===");
        System.out.println("===TC_04: TEST DIVISION===");
        String result = Calculator.performDivision();
        Assert.assertEquals(result.trim(), TestData.getExpectedData("expected div ans"), "Result should be 3");
        System.out.println("====DIVISION TEST SUCCESSFULLY COMPLETED===");
    }

    @Test(priority = 5)
    public void testDivisionByZero() {
        stepLog("===Perform division by zero===");
        System.out.println("===TC_05: TEST DIVISION BY ZERO===");
        String result = Calculator.performDivisionByZero();
        Assert.assertEquals(result.trim(), TestData.getExpectedData("expected div by zero ans"), "Mismatch of Text");
        System.out.println("====DIVISION BY ZERO TEST SUCCESSFULLY COMPLETED===");
    }

    @Test(priority = 6)
    public void testClearText() throws InterruptedException {
        stepLog("===perform clear text===");
        System.out.println("===TC_06: TEST CLEAR TEXT===");
        String result = Calculator.performClearText();
        Assert.assertEquals(result.trim(), TestData.getExpectedData("expected clear text ans"), "Result should be empty");
        System.out.println("====CLEAR TEXT TEST SUCCESSFULLY COMPLETED===");
    }

    @Test(priority = 7)
    public void testChainedOperation() {
        stepLog("===perform chained operation===");
        System.out.println("===TC_07: TEST CHAINED OPERATION===");
        String result = Calculator.performChainedOperation();
        Assert.assertEquals(result.trim(), TestData.getExpectedData("expected chain operation ans"), "Result mismatch");
        System.out.println("====CHAINED OPERATION  TEST SUCCESSFULLY COMPLETED===");
    }

    @Test(priority = 8)
    public void testBackSpace() {
        stepLog("===perform Backspace===");
        System.out.println("===TC_08: TEST Backspace===");
        String result = Calculator.performClickBackspace();
        Assert.assertEquals(result.trim(), TestData.getExpectedData("expected Backspace ans"), "Result mismatch");
        System.out.println("====BACKSPACE TEST SUCCESSFULLY COMPLETED===");
    }

    @Test(priority = 9)
    public void testDecimalpoint() {
        stepLog("===Decimal Point=== ");
        System.out.println("===TC_09: TEST DECIMAL POINT===");
        String result = Calculator.performDecimalNumberOperation();
        Assert.assertEquals(result.trim(), TestData.getExpectedData("expected decimal point ans"), "Result mismatch");
        System.out.println("====DECIMAL POINT TEST SUCCESSFULLY COMPLETED===");
    }
    @Test(priority = 10)
    public void testSquareRoot() {
        stepLog("===SQUARE ROOT=== ");
        System.out.println("===TC_10: TEST SQUARE ROOT OPERATION ===");
        String result = Calculator.performSqRoot();
        Assert.assertTrue(result.contains(TestData.getExpectedData("expected sqrt ans")), "Result mismatch");
        System.out.println("==== SQUARE ROOT OPERATION TEST SUCCESSFULLY COMPLETED===");
    }

    @Test(priority = 11)
    public void testPiOperation() {
        stepLog("===PI operation=== ");
        System.out.println("===TC_11: PI OPERATION===");
        String result = Calculator.performPI();
        Assert.assertTrue(result.contains(TestData.getExpectedData("expected pi ans")), "Result mismath");
        System.out.println("====PI OPERATION TEST SUCCESSFULLY COMPLETED===");
    }

    @Test(priority = 12)
    public void testPowerOperation() {
        stepLog("===Power Operation=== ");
        System.out.println("===TC_12: TEST POWER OPERATION===");
        String result = Calculator.performPower();
        Assert.assertEquals(result.trim(), TestData.getExpectedData("expected power ans"), "Result Mismatch");
        System.out.println("==== POWER OPERATION TEST SUCCESSFULLY COMPLETED===");
    }

    @Test(priority = 13)
    public void testFactorial() {
        stepLog("===Decimal Point=== ");
        System.out.println("===TC_13: TEST FACTORIAL===");
        String result = Calculator.performFactorial();
        Assert.assertEquals(result.trim(), TestData.getExpectedData("expected factorial ans"), "Result Mis match");
        System.out.println("====Factorial TEST SUCCESSFULLY COMPLETED===");
    }


@Test(priority = 14)
public void testInvSinRad() {
    stepLog("=== Inv Sin Radian ===");
    System.out.println("=== TC_14: TEST Inv Sin Radian ===");
    String result = Calculator.performInvSin();
    Assert.assertTrue(result.contains(TestData.getExpectedData("expected invsin ans")), "Result Mismatch");
    System.out.println("=== Inv Sin Radian TEST SUCCESSFULLY COMPLETED ===");
}

    @Test(priority = 15)
    public void testInvCosDeg() {
        stepLog("=== Inv Cos Degree ===");
        System.out.println("=== TC_15: TEST Inv Cos Degree ===");
        String result = Calculator.performInvCos();
        Assert.assertTrue(result.contains(TestData.getExpectedData("expected invcos ans")), "Result Mismatch");
        System.out.println("=== Inv Cos Degree TEST SUCCESSFULLY COMPLETED ===");
    }
    @Test(priority = 16)
    public void testInvTanRad() {
        stepLog("=== Inv Tan Radian ===");
        System.out.println("=== TC_16: TEST Inv Tan Radian ===");
        String result = Calculator.performInvTan();
        Assert.assertTrue(result.contains(TestData.getExpectedData("expected invtan ans")), "Result Mismatch");
        System.out.println("=== Inv Tan Radian TEST SUCCESSFULLY COMPLETED ===");
    }


    @Test(priority = 17)
    public void testInvExpRad() {
        stepLog("=== Inv Exp Radian ===");
        System.out.println("=== TC_17: TEST Inv Exp Radian ===");
        String result = Calculator.performInvExp();
        Assert.assertTrue(result.contains(TestData.getExpectedData("expected invexp ans")), "Result Mismatch");
        System.out.println("=== Inv Exp Radian TEST SUCCESSFULLY COMPLETED ===");
    }

    @Test(priority = 18)
    public void testInvTenPowRad() {
        stepLog("=== Inv Ten Power Radian ===");
        System.out.println("=== TC_18: TEST Inv Ten Power Radian ===");
        String result = Calculator.performInvTenPow();
        Assert.assertEquals(result.trim(), TestData.getExpectedData("expected invtenpower ans"), "Result Mismatch");
        System.out.println("=== Inv Ten Power Radian TEST SUCCESSFULLY COMPLETED ===");
    }
    @Test(priority = 19)
    public void testEuler() {
        stepLog("===Euler=== ");
        System.out.println("===TC_19: TEST EULER===");
        String result = Calculator.Euler();
        Assert.assertTrue(result.contains(TestData.getExpectedData("expected euler ans")), "Result Mismatch");
        System.out.println("====EULER TEST SUCCESSFULLY COMPLETED===");
    }

    @Test(priority = 20)
    public void testNaturalLog() {
        stepLog("===Natural Log=== ");
        System.out.println("===TC_20: TEST NATURAL LOG===");
        String result = Calculator.Natlog();
        Assert.assertTrue(result.contains(TestData.getExpectedData("expected naturallog ans")), "Result Mismatch");
        System.out.println("====NATURAL LOG TEST SUCCESSFULLY COMPLETED===");
    }

    @Test(priority = 21)
    public void testLog() {
        stepLog("===Log=== ");
        System.out.println("===TC_21: TEST LOG===");
        String result = Calculator.log();
        Assert.assertTrue(result.contains(TestData.getExpectedData("expected log ans")), "Result Mismatch");
        System.out.println("====LOG TEST SUCCESSFULLY COMPLETED===");
    }




    @Test(priority = 22)
    public void testHistory() {
        stepLog("===History=== ");
        System.out.println("===TC_22: TEST HISTORY===");
        boolean result = Calculator.verifyHistoryOptions();
        Assert.assertTrue(result, "Result Mismatch");
        System.out.println("====HISTORY TEST SUCCESSFULLY COMPLETED===");
    }
    @Test(priority = 23)
    public void testDarkMode() {
        stepLog("===DarkMode=== ");
        System.out.println("===TC_23: TEST DARK MODE===");
        boolean result = Calculator.changeDarkMode();
        Assert.assertTrue(result, "Result Mismatch");
        System.out.println("====DARK MODE TEST SUCCESSFULLY COMPLETED===");
    }
    @Test(priority = 24)
    public void testLightMode() {
        stepLog("===Light Mode=== ");
        System.out.println("===TC_24: TEST LIGHT MODE===");
        boolean result = Calculator.changeLightMode();
        Assert.assertTrue(result, "Result Mismatch");
        System.out.println("====LIGHT MODE TEST SUCCESSFULLY COMPLETED===");
    }
    @Test(priority = 25)
    public void testSysDefault() {
        stepLog("===Change System Default=== ");
        System.out.println("===TC_25: TEST SYSTEM DEFAULT===");
        boolean result = Calculator.changeSysDefMode();
        Assert.assertTrue(result, "Result Mismatch");
        System.out.println("====SYSTEM DEFAULT TEST SUCCESSFULLY COMPLETED===");
    }

    @Test(priority = 26)
    public void testPrivacy() {
        stepLog("===Privacy Policy Check=== ");
        System.out.println("===TC_26: TEST PRIVACY POLICY===");
        boolean result = Calculator.verifyPrivacyPolicy();
        Assert.assertTrue(result, "Result Mismatch");
        System.out.println("====SYSTEM DEFAULT TEST SUCCESSFULLY COMPLETED===");
    }

    @Test(priority = 27)
    public void testFeedback() {
        stepLog("===Feedback Check=== ");
        System.out.println("===TC_27: TEST FEEDBACK===");
        boolean result = Calculator.verifyFeedbackBtnClicked();
        Assert.assertTrue(result, "Result Mismatch");
       // driver.navigate().back();
        System.out.println("====FEEDBACK TEST SUCCESSFULLY COMPLETED===");
    }

    @Test(priority = 28)
    public void testHelp() {
        stepLog("===Help Check=== ");
        System.out.println("===TC_28: TEST HELP===");
        boolean result = Calculator.verifyHelpBtnClicked();
        Assert.assertTrue(result,"Result Mismatch");
        System.out.println("====HELP TEST SUCCESSFULLY COMPLETED===");
    }






    @AfterClass
    public void tearDown() {
        Calculator.quitApp();
        stepLog("===App closed successfully===");
    }
    public void stepLog(String text){
        System.out.println("\n***"+text.toUpperCase()+"***\n");
    }

}
