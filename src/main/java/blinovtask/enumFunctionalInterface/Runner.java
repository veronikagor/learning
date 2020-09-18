package blinovtask.enumFunctionalInterface;

public class Runner {
    public static void main(String[] args) {
//        RectangleParam rectangleParam = RectangleParam.PERIMETER; // создаем элемент перечисления
        // rectangleParam.service(2, 3);// вызываем для него переопределенный метод service
        // входными параметрами


        RectangleAction rectangleAction = new RectangleAction();
        double result = rectangleAction.action(RectangleParam.PERIMETER, 7.0, 6.0);//// указываем элемент перечисления со
        System.out.println(result);
    }
}
