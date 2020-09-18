package blinovtask.inheritance.constructors;

public class Car {
    protected int wheelCount; // //Переменная wheelCount класса Car не может быть объявлена с модификатором доступа
    // private, так как в классе-наследнике SuperCar к данной переменной нельзя получить доступ,
// поэтому делаем protected int wheelCount;
    private String model;

    public Car(String model) {
        this.model = model;
        this.wheelCount = 4;
    }
}