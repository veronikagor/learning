package blinovtask;

public class ForEach {
    public static void main(String[] args) {
        ForEach2 action = new ForEach2();
        int[] a = {3, 4, 42};
        action.changeArray(a, 7);

        for (int element:a) {
            element += 1; //  с помошью for each изменить ссылку на элемент невозможно!
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
//вывод - 10, 11, 49