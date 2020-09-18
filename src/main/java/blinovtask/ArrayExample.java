package blinovtask;

public class ArrayExample {
    static int[] arr; // не проинициализирован


    static {
        int val = arr[0];
    }

    public ArrayExample(int[] arrMain) {
        this.arr = arrMain;
    }

    public static void main(String[] args) {

        int[] arrMain = {2, 5, 7, 8, 3, 0};
        new ArrayExample(arrMain); // Создание объекта класса ArrayExample
        System.out.println(arr[0]);

    }
}

