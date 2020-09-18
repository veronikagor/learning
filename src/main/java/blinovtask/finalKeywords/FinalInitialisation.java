package blinovtask.finalKeywords;

public class FinalInitialisation {
    private int x;
    private int y;
    final int MAX_RANGE;//значение  по умолчанию для final поля не задается, нужно инициализировать
    //    чрез конструктор(причем в каждом созданном) или логический блок
     {
        MAX_RANGE = 1_000;
    }

    public FinalInitialisation() {

//        MAX_RANGE = 1_000; // если есть в логическом блоке - то в конструкторе уже не нужен
    }

    public FinalInitialisation(int x, int y) {
        this.x = x;
        this.y = y;

//        MAX_RANGE = 1_000; // если есть в логическом блоке - то в конструкторе уже не нужен

    }
}
// Поле помеченное при помощи слова final не может изменить свое значение после инициализации.
// Инициализируется поле либо при описании, либо в конструкторе, либо в статическом или динамическом блоке.