package blinovtask.inner;

public class InterfaceMain {
    public static void main(String[] args) {
        Action.StaticService.service();// вызов static метода из вложенного класса интерфейса
        Action.newService();// просто вызов static метода из интерфейса

        new Action.StaticService().service2();// вызов default метода из вложенного класса интерфейса - нужен объект!
        new Action(){}.newService2();//вызов default метода из интерфейса(Action(){} - представлляет собой внутренний кп)
//последнее - так можно уже c java8
    }
}
