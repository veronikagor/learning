package blinovtask.inheritance.overloading;

public class ConstructorOverloading {

    ConstructorOverloading(int i) {
        System.out.print("Constructor");
    }

    public static void main(String[] args) {
        ConstructorOverloading quest = new ConstructorOverloading(); //1
    }

    public ConstructorOverloading() {
       System.out.println(" 456 ");

    }

    {
        new ConstructorOverloading(1);// Метод или логический блок могут вызывать конструктор
        // только с помощью оператора new.
    }
}

