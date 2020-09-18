package blinovtask.inheritance.constructors;

/*   this()   */

public class B extends A {
    B() {
        this("");
        System.out.println("B: no arguments");
    }
    B(String args) {
        super("");
        System.out.println("B: one argument");
    }
}
// В иерархии классов конструкторы вызываются в порядке наследования,
// начиная с суперкласса и заканчивая подклассом.
// Ключевое слово this представляет текущий экземпляр класса,
// а ключевое слово super - текущий экземпляр родительского класса.
// В данном примере сначала вызовется конструктор без параметров родительского класса A,
// затем вызовется конструктор без параметров дочернего класса B,
// здесь через ключевое слово this вызовется конструктор с параметрами класса В,
// в этом конструкторе через ключевое слово super вызовется конструктор с параметрами родительского класса A.