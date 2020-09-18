package blinovtask.collections.set.enumSet;

import java.util.EnumSet;

public class Quest {
    public static void main(String[] args) {
        EnumSet<Counter> countSet1 = EnumSet.range(Counter.TRES, Counter.CINCO);// [TRES, CUATRO, CINCO]
        EnumSet<Counter> countSet2 = EnumSet.complementOf(countSet1); // исключение элементов
        System.out.println(countSet2);
    }
}
// конструктор не доступен EnumSet
// range - используется для создания набора перечислений с элементами, определенными заданным диапазоном
// в параметрах.

// EnumSet<T> complementOf(EnumSet<T> s)
//создается множество, содержащее все элементы, которые отсутствуют в указанном множестве s.

// output:
 // UNO, DOS, SEIS, SIETE