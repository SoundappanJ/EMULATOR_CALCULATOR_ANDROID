package enums;

import org.openqa.selenium.By;

public enum PageEnums {


    ERASEALL(By.xpath(" //android.widget.ImageButton[@content-desc='clear']"),"Clear the Test"),
//    CLEAR(By.xpath("//android.widget.ImageButton[@content-desc='delete']"), "Clear/AC Button"),
//    INV(By.xpath("//android.widget.ImageButton[@content-desc='show inverse functions']"), "INV Button"),

    ADD(By.xpath("//android.widget.ImageButton[@content-desc='plus']"),"Perform Addition"),
    SUB(By.xpath("//android.widget.ImageButton[@content-desc=\"minus\"]"),"Perform Subtraction"),
    MULTI(By.xpath("//android.widget.ImageButton[@content-desc=\"multiply\"]"),"Perform Multiplication"),
    DIV(By.xpath("//android.widget.ImageButton[@content-desc=\"divide\"]"),"Perform Division"),
    EQUAL(By.xpath("//android.widget.ImageButton[@content-desc=\"equals\"]"),"Click Equlas"),
    POINT(By.xpath("//android.widget.ImageButton[@content-desc=\"point\"]"),"Click Decimal Point"),
    RESULT_2(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.calculator:id/result_preview\"]"),"get the result "),//android.widget.TextView[@resource-id="com.google.android.calculator:id/result_preview"]
    RESULT(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.calculator:id/result_final\"]"),"Gets the Results"),
    NO_RESULT(By.xpath("//android.widget.TextView[@content-desc=\"No result\"]"),"No result"),
    EDIT_TEXT(By.xpath("//android.widget.EditText[@resource-id=\"com.google.android.calculator:id/formula\"]"),"Get the Edited Text"),
    DOWNARROW(By.xpath("//android.widget.ImageButton[@content-desc=\"Expand\"]"),"click the Down Arrow"),
    DIG(By.xpath("//android.widget.ImageButton[@content-desc="),"click Digits"),
    DIG_1(By.xpath("//android.widget.ImageButton[@content-desc=\"1\"]"),"click one"),
    DIG_2(By.xpath("//android.widget.ImageButton[@content-desc=\"2\"]"),"click two"),
    DIG_3(By.xpath("//android.widget.ImageButton[@content-desc=\"3\"]"),"click three"),
    DIG_4(By.xpath("//android.widget.ImageButton[@content-desc=\"4\"]"),"click four"),
    DIG_5(By.xpath("//android.widget.ImageButton[@content-desc=\"5\"]"),"click five"),
    DIG_6(By.xpath("//android.widget.ImageButton[@content-desc=\"6\"]"),"click six"),
    DIG_7(By.xpath("//android.widget.ImageButton[@content-desc=\"7\"]"),"click seven"),
    DIG_8(By.xpath("//android.widget.ImageButton[@content-desc=\"8\"]"),"click eight"),
    DIG_9(By.xpath("//android.widget.ImageButton[@content-desc=\"9\"]"),"click nine"),
    DIG_0(By.xpath("//android.widget.ImageButton[@content-desc=\"0\"]"),"click zero"),
    DIG_PERC(By.xpath("//android.widget.ImageButton[@content-desc=\"percent\"]"),"click percentage"),
    PAREN(By.xpath("//android.widget.ImageButton[@content-desc=\"left or right parenthesis\"]"),"click parenthesis"),
    BACKSPACE(By.xpath("//android.widget.ImageButton[@content-desc=\"delete\"]"),"Click the Delete"),
    SQRT(By.xpath("//android.widget.ImageButton[@content-desc=\"square root\"]"),"Click Square root"),
    PI(By.xpath("//android.widget.ImageButton[@content-desc=\"pi\"]"),"Click the Pi"),
    POWER(By.xpath("//android.widget.ImageButton[@content-desc=\"power\"]"),"Click the power Button"),
    Factorial(By.xpath("//android.widget.ImageButton[@content-desc=\"factorial\"]"),"Click the Factorial"),
    SWITCH(By.xpath("//android.widget.ImageButton[contains(@content-desc,'switch')]"), "verify switch"),
    RAD(By.xpath("//android.widget.ImageButton[@content-desc='switch to radians']"), "perform radians"),
    DEGREE(By.xpath("//android.widget.ImageButton[@content-desc='switch to degrees']"), "perform degree"),
    SIN(By.xpath("//android.widget.ImageButton[@content-desc=\"sine\"]"),"perform sin"),
    COS(By.xpath("//android.widget.ImageButton[@content-desc=\"cosine\"]"),"perform cos"),
    TAN(By.xpath("//android.widget.ImageButton[@content-desc=\"tangent\"]"),"perform tan"),
    INV(By.xpath("//android.widget.ImageButton[contains(@content-desc, 'inverse')]"), "perform inverse"),
    INV_SQR(By.xpath("//android.widget.ImageButton[@content-desc=\"squared\"]"),"perform inverse square root"),
    INV_SIN(By.xpath("//android.widget.ImageButton[@content-desc=\"inverse sine\"]"),"perform inverse sin"),
    INV_COS(By.xpath("//android.widget.ImageButton[@content-desc=\"inverse cosine\"]"),"perform inverse cos"),
    INV_TAN(By.xpath("//android.widget.ImageButton[@content-desc=\"inverse tangent\"]"),"perform inverse tan"),
    INV_EXP(By.xpath("//android.widget.ImageButton[@content-desc=\"exponential function\"]"),"inverse Exponential"),
    INV_TEN_POW(By.xpath("//android.widget.ImageButton[@content-desc=\"ten to the power of\"]"),"perform inverse power off"),
    EULER(By.xpath("//android.widget.ImageButton[@content-desc=\"Euler's number\"]"),"Perform euler"),
    NAT_ALF(By.xpath("//android.widget.ImageButton[@content-desc=\"natural logarithm\"]"), "click natural log"),
    LOG(By.xpath("//android.widget.ImageButton[contains(@content-desc, 'log')]"), "Perform logarithm"),
    MOREOPTIONS(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"),"click more options"),
    HISTORY(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.calculator:id/title\" and @text=\"History\"]"), "verify history"),
    VERIFYHISOPTION(By.xpath("(//android.widget.ImageView[@content-desc=\"More options\"])[1]"),"click history more options "),
    VERIFYHISTRY(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.calculator:id/history_date\"]"),"verify history"),
    CLEARTEXT(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout"),"clear text"),
    CLICKCLEAR(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"),"click clear "),
    THEME(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.calculator:id/title\" and @text=\"Choose theme\"]"),"choose Theme"),
    PRIVACYPOLICY(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.calculator:id/title\" and @text=\"Privacy policy\"]"),"privacy policy"),
    VERIFYPRIVACY(By.xpath("//android.widget.TextView[@text=\"Privacy Policy\"]"),"verify privacy page loaded"),
    FEEDBACK(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.calculator:id/title\" and @text=\"Send feedback\"]"),"Send Feedback"),
    VERIFYFEEDBACK(By.xpath("//android.widget.TextView[@text=\"Send feedback to Google\"]"),"verify feedback button clicked"),
    CLOSEFEEDBACK(By.xpath("//android.widget.ImageButton[@content-desc=\"Close Feedback\"]"),"click close feedback"),
    CLICKDISCARD(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"),"click discard"),
    HELP(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.calculator:id/title\" and @text=\"Help\"]"),"Help"),
    VERIFYHELP(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.gms:id/product_name\"]"),"verify the help"),
    DARKMODE(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Dark\"]"),"Daek mode"),
    LIGHTMODE(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Light\"]"),"Light mode"),
    SYSDEF(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"System default\"]"),"System Default"),
    CLICKCANCEL(By.xpath("//android.widget.Button[@resource-id=\"android:id/button2\"]"),"click cancel"),
    CLICKOK(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]"),"click ok");



    private final By xpath;
    private final String descp;
    PageEnums(By xpath, String descp) {
        this.xpath=xpath;
        this.descp=descp;
    }

    public By getXpath(){
        return xpath;
    }
    public String getDescp(){
        return descp;
    }
}
