package blinovtask;

public class Unsigned {

    /* неподписанная арфметика (без знаков) */
    public static void main(String[] args) {
        long a = Long.remainderUnsigned(-2, 3);// -2/3 =2 (без знаков)
        int b = Integer.remainderUnsigned(-2, 3); // -2%3 =2 (без знаков)
        int c = -2 % 3;// -2
        System.out.println(a + " " + b + " " + c);


        /*  бинарные операторы */
        // <<  //  >>
        int x = 65;//значение
        int y = 3;//количество: не больше чем на 32-7=26 ячеек (32 бита в int, 7 в значении 65)
        int z = (x << y);
        System.out.println(Integer.toBinaryString(x)); //1000001
        System.out.println(Integer.toBinaryString(z)); //1000001000 // add three null
        System.out.println(z); //520
        // при каждом сдвиге влево выполняется умножение числа на 2


        int x1 = 65;//значение
        int y1 = 3;//количество: не больше чем на 7 ячеек (7 в значении 65)
        int z1 = (x1 >> y1);
        System.out.println(Integer.toBinaryString(x1)); //1000001
        System.out.println(Integer.toBinaryString(z1)); //1000 // delete three null
        System.out.println(z1); //8
        // при каждом сдвиге вправо выполняется деление числа на 2
        //  В случае сдвига влево и беззнакового сдвига вправо > новые биты просто устанавливаются в ноль.
        // Беззнаковый сдвиг вправо >> не учитывает знак числа.

        int x2 = -65;//значение
        int y2 = 2;
        int z2 = (x2 >> y2);
        System.out.println(Integer.toBinaryString(x2)); //  11111111111111111111111110111111
        System.out.println(Integer.toBinaryString(z2)); //11111111111111111111111111101111 // save "-"
        System.out.println(z2); //-17
        //  В случае сдвига вправо со знаком новые биты принимают значение старшего (самого левого) бита
        //  перед сдвигом: 0 для положительных чисел, 1 - для отрицательных.
    }
}

