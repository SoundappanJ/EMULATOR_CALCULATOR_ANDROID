package TestData;

public class TestData {
    public static String getExpectedData(String key){
        return switch (key.toLowerCase()){
            case "expected add ans"->"3";
            case "expected sub ans"->"1";
            case "expected multi ans"->"35";
            case "expected div ans"->"3";
            case "expected div by zero ans"->"Can't divide by 0";
            case "expected clear text ans"->"";
            case "expected chain operation ans"->"13.85714285714";
            case "expected backspace ans"->"473";
            case "expected decimal point ans"->"5.3";
            case "expected sqrt ans"->"2";
            case "expected pi ans"->"21.99114857512";
            case "expected power ans"->"64";
            case "expected factorial ans"->"5040";
            case "expected invsin ans"->"0";
            case "expected invcos ans"->"0";
            case "expected invtan ans"->"45";
            case "expected invexp ans"->"54";
            case "expected invtenpower ans"->"10000";
            case "expected euler ans"->"10";
            case "expected naturallog ans"->"1.38";
            case "expected log ans"->"1.098612288668";
            case "expected privacy policy text"->"privacy poicy";
            case "expected feedback title"->"Send feedback to google";
            case "expected help title"->"help";


            default -> throw new IllegalStateException("Unexpected value: " + key.toLowerCase());

        };
    }
}
