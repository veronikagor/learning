package blinovtask.inner.nested;

import java.util.Comparator;

public class Owner {
    private int value = 1;
    static int statValue = 2;
public static class ValueComparator implements Comparator<Owner> { // Comparator для сортировки каких-то
    // значений в будуюшем
    @Override
    public int compare(Owner o1, Owner o2) {
        return o1.value - o2.value;// сортировка по возрастанию
    }


//    static int param = statValue;
//    static int param = value; // а вот нестатические поля не видны для вдоженного класса,
//    так как для создания объекта класса ValueComparator не нужно создание объекта класса Owner

    }
}
