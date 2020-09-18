package blinovtask.collections.orderingCollections.comparator;

import java.util.ArrayList;

public class ComparatorMain1 {
    public static void main(String[] args) {
        ArrayList<Person1> list = new ArrayList<>();
        list.add(new Person1(701, "Bob"));
        list.add(new Person1(571, "Robert"));
        list.add(new Person1(840, "Jack"));
        list.add(new Person1(347, "Peter"));
        System.out.println(list);
        list.sort(new PersonNameComparator());// c помощью метода sort() в который передается объект
        // new PersonNameComparator() можно отсортировать коллекцию

//        Collection.sort(list, new PersonNameComparator());// то же самое c помощью метода sort()
//        Данная реализация сбрасывает список в массив, сортирует массив, затем проходит по списку и
//        перезагружает каждый элемент списка из соответствующего элемента массива. Это позволяет избежать
//        сложности n*n log(n), которая возникла бы при попытки отсортировать связный список напрямую
    }
}
//https://metanit.com/java/tutorial/5.6.php - про Comparable и Comparator
// Comparable обеспечивает "натуральное упорядочивание"