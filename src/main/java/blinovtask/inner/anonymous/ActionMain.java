package blinovtask.inner.anonymous;

public class ActionMain {
    public static void main(String[] args) {
        Action action = () -> System.out.println("interface");// все лямблда выражения являются частным случаем
        // анонимных классов и работают при наличии только 1 метода для переорпределения
//            @Override
//            public void logic2() {
//            }
//        };
        action.logic1();
    }
}
// здесь анонимный класс является реализацией интерфейса, в котоором должны быть реализованы все методы интерфейса


/* все то же самое только без лямблды внизу -> */

//    public static void main(String[] args) {
//        Action action = new Action() {
//            @Override
//            public void logic1() {
//                System.out.println("interface");
//            }
//
//            @Override
//            public void logic2() {
//
//            }
//        };
//        action.logic1();
//    }