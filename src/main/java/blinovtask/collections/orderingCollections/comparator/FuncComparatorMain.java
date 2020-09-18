package blinovtask.collections.orderingCollections.comparator;

import java.util.ArrayList;

public class FuncComparatorMain {
    public static void main(String[] args) {
        ArrayList<Person1> list = new ArrayList<>();
        list.add(new Person1(7, "Bob"));
        list.add(new Person1(84, "Jack"));
        list.add(new Person1(32, "Jack"));
        list.add(new Person1(5, "Bob"));
        list.add(new Person1(40, "Jack"));
        list.add(new Person1(3, "Bob"));
        System.out.println(list);
        list.sort((o1, o2) -> o1.getPersonID() - o2.getPersonID());// c помощью метода sort() и лямбда (вожможно потому что )
        // в который можно отсортировать коллекцию
    }
}
