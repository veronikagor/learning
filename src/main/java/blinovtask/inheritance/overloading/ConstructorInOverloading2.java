package blinovtask.inheritance.overloading;
// конструеторы не бывают переопределены но бывают перегружены!
public class ConstructorInOverloading2 {
    ConstructorInOverloading2(int i) {
        System.out.println("Конструктор");
    }

    public static void main(String[] args) {
        ConstructorInOverloading2 s = new ConstructorInOverloading2(); // не скомпилируется если не создать
        // конструктор без параметров для него !
        new ConstructorInOverloading2(1); // тянет конструктор с параметром
    }

    public ConstructorInOverloading2() {
        super();
        this.getClass();
        System.out.println("empty");
    }


    //логический блок
    {
    }
}

/* вывод
 empty
 Конструктор */


//Аннотацию @Override к статическим методам применять нельзя.
// Статические методы можно перегружать в подклассах,
// доступность таких методов зависит от типа ссылки и атрибута доступа.

// При динамическом связывании версия вызываемого метода определяется
// на этапе выполнения.