package blinovtask;

import java.util.Objects;

public class EqualsAndHashCode {
    public static void main(String[] args) {
        Aa a1 = new Aa(1);
        Aa a2 = new Aa(1);
        System.out.print(a1 == a2);
        System.out.print(", " + a1.equals(a2));
        System.out.print(", " + Objects.equals(a1, a2));
        System.out.print(", " + Objects.deepEquals(a1, a2));
    }

    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
// output:
//false, true, true, true -  с переопределением

// output:
// false false false false - без переопределения метода equals или hashCode

// 1. Если два объекта равны (т.е. метод equals() возвращает true), у них должен быть одинаковый хэш-код.
//Иначе наши методы будут лишены смысла. Проверка по hashCode(), должна идти первой для повышения быстродействия.
//
// Если хэш-коды будут разными, проверка вернет false, хотя объекты на самом деле равны
// (согласно нашему определению в методе equals()).
//
//Если метод hashCode() вызывается несколько раз на одном и том же объекте, каждый раз он должен возвращать
// одно и то же число. Во время работы значение hash-кода не меняется, если объект не был изменен.
//
//Правило 1 не работает в обратную сторону. Одинаковый хэш-код может быть у двух разных объектов.