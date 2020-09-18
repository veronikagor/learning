package blinovtask;

public class Infinity {
    public static void main(String[ ] args){
        Double d = Double.POSITIVE_INFINITY;
        double d1 = d.intValue() + Double.NEGATIVE_INFINITY;
        System.out.println(d1);
    }
}
