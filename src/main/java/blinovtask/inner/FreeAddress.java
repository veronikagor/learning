package blinovtask.inner;

public class FreeAddress extends Student.Address {
    public FreeAddress() {
        new Student().super();  //1 вариант - чтобы унаследоваться нужно создать объект внешнего кл Student
    }

    public FreeAddress(Student student) {
        student.super();  //2 вариант - можно передать Student как параметр
    }
}
