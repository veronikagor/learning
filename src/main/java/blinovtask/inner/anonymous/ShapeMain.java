package blinovtask.inner.anonymous;

import java.util.Arrays;

public class ShapeMain {
    public static void main(String[] args) {
        Arrays.stream(Shape.values()).forEach(e -> System.out.println(e.computeSquare()));
    }
}
