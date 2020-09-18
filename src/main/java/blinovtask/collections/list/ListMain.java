package blinovtask.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(42);
        list.add(null);
        list.add(42);
        list.add(77);
        list.add(5, 87);// output: [5, 7, 42, null, 42, 87, 77]

        //int value = list.get(3);// получить элемент с 3 позиции(null)  - nullPointException, поэтому
        Integer value1 = list.get(3); // запоковываем в Integer

        int index = list.indexOf(1);// найти индекс элемента - output: 7

        list.remove(Integer.valueOf(42));// удалить элемент 42 - [5, 7, null, 42, 87, 77]

        list.subList(1, 3); // [7, null ]
    }

}
// List могут содержать null
// Интерфейс List конструктора не имеет по определению. List<String> a = new list<>(); a.add("s") -
// поэтому так не создать лист

       /* ArrayList(для поиска, извлечения - чаще!) vs LinkedList(для операций по добавлению) */
       /* 1. выделение доп. памяти  для вставки */
//  при выполнении метода ArrayList.add() если в массиве достаточно места для добавления новых элементов,
//  то дополнительное место в памяти не выделяется, иначе происходит создание нового массива с размерностью
//  в 1,5 раза больше старого(10 элементов изначально)
// Класс ArrayList содержит конструкторы вида ArrayList(), ArrayList(int capacity) и ArrayList(Collection c).
//не синхронизируется.


//при выполнении метода LinkedList.add() создается один новый экземпляр вложенного класса Node, поэтому вставка
// элементов выполняется быстрее на концах списка (в середину примерно одинаково)
// обратный итератор в LinkedList - descendingIterator()
// + LinkedList расширяет Queue и Deque, поэтоиму работа с элеиентами в конце списка быстрее

      /* 2. занятая  память */
//хранение одного примитива типа byte в ArrayList - 1 байт (потому что это массив)

// хранение одного примитива типа byte в LinkedList - 32 байт(потому что каждый элемент хранит ссылку на
// пердыдущий следующий и ссылку на данные (по 4 байта) + объект Node (8 байт) + примитивы что упаковывается(8 байт) )

/* 3. скорость поиска */
// при выполнении метода ArrayList.getIndex() время затрачивается всегда одиеаковое не зависимо от длинны массива

//при выполнении метода LinkedList.getIndex() время затрачивается прямо пропорционально длинне списка