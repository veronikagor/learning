package blinovtask;

public class TypeConvert {

    public static void typeConverterExample() {
        int a = 129;
        byte b = 3;
        Object ab = (byte) a + b;
        System.out.println(ab.getClass().getName() + " value: " + ab);
    }
    public static void typeConverterExample2() {
        long a = 2147483647000L;
        int b = 1;
        b += a;
        Object ab = (Object) b;
        System.out.println(ab.getClass().getName() + " value: " + ab);
    }

    public static void main(String[] args) {
        typeConverterExample();
        typeConverterExample2();
    }
}