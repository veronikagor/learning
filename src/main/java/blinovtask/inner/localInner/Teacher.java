package blinovtask.inner.localInner;

import blinovtask.inner.Student;

public class Teacher extends AbstractTeacher {

    public Teacher(int id) {
        super(id);
    }
    @Override
    public boolean excludeStudent(Student student){
        return false;
    }
}
