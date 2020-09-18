package blinovtask;

import java.math.BigDecimal;

public class BigDecimalAndBigInteger {
    public static void main(String args[]){
        BigDecimal b1 = new BigDecimal("23.43");
        BigDecimal b2 = new BigDecimal("23.43");
        BigDecimal b3 = new BigDecimal("24");

        System.out.println(b1.compareTo(b2) == 0); //true: compareTo возвращает 0 при равенстве
        System.out.println(b1.compareTo(b3) == 1); //false

        System.out.println(b1.equals(b2)); //true: одинаковое значение и маштаб!
        System.out.println(b1.equals(new BigDecimal("23.43"))); //true
        System.out.println(b1 == b2); //false

        b2 = b2.add(new BigDecimal("0.57"));// b2=24.00  b3=24 //маштаб
        System.out.println(b3.equals(b2)); //false

        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);//false

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.print(i3 == i4);//true
    }
}
