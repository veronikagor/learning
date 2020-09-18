package blinovtask.inheritance.overloading;

public class ConstructorChild extends ConstructorParent {
private int yearOfStudy;

    public ConstructorChild(int yearOfStudy) {
        super();
        this.yearOfStudy = yearOfStudy;
    }

    public ConstructorChild(int id, String name, int yearOfStudy) {
        super(id, name);
        this.yearOfStudy = yearOfStudy;
    }

    /*  this()  */

    public ConstructorChild(int id, int yearOfStudy) {
//        super(); //
        this(yearOfStudy);// this() обращается к своему конструктору  - public ConstructorChild(int yearOfStudy),
        // поэтому this() вместе с super() не живут
    }

}
//В иерархии классов конструкторы вызываются в порядке наследования,
// начиная с суперкласса и заканчивая подклассом.