package blinovtask.inheritance.overloading;

/*  перегрузка  методов  */

public class MethodOverloading1 {
    public void method(Number obj) {
        System.out.print("1");
    }

    public void method(Character obj) {
        System.out.print("2");
    }

    private static void method(Integer obj) {
        System.out.print("3");
    }

    public void method(int i) {
        System.out.print("4");
    }

    public void method(double d) {
        System.out.print("5");
    }

    public static void main(String[] args) {
        MethodOverloading1 quest = new MethodOverloading1();
        Number n = 67;
        Integer i = 78;
        quest.method(n);
        quest.method(i);
    }
}
// output:   13
//Для разрешения перегрузки сначала ищется метод, тип формального параметра которого совпадает
// с типом фактического параметра, и только в случае неудачи ищется другой метод,
// к типу формального параметра которого можно преобразовать передаваемый объект.