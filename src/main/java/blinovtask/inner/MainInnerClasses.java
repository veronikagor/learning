package blinovtask.inner;
          /* visibility */

public class MainInnerClasses {
    public static void main(String[] args) {
        Student.Address address = new Student().new Address(); //1 вариант -  создаем объект кл Address через создание объекта кл Student

        Student student = new Student();
        Student.Address address1 = student.getAddress();// 2 вариант...
    }
}
// видны только public, protected, default внутренние кл - все кроме private кл