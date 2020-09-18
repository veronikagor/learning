package blinovtask;

public class Zero {

    public static void main(String [] args){
        double a, b, c, d, sum, sumBC, comAB;
        a = -3.0 / 0;//-Infinity
        b =  3.0 / 0;//Infinity
        c = 0 / 4.0;// 0
        d = 0 / 0.0;// Infinity
        sum = a + b + c + d; // NuN
        sumBC = b + c;//Infinity
        comAB = a * b;//-Infinity
        System.out.println(sum + " " + sumBC + " " + comAB);


        double x = 0, y = 2, z;
        z = y / x;
        System.out.println ("z = " + z);
    }
}
