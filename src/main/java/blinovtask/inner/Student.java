package blinovtask.inner;

import java.io.Serializable;
/** Вложенный класс (nested classes) представляет собой класс, который объявлен внутри объявления другого класса.
 Вложенные классы могут быть статическими и нестатическими. Нестатические вложенные классы имеют
  и другое название — внутренние классы (inner classes).

Внутренние Java классы делятся на три вида :

внутренние классы-члены;
локальные классы;
анонимные классы.

 Внутренние классы-члены (member inner classes) ассоциируются не с самим внешним классом, а с его экземпляром.
Такие классы имеют доступ ко всем полям и методам внешнего класса.

 Локальные классы (local classes) определяются в блоке java кода. На практике чаще всего объявление
происходит в методе некоторого другого класса. Хотя объявлять локальный класс можно внутри статических
и нестатических блоков инициализации.

 Анонимный класс (anonymous class) — это локальный класс без имени.

Из внутреннего нестатического класса можно обратиться к нестатическому полю внешнего класса с использованием
наименования внешнего класса и оператора this. Например, OuterClass.this.fieldName.
*/
public class Student {
    private int studentId;
    private String name;
    private int group;
    private int city;// ->
    private static int coeff;

    private Address address;

    public class Address extends Thread implements Serializable { // видны только public, protected, default внутренние кл - все кроме private кл
        private String email;
        private int phoneNumber;// для созлания объекта внутреннего кл нужен внешний кл
        private int city; // у внут и внеш кл могут быть одинаковые поля,
        public void setCity(int city) {
            this.city = city + Student.this.city + coeff;// но вызов поля из внешнего кл через имя внешнего кл,
            // кроме static полей
        }

        public Address() {
        }

        int param = group;
        public void action() {
            name = "Tad"; // а внутренний кл(!) видит поля внешнего и private тоже
        }
    }
    // внутренний кл не может объявлять static поля, методы и блоки


    public Student() {
    }

    public Address getAddress() {
        return address;
    }

    public void operation() {
//     phoneNumber = 12345;//
        address.phoneNumber = 12345; // а так можно - через объект внешнего кл - внешний кл(!)не видит
        // поля внутреннего
// ни private ни public
    }
}
