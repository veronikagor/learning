package blinovtask.abstracts;

public class Sedan extends Car1 {

    @Override
    public void brake() { // если метод помечен словом abstract, каждый класс-наследник должен
        // его реализовать или быть объявленным как абстрактный. Иначе компилятор выбросит ошибку.

    }

//    @Override
//    public void brake() {
//        System.out.println("Седан тормозит!");
//    }

}