package blinovtask;

public class Array {


    int a1[] = {};
    int a2[] = new int[]{1, 2, 3};
    int a4[] = new int[3];
//    int a5[] = new int[3]{1,2,3}; // no! двойное объявление


    char[] mas3 = new char[]{'a', 'b', 'c'};
//    char[] mas1 = new Character [] {'a', 'b', 'c'};// new Character ! нельзя

    Integer mas2[] = new Integer[24];

    Array[] mas4 = new Array[]{new Array(), new Array()};
//  Array [] mas3 = new Array  {new Array (), new Array ()}; // no!

    double[] mas5 = {5, 10, 15, 20};
    int[] mas6[] = new int[4][5];
    int mas7[][] = new int[4][];


    static Object obj[];

    public static void main(String[] args) {
        System.out.print(obj); // null
    }

    public static void arrayReference() {
        int[] arr = {42, 1};
        Object object = arr;// масивы это объкты им можно присвоить ссылку не объект
        int[] x = ((int[]) object);// object  to  int[]
        int y = ((int[]) object)[0];// вытягиваем 1-ый элемент object [0]

        int [][] multi = {{2, 3}, {4, 56}};
        object = multi;
        object = multi[0];

        double [] dArray;
//        dArray = (double[]) arr;  // нельзя перобразовать массив одиного типа в  массив другого типа
        dArray = (double[]) object; //скомпилируется но выбросит ощибку cast
    }


}

