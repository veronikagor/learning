package blinovtask.enumFunctionalInterface;

public class RectangleAction {
    public Double action(RectangleParam param, Double a, Double b) {
        return param.get().apply(a, b);//// !передаем это перечисление -> извлечь из него функционал
        // нп((o1, o2) -> 2 * o1 + o2) -> ! и вызываем метод apply из BiFunction
    }
}
