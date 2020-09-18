package blinovtask.staticAttributes;

public class Student {
    static String faculty;
    private long studentId;

    static {
        faculty = "MMF"; //статический логический блок вызывается 1-ым,только один раз, может использовать только
        // статические поля
//        int j = 1 / 0; // если java машина в статическом блоке натыкается на такое,
        // выбрасывает Error и дальше программа не выполняется
    }

    public Student(long studentId) {
        this.studentId = studentId;
    }

    public static void convertFaculty(String head) {
        System.out.println(head + faculty.toLowerCase()); // статический метод вызывается без объектов класса
//        System.out.println(studentId); // в статическом методе нельзя вызвать нестатичкское поле
//        this.studentId//  нет доступа к ссылке this
    }
}
