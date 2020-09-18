package blinovtask;

public class LocalVariable {
    static int j = 2;

    public static void result(int i) {
        i *= 10; //Ошибка компиляции не возникнет, так как тип char преобразуется к большему по размеру типу int.
        // Значение локальной переменной i не изменится,так как она передается в метод по значению.
        // В то же время метод может изменять значения переменных класса.
        j += 2;
    }

    public static void main(String[] args) {
        char i = '1'; //локальная переменная i
        result(i);
        System.out.println(i + " " + j);
    }
}