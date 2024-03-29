package blinovtask.abstracts;

public abstract class Car1 {
    private String model;
    private String color;
    private int maxSpeed;

    public Car1() {
    }

    public Car1 (String model, String color) {
        this.model = model;
        this.color = color; // в абстрактном классе можно объявить и определить
        // конструкторы (можно использовать для задания начальных значений общих переменных,
        // объявленных в абстрактном классе и используемых различными реализациями)
    }

    public void gas() {
        System.out.println("Газуем!");
    }

    public abstract void brake();// если метод помечен словом abstract, каждый класс-наследник должен
    // его реализовать или быть объявленным как абстрактный. Иначе компилятор выбросит ошибку.

    //геттеры и сеттеры

//    Car1 car;//
}
//  в абстрактном классе может не быть ни одного абстрактного метода.

//класс является абстрактным, если хотя бы один из его методов является абстрактным.
// абстрактный метод без тела

//1. Интерфейс описывает только поведение(методы). У него нет состояния(переменных),кроме public static final.
// (но! В Java8 появились дефолтные методы интерфейсов, у которых есть реализация.)
// А у абстрактного класса состояние есть: он описывает и то, и другое.

//2. Абстрактный класс связывает между собой и объединяет классы, имеющие очень близкую связь.
// В то же время, один и тот же интерфейс могут реализовать классы, у которых вообще нет ничего общего.

// 3. Классы могут реализовывать сколько угодно интерфейсов, но наследоваться можно только от одного класса.
// (Абстрактный класс описывает отношения «is a».) - то есть класс-наследник расширяет базовый абстрактный класс,
// а интерфейсы могут быть реализованы разными классами, вовсе не связанными друг с другом.


// 4. в абстрактном классе в Java можно объявить и определить конструкторы.(можно использовать для задания
// начальных значений общих переменных, объявленных в абстрактном классе и используемых различными реализациями.)

//5. абстрактные классы могут реализовывать интерфейсы с помощью ключевого слова implements.
// Поскольку они абстрактные, то не обязаны реализовывать все методы.

//6. Может ли абстрактный класс быть final?
//Нет, не может.(если класс одновременно abstract и final, то у него нет наследников и нельзя
// создать его экземпляр - абсурд)

//7. Может ли абстрактный класс в Java содержать метод main? да! (если не создавать его экземпляров.)

// 8. Могут ли у абстрактного класса в языке Java быть статические методы?
//Да, абстрактные классы могут объявлять и определять статические методы. бывает редко