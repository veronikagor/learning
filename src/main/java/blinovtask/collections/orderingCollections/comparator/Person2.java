package blinovtask.collections.orderingCollections.comparator;

import java.util.Comparator;

public class Person2 {// здесь Comparator может быть реализован как внутренний класс
    private int personID;
    private String name = "";
    public Person2(){
    }

    public Person2(int personID, String name) {
        this.personID = personID;
        this.name = name;
    }

        public static class NameComparator implements Comparator<Person2>{// внутренний класс
            public int compare(Person2 o1, Person2 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
