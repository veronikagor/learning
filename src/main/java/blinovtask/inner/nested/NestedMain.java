package blinovtask.inner.nested;

public class NestedMain {
    public static void main(String[] args) {
        Owner.ValueComparator valueComparator = new Owner.ValueComparator();// в отличие от внутренних классов,
        //доступ к которым только через создание объекта внешнего класса, вложенные классы(static) можно вызывать вот так
        // через имя внешнего класса
    }
}
