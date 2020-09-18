package blinovtask;

public class UnaryOperatorsAndBinaryOctalHex {
    public static void main(String[] args) {

        byte b = 15;
        float f = 5;
        //b = b/f; //требуется приведение типов
        b /= f;// не требуется приведение типов
        b /= 6.8;// 6.8 - double

             /* разница х++ и ++х  */
        int x = 1;
        x = x++;
        System.out.println(x);// 1
        int y = 1;
        y++;
        System.out.println(y);//2

               /* системы исчисления */
        int i = 100;//десятичная
        System.out.println(Integer.toBinaryString(i));//перевод в двоичную систему : 1100100
        int i1 = 0b1100100;
        System.out.println(i1);//100

        int j = 100;
        System.out.println(Integer.toOctalString(j)); //в восмеричную: 144
        int j1 = 0144;
        System.out.println(j1);//100

        int g = 100;
        System.out.println(Integer.toHexString(g)); //в шестнадцатериечную: 64
        int g1 = 0x64;
        System.out.println(g1);//100

    }
}
