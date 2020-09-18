package blinovtask.inner.localInner;
/* локальные внутренние классы - вообще не видны внешнему миру, только если сам метод предоставит к ним доступ */

public class LocalInnerClass {
    private int value = 1;

    void action() {
        int a = 2;

        class InnerAction {
            int inner = value;// нестатический метод видит переменную класса владельца
            int innerA = a; //

        }

    }

    static void staticAction() {
        int b = 2;

        class StaticInnerAction {
            // int inner = value; // статический метод не видит переменную класса владельца, так как static работает
            // без создания объекта класса LocalInnerClass

            int innerB = b; //

        }
    }
}
