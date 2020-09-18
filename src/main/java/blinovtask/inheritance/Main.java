package blinovtask.inheritance;

import blinovtask.inheritance.constructors.A;
import blinovtask.inheritance.constructors.B;
import blinovtask.inheritance.constructors.C;

public class Main {

    public static void main(String[] args) {
        A object1 = new A();
        C object2 = new C();
        object1 = object2; // 1. yes   C -> A
        object1 = (B) object2; //2. yes  C -> B
        object1 = new C(); //3. yes  C -> A

        /* Первый, второй, третий варианты верны, так как
        объекту родительского класса можно присвоить объект дочернего класса.

*/
// object1 = (C) new B(); //! class BlinovTask.inheritance.ConstructorsThis.B cannot be cast to class BlinovTask.inheritance.ConstructorsThis.C
/* Четвёртый вариант неверный так как невозможно преобразовать объект
родительского класса к дочернему(B -> C), но объект дочернего класса
можно преобразовать к объекту родительского (как во втором варианте).*/
//
        C object3 = (C) object1;
    }
}
