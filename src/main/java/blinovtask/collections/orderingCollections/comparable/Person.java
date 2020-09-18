package blinovtask.collections.orderingCollections.comparable;

public class Person implements Comparable<Person>{// для включения в TreeSet нужно реализовать Comparable<T>
    // и переопределить метод compareTo()
    private int personID;
    private String name = "";
    public Person(){
    }

    public Person(int personID, String name) {
        this.personID = personID;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        int result = personID - o.personID;// из первого вычетаем переданный - сортировка по возрастанию
//        int result = -(personID - o.personID);// из послнднего вычетаем переданный - сортировка по убыванию

        int value = 0;
        if (result > 0){
             value = 1;
        } else if (result< 0){
             value = -1;
        }
        return value;// это сортировка по personID
        // если хотим сделать сортировка по name:
        // return name.compareTo(o.name); - сортировка по возрастанию
    }
}

