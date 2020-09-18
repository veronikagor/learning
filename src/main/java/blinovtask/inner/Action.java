package blinovtask.inner;
/* Inner classes in interface */

public interface Action {
    default void newService2() {
    }

    static void newService() {
    }

    public static class StaticService {// по умолчанию все внутренние классы в интерфейсе public static

        static void service() {//static
        }

        void service2() {//nonstatic
        }


    }
}

class A {
    interface B {} //бывают вложенные интерфейсы
    void method() {
//     interface C {} // но не бывает локальных вложенных интерфейсов
    }

}
