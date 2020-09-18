package codewars;

public class Calculator {
    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {

        if(operation.charAt(0) == '+'){
            return  numberOne + numberTwo;

        }
        if(operation.charAt(0) == '-'){
            return numberOne - numberTwo;

        }
        if(operation.charAt(0) == '/' && numberTwo != 0){
            return numberOne / numberTwo;

        }
        if(operation.charAt(0) == '*'){
            return Math.abs(numberOne * numberTwo);

        }

        return null;
    }
}


//public class Calculator {
//    public static Double calculate(final double x, final String op, final double y) {
//        switch (op) {
//            case "+": return x + y;
//            case "-": return x - y;
//            case "*": return x * y + 0.0;
//            case "/": return y == 0 ? null : x / y;
//        }
//        return null;
//    }
//}