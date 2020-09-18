package blinovtask;

public class ForEach3 {
    public static void main(String[] args) {
        String[] strings = {"Java", "epam", "blinov"};
        for (String elem : strings ) {
            elem += 11; // через for each добавить 11 и сохранить изменения к неизменяемым типам(String и базовые) нельзя!
        } // только через обычный for


        StringBuilder[] stringBuilders = new StringBuilder[3];
        stringBuilders [0] = new StringBuilder("Java");
        stringBuilders [1] = new StringBuilder("epam");
        stringBuilders [2] = new StringBuilder("blinov");
        for ( StringBuilder elem : stringBuilders ) {
            elem.append(12) ; //но если объект ссылочного типа изменяемый - внутреннее сосотояние этого объекта изиенить можно!
        }

        for (String elem : strings ) {
            System.out.println(elem);
        }

    }
}
// вывод Java, epam, blinov
//       Java12, epam12, blinov12