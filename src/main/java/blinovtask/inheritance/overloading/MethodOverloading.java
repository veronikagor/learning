package blinovtask.inheritance.overloading;

public class MethodOverloading {
        public static void main(String[] args) {
            A a = new B();
            a.method(42);
        }
    }

    class A {
        public void method(Object obj) {
            System.out.println("A");
        }
    }

    class B extends A {
        public void method(Integer obj) {
            System.out.println("B");
        }
    }

// output: A
//в данном случае в классе B метод method перегружается, а не переопределяется,
// так как изменяется тип аргумента, поэтому вызывается метод класса A.
