package blinovtask.inheritance.overriding;

/* полиморфизм  -  переопределение */
class ChildClass extends ParentClass {
     String version = "2.0 A";
    public void parentMethod(int i) {
        System.out.println("parentMethod ChildClass" + i);
    }
    public void childMethod(int i) {
        System.out.println("childMethod ChildClass" + i);
    }
    public static void main(String args[]) {
     ParentClass quest = new ChildClass ();   // 1
        quest.parentMethod(1);   //При вызове метода в данном случае будет использоваться механизм
        // позднего связывания, поэтому будет вызван метод не на основе типа ссылочной переменной,
        // а на конкретном объекте, т.е будет вызван метод класса ChildClass.
        ((ChildClass) quest).childMethod(1);   // quest.childMethod(1); - compiler error - попытке вызова
        // метода, принадлежащего только подклассу, через ссылку на суперкласс, через которую он просто недоступен.

        System.out.println(quest.version); //Поля в Java не являются полиморфными,
        // поэтому будет обращение к полю на основе типа ссылочной переменной.
    }
}
//output:
// parentMethod ChildClass1
//childMethod ChildClass1
// 1.0 A