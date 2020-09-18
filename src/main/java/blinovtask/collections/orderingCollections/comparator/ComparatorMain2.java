package blinovtask.collections.orderingCollections.comparator;

import java.util.ArrayList;

public class ComparatorMain2 {
    public static void main(String[] args) {
        ArrayList<Person2> list = new ArrayList<>();
        list.add(new Person2(701, "Bob"));
        list.add(new Person2(571, "Robert"));
        list.add(new Person2(840, "Jack"));
        list.add(new Person2(347, "Peter"));
        System.out.println(list);
        list.sort(new Person2.NameComparator());// c помощью метода sort() в который передается объект
        // внутреннего класса NameComparator можно отсортировать коллекцию
    }
}
