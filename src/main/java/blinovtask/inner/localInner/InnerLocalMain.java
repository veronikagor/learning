package blinovtask.inner.localInner;

import blinovtask.inner.Student;

public class InnerLocalMain {
    public static void main(String[] args) {
        AbstractTeacher teacher = TeacherCreator.createTeacher(6);
        System.out.println(teacher.getClass());
        boolean result = teacher.excludeStudent(new Student());
        System.out.println(result);

        teacher = TeacherCreator.createTeacher(678);
        System.out.println(teacher.getClass());
        result = teacher.excludeStudent(new Student());
        System.out.println(result);
    }
}
// output:
//class blinovTask.innerClassesInheritance.localInnerClasses.TeacherCreator$1Rector// $1Rector - это первый внутренний класс
//true
//class blinovTask.innerClassesInheritance.localInnerClasses.Teacher
//false