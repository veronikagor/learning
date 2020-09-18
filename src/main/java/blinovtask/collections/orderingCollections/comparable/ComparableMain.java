package blinovtask.collections.orderingCollections.comparable;

import java.util.TreeSet;

public class ComparableMain {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<Person>();
        set.add(new Person(701, "Bob"));
        set.add(new Person(571, "Robert"));
        set.add(new Person(840, "Jack"));
        set.add(new Person(347, "Peter"));
        System.out.println(set);
    }
}
