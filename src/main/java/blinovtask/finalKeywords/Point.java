package blinovtask.finalKeywords;

public final class Point { // от final класса нельзя унаследоваться
    private final int MAX_RANGE = 1_000; //напритер хотим создать предельное значеник для int x,
    // предельное чисо final поля нельзя переопределить
    final StringBuilder builder = new StringBuilder();
    private int x;
    private String name;

    public Point(int x) {
        this.x = x;
//        builder = new StringBuilder(); // переприсвоить значение builder нельзя, но
        builder.append("hello");// внутреннее состояние объекта дополнить можно!
    }
        final int length() {
            return Math.abs(1200); // В классах-наследниках переопределить метод final нельзя
        }
    }

