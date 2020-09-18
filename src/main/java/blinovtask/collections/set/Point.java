package blinovtask.collections.set;

import java.util.HashSet;
import java.util.Set;

public class Point {
    private int x;

    public Point(int x) {
        this.x = x;
    }

    public int hashCode() {
        return 2;
    }

    public static void main(String[] args) {
        Point point1 = new Point(1);
        Point point2 = new Point(1);
        Set<Point> set = new HashSet<Point>();
        set.add(point1);
        set.add(point2);
        System.out.println(set.size());

    }
}
//
//output: 2
// метод equals() hashCode() если переопределены! используется классом HashSet для эффективного размещения
// объектов, заносимых в коллекцию.
