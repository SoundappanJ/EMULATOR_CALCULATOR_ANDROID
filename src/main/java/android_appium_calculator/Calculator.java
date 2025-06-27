package android_appium_calculator;

import Utils.PageUtils;
import core.DriverManager;
import enums.PageEnums;
import enums.Timeout;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;


public class Calculator {

    public static AndroidDriver driver;
    public static String resultText;

    public static boolean openCalculatorApp() {
        driver = DriverManager.getDriver();

        if (driver != null) {
            System.out.println("*** Calculator App Launched Successfully***");
            return true;
        } else {
            System.out.println("*** App launch failed. Device not connected or Appium not started.***");
            return false;
        }
    }


    public static boolean clickAddition() {
        WebElement add = PageUtils.waitForVisibility(driver, PageEnums.ADD.getXpath(), Timeout.TEN);
        add.click();
        return true;
    }

    public static boolean clickSubtraction() {
        WebElement sub = PageUtils.waitForVisibility(driver, PageEnums.SUB.getXpath(), Timeout.TEN);
        sub.click();
        return true;
    }

    public static boolean clickMultiplication() {
        WebElement multi = PageUtils.waitForVisibility(driver, PageEnums.MULTI.getXpath(), Timeout.TEN);
        multi.click();
        return true;
    }

    public static boolean clickDivision() {
        WebElement div = PageUtils.waitForVisibility(driver, PageEnums.DIV.getXpath(), Timeout.TEN);
        div.click();
        return true;
    }

    public static boolean clickEquals() {
        WebElement eql = PageUtils.waitForVisibility(driver, PageEnums.EQUAL.getXpath(), Timeout.TEN);
        eql.click();
        return true;
    }

    public static boolean clickDecimal() {
        WebElement point = PageUtils.waitForVisibility(driver, PageEnums.POINT.getXpath(), Timeout.TEN);
        point.click();
        return true;
    }

    public static boolean clickOne() {
        WebElement one = PageUtils.waitForVisibility(driver, PageEnums.DIG_1.getXpath(), Timeout.FIVE);
        one.click();
        return true;
    }

    public static boolean clickTwo() {
        WebElement two = PageUtils.waitForVisibility(driver, PageEnums.DIG_2.getXpath(), Timeout.FIVE);
        two.click();
        return true;
    }

    public static boolean clickThree() {
        WebElement three = PageUtils.waitForVisibility(driver, PageEnums.DIG_3.getXpath(), Timeout.FIVE);
        three.click();
        return true;
    }

    public static boolean clickFour() {
        WebElement four = PageUtils.waitForVisibility(driver, PageEnums.DIG_4.getXpath(), Timeout.FIVE);
        four.click();
        return true;
    }

    public static boolean clickFive() {
        WebElement five = PageUtils.waitForVisibility(driver, PageEnums.DIG_5.getXpath(), Timeout.FIVE);
        five.click();
        return true;
    }

    public static boolean clickSix() {
        WebElement six = PageUtils.waitForVisibility(driver, PageEnums.DIG_6.getXpath(), Timeout.FIVE);
        six.click();
        return true;
    }

    public static boolean clickSeven() {
        WebElement seven = PageUtils.waitForVisibility(driver, PageEnums.DIG_7.getXpath(), Timeout.FIVE);
        seven.click();
        return true;
    }

    public static boolean clickEight() {
        WebElement eight = PageUtils.waitForVisibility(driver, PageEnums.DIG_8.getXpath(), Timeout.FIVE);
        eight.click();
        return true;
    }

    public static boolean clickNine() {
        WebElement nine = PageUtils.waitForVisibility(driver, PageEnums.DIG_9.getXpath(), Timeout.FIVE);
        nine.click();
        return true;
    }

    public static boolean clickZero() {
        WebElement zero = PageUtils.waitForVisibility(driver, PageEnums.DIG_0.getXpath(), Timeout.FIVE);
        zero.click();
        return true;
    }



    public static boolean clickParen() {
        WebElement paren = PageUtils.waitForVisibility(driver, PageEnums.PAREN.getXpath(), Timeout.FIVE);
        paren.click();
        return true;
    }

    public static boolean clickBackspace() {
        WebElement backspace = PageUtils.waitForVisibility(driver, PageEnums.BACKSPACE.getXpath(), Timeout.FIVE);
        backspace.click();
        return true;
    }

    public static boolean clickSqrt() {
        WebElement clickSqrt = PageUtils.waitForVisibility(driver, PageEnums.SQRT.getXpath(), Timeout.FIVE);
        clickSqrt.click();
        return true;
    }

    public static boolean clickPI() {
        WebElement Pi = PageUtils.waitForVisibility(driver, PageEnums.PI.getXpath(), Timeout.FIVE);
        Pi.click();
        return true;
    }

    public static boolean clickPower() {
        WebElement power = PageUtils.waitForVisibility(driver, PageEnums.POWER.getXpath(), Timeout.FIVE);
        power.click();
        return true;
    }

    public static boolean clickFactorila() {
        WebElement factorial = PageUtils.waitForVisibility(driver, PageEnums.Factorial.getXpath(), Timeout.FIVE);
        factorial.click();
        return true;
    }

    public static boolean clickEraseAll() {
        WebElement eraseall = PageUtils.waitForVisibility(driver, PageEnums.ERASEALL.getXpath(), Timeout.FIVE);
        eraseall.click();
        return true;
    }

    public static boolean clickDownArrow() {
        WebElement downarrow = PageUtils.waitForVisibility(driver, PageEnums.DOWNARROW.getXpath(), Timeout.TEN);
        downarrow.click();
        return true;
    }


    public static boolean clickSin() {
        WebElement clickSin = PageUtils.waitForVisibility(driver, PageEnums.SIN.getXpath(), Timeout.TEN);
        clickSin.click();
        return true;
    }

    public static boolean clickCos() {
        WebElement clickCos = PageUtils.waitForVisibility(driver, PageEnums.COS.getXpath(), Timeout.TEN);
        clickCos.click();
        return true;
    }

    public static boolean clickTan() {
        WebElement clickTan = PageUtils.waitForVisibility(driver, PageEnums.TAN.getXpath(), Timeout.TEN);
        clickTan.click();
        return true;
    }

    public static boolean clickInv() {
        WebElement clickInv = PageUtils.waitForVisibility(driver, PageEnums.INV.getXpath(), Timeout.TEN);
        clickInv.click();
        return true;
    }

    public static boolean clickInvSqrt() {
        WebElement clickInv_SQR = PageUtils.waitForVisibility(driver, PageEnums.INV_SQR.getXpath(), Timeout.TEN);
        clickInv_SQR.click();
        return true;
    }

    public static boolean clickInvSIN() {
        WebElement clickInv_SIN = PageUtils.waitForVisibility(driver, PageEnums.INV_SIN.getXpath(), Timeout.TEN);
        clickInv_SIN.click();
        return true;
    }

    public static boolean clickInvCOS() {
        WebElement clickInv_COS = PageUtils.waitForVisibility(driver, PageEnums.INV_COS.getXpath(), Timeout.TEN);
        clickInv_COS.click();
        return true;
    }

    public static boolean clickInvTan() {
        WebElement clickInv_TAN = PageUtils.waitForVisibility(driver, PageEnums.INV_TAN.getXpath(), Timeout.TEN);
        clickInv_TAN.click();
        return true;
    }

    public static boolean clickInvEXP() {
        WebElement clickInv_EXP = PageUtils.waitForVisibility(driver, PageEnums.INV_EXP.getXpath(), Timeout.TEN);
        clickInv_EXP.click();
        return true;
    }

    public static boolean clickInvTENPOW() {
        WebElement clickInv_TEN_POW = PageUtils.waitForVisibility(driver, PageEnums.INV_TEN_POW.getXpath(), Timeout.TEN);
        clickInv_TEN_POW.click();
        return true;
    }

    public static boolean clickEuler() {
        WebElement clickEuler = PageUtils.waitForVisibility(driver, PageEnums.EULER.getXpath(), Timeout.TEN);
        clickEuler.click();
        return true;
    }

    public static boolean clicknaturalLog() {
        WebElement clickNaturalLog = PageUtils.waitForVisibility(driver, PageEnums.NAT_ALF.getXpath(), Timeout.TEN);
        clickNaturalLog.click();
        return true;
    }

    public static boolean clicklog() {
        WebElement clickLog = PageUtils.waitForVisibility(driver, PageEnums.LOG.getXpath(), Timeout.TEN);
        clickLog.click();
        return true;
    }

    public static boolean clickMoreOptions() {
        WebElement clickoption = PageUtils.waitForVisibility(driver, PageEnums.MOREOPTIONS.getXpath(), Timeout.TEN);
        clickoption.click();
        return true;
    }

    public static boolean clickHistory() {
        WebElement clickHistory = PageUtils.waitForVisibility(driver, PageEnums.HISTORY.getXpath(), Timeout.TEN);
        clickHistory.click();
        return true;
    }

    public static boolean clickTheme() {
        WebElement clickTheme = PageUtils.waitForVisibility(driver, PageEnums.THEME.getXpath(), Timeout.TEN);
        clickTheme.click();
        return true;
    }

    public static boolean clickPrivacy() {
        WebElement clickPrivacy = PageUtils.waitForVisibility(driver, PageEnums.PRIVACYPOLICY.getXpath(), Timeout.TEN);
        clickPrivacy.click();
        return true;
    }

    public static boolean clickFeedback() {
        WebElement clickFeedback = PageUtils.waitForVisibility(driver, PageEnums.FEEDBACK.getXpath(), Timeout.TEN);
        clickFeedback.click();
        return true;
    }

    public static boolean clickHelp() {
        WebElement clickHelp = PageUtils.waitForVisibility(driver, PageEnums.HELP.getXpath(), Timeout.TEN);
        clickHelp.click();
        return true;
    }

    public static boolean clickDarkMode() {
        WebElement clickDarkMode = PageUtils.waitForVisibility(driver, PageEnums.DARKMODE.getXpath(), Timeout.TEN);
        clickDarkMode.click();
        return true;
    }

    public static boolean clickLightMode() {
        WebElement clickLightMode = PageUtils.waitForVisibility(driver, PageEnums.LIGHTMODE.getXpath(), Timeout.TEN);
        clickLightMode.click();
        return true;
    }

    public static boolean clickSysDeft() {
        WebElement clicksysDeft = PageUtils.waitForVisibility(driver, PageEnums.SYSDEF.getXpath(), Timeout.TEN);
        clicksysDeft.click();
        return true;
    }

    public static boolean clickCancel() {
        WebElement clickCancel = PageUtils.waitForVisibility(driver, PageEnums.CLICKCANCEL.getXpath(), Timeout.TEN);
        clickCancel.click();
        return true;
    }

    public static boolean clickOk() {
        WebElement clickFeedback = PageUtils.waitForVisibility(driver, PageEnums.CLICKOK.getXpath(), Timeout.TEN);
        clickFeedback.click();
        return true;
    }
    public static boolean EraseAll() throws InterruptedException {

            // Step 1: Click clear button
            clickEraseAll();
            Thread.sleep(300); // wait for clear action

        return true;
    }
    public static String getresultText() {
        WebElement result = PageUtils.waitForVisibility(driver, PageEnums.RESULT.getXpath(), Timeout.FIVE);
        resultText = result.getText();
        System.out.println("Result Displayed: " + resultText);
        return resultText;
    }

    public static String getresult_Preview_Text() {
        WebElement result2 = PageUtils.waitForVisibility(driver, PageEnums.RESULT_2.getXpath(), Timeout.FIVE);
        resultText = result2.getText();
        System.out.println("Result Displayed: " + resultText);
        return resultText;
    }

    public static String getNoResult() {
        WebElement noresult = PageUtils.waitForVisibility(driver, PageEnums.NO_RESULT.getXpath(), Timeout.FIVE);
        resultText = noresult.getText();
        System.out.println("Result Displayed: " + resultText);
        return resultText;
    }

    public static String getEditText() {
        WebElement editText = PageUtils.waitForVisibility(driver, PageEnums.EDIT_TEXT.getXpath(), Timeout.FIVE);
        resultText = editText.getText();
        System.out.println("Result Displayed: " + resultText);
        return resultText;
    }


    public static String performAddition() {
        clickOne();
        clickAddition();
        clickTwo();
        clickEquals();
        return getresultText();
    }

    public static String performSubtraction() {
        clickFour();
        clickSubtraction();
        clickThree();
        clickEquals();
        return getresultText();
    }

    public static String performMultiplication() {
        clickSeven();
        clickMultiplication();
        clickFive();
        clickEquals();
        return getresultText();
    }

    public static String performDivision() {
        clickSix();
        clickDivision();
        clickTwo();
        clickEquals();
        return getresultText();
    }

    public static String performDivisionByZero() {
        clickFive();
        clickDivision();
        clickZero();
        clickEquals();
        return getresult_Preview_Text();
    }

    public static String performClearText() throws InterruptedException {
        clickFive();
        clickAddition();
        clickFour();
        clickEquals();
        EraseAll();
        return getNoResult();
    }

    public static String performChainedOperation() {
        clickNine();
        clickAddition();
        clickSix();
        clickSubtraction();
        clickTwo();
        clickMultiplication();
        clickFour();
        clickDivision();
        clickSeven();
        clickEquals();
        return getresultText();
    }

    public static String performClickBackspace() {
        clickFour();
        clickSeven();
        clickThree();
        clickEight();
        clickBackspace();
        return getEditText();
    }

    public static String performDecimalNumberOperation() {
        clickOne();
        clickDecimal();
        clickFive();
        clickAddition();
        clickThree();
        clickDecimal();
        clickEight();
        clickEquals();
        return getresultText();
    }

    public static String performSqRoot() {
        clickSqrt();
        clickFive();
        return getresult_Preview_Text();
    }

    public static String performPI() {
        clickSeven();
        clickPI();
        return getresult_Preview_Text();
    }

    public static String performPower() {
        clickFour();
        clickPower();
        clickThree();
        clickEquals();
        return getresultText();
    }

    public static String performFactorial() {
        clickSeven();
        clickFactorila();
        clickEquals();
        return getresultText();
    }

public static String performInvSin() {
    clickInv();
    clickInvSIN();        // sin⁻¹
    clickOne();
    clickEquals();
    return getresultText();
}

    public static String performInvCos() {

        clickInvCOS();        // cos⁻¹
        clickOne();
        clickEquals();
        return getresultText();
    }

    public static String performInvTan() {
        clickInvTan();        // tan⁻¹
        clickOne();
        clickEquals();
        return getresultText();
    }

    public static String performInvExp() {
        clickInvEXP();
        clickFour();
        clickEquals();
        return getresultText();
    }

    public static String performInvTenPow() {
        clickInvTENPOW();     // 10⁻¹
        clickFour();

        return getresult_Preview_Text();
    }
   public static String Euler() {
        clickEuler();
        clickFour();
        clickEquals();
        return getresultText();
    }

    public static String Natlog() {

        clicknaturalLog();
        clickFour();
        clickParen();
        clickEquals();
        return getresultText();
    }

    public static String log() {
        clicklog();
        clickThree();
        clickParen();
        clickEquals();
        return getresultText();
    }
    public static boolean clickHistoryOption() {
        WebElement clickHistoryOption = PageUtils.waitForVisibility(driver, PageEnums.VERIFYHISOPTION.getXpath(), Timeout.TEN);
        clickHistoryOption.click();
        return true;
    }

    public static boolean clearHistoryText() {
        WebElement cleartext = PageUtils.waitForVisibility(driver, PageEnums.CLEARTEXT.getXpath(), Timeout.TEN);
        cleartext.click();
        return true;
    }
    public static boolean clickClearButton() {
        WebElement cleartext = PageUtils.waitForVisibility(driver, PageEnums.CLICKCLEAR.getXpath(), Timeout.TEN);
        cleartext.click();
        return true;
    }
    public static boolean verifyHistoryOptions(){
        clickOne();
        clickAddition();
        clickThree();
        clickEquals();
        clickMoreOptions();
        clickHistory();
        clickHistoryOption();
        clearHistoryText();
        clickClearButton();
        return true;
    }
    public static boolean changeDarkMode(){
        clickMoreOptions();
        clickTheme();
        clickDarkMode();
        clickOk();
        return true;

    }
    public static boolean changeLightMode(){
        clickMoreOptions();
        clickTheme();
        clickLightMode();
        clickOk();
        return true;
    }
    public static boolean changeSysDefMode(){
        clickMoreOptions();
        clickTheme();
        clickSysDeft();
        clickCancel();
        return true;
    }


    public static boolean verifyPrivacyPolicy(){
        clickMoreOptions();
        clickPrivacy();
        driver.navigate().back();
        return true;
    }
    public static boolean clickCloseFeedback(){
        WebElement clickclose= PageUtils.waitForVisibility(driver,PageEnums.CLOSEFEEDBACK.getXpath(), Timeout.TEN);
        clickclose.click();
        return true;
    }
    public static boolean clickDiscard(){
        WebElement clickDiscard=PageUtils.waitForVisibility(driver,PageEnums.CLICKDISCARD.getXpath(), Timeout.TEN);
        clickDiscard.click();
        return true;
    }
    public static boolean verifyFeedbackBtnClicked(){
        clickMoreOptions();
        clickFeedback();
        clickCloseFeedback();
        clickDiscard();
        return true;

    }

    public static boolean verifyHelpBtnClicked(){
        clickMoreOptions();
        clickHelp();
        driver.navigate().back();
        return true;

    }





    public static void quitApp() {
        if (driver != null) {
            driver.quit();
            System.out.println("App Closed.");
        }
    }
}
