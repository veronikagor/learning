package blinovtask.inheritance.overloading;

public class ConstructorDefaultA {
    ConstructorDefaultA(int i) {}
    ConstructorDefaultA() {}// без этого конструктора поумолчанию будет ошибка компиляции в class ConstructorDefaultB

}// 1

// В иерархии классов конструкторы вызываются в порядке наследования,
// начиная с суперкласса и заканчивая подклассом.

