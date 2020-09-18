package blinovtask.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class InstanceOf {
    public static void main(String args[]) {
        Object ob = new HashSet();
        System.out.print((ob instanceof Set) + ", ");
        System.out.print(ob instanceof SortedSet); //Интерфейс SortedSet предназначен для создания коллекций,
        // которые хранят элементы в отсортированном виде (сортировка по возрастанию).
        // SortedSet расширяет интерфейс Set, поэтому такая коллекция опять же хранит только уникальные значения.
    }
}

// Оператор instanceof нужен, чтобы проверить, был ли объект, на который ссылается переменная X,
// создан на основе какого-либо класса Y.

//Оператор instanceof проверяет именно происхождение объекта, а не переменной.
//Поэтому в примере первпя строка в консоли выведет true: у нас объект типа HashSet. Естественно, он был создан
// на основе класса HashSet, но и на основе родительского класса Set тоже!

// Интерфейс SortedSet реализует класс TreeSet. Проверка instanceof проводится не по ссылке, а по объекту,
// поэтому false

