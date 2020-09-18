package blinovtask.inner.localInner;

import blinovtask.inner.Student;

public class TeacherCreator {
    public static AbstractTeacher createTeacher(int id) {
        class Rector extends AbstractTeacher {
            Rector(int id) {
                super(id);
            }
            @Override
            public boolean excludeStudent(Student student) {
                if (student != null) {
                    return true;
                } else {
                    return false;
                }
            }

        }
        if (isRectorID(id)) {
            return new Rector(id);
        } else {
            return new Teacher(id);
        }
    }

    private static boolean isRectorID(int id) {
        return (id == 6);
    }
}
