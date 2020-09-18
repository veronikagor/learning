package blinovtask.collections.orderingCollections.comparator;

import java.util.Comparator;// может быть реализован как внешний(PersonNameComparator) или внутренний класс

public class PersonNameComparator implements Comparator<Person1> {//
    @Override
    public int compare(Person1 o1, Person1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
