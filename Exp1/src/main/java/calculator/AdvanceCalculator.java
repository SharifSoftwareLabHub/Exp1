package calculator;

public class AdvanceCalculator {
    public static final String MulOp = "*";
    public static final String PowOp = "^";
    public static final String divOp = "/";
    public double Calculate (int a, int b, String operator) {

        switch (operator){
            case MulOp:
                return a*b;
            case PowOp:
                return Math.pow(a, b);
            case divOp:
                return (double)a / (double)b;
            default:
                throw new IllegalStateException(String.format("Unexpected value: %s", operator));
        }
    }
}
