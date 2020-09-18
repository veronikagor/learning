package blinovtask.inheritance;

public class Dog extends Animal {
   protected Float defineAge(){ // Integer тоже подходит
        System.out.println(" ");
        return 5f;
    }
}
//при переопределении метод может иметь более конкретный тип возвращаемого значения.
// но не может быть менее доступным