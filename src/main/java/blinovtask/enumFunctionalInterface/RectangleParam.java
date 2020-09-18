package blinovtask.enumFunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Supplier;// используеися для создания объктов, Supplier<T> не принимает
// никаких аргументов, но должен возвращать объект типа T

public enum RectangleParam implements Supplier<BiFunction> {
    PERIMETER((o1, o2) -> 2 * o1 + o2),//функционал перечисления
    SQUARE((o1, o2) -> o1 * o2);
    private BiFunction<Double, Double, Double> biFunction;

    RectangleParam(BiFunction<Double, Double, Double> biFunction) {
        this.biFunction = biFunction;
    }

    @Override
    public BiFunction<Double, Double, Double> get() {// для Supplier обязательно нужно реализовать его метод ,
        // чтобы из double вернуть тип BiFunction
        return biFunction;
    }
    // что эта конструкция дает? - можно добавлять перечисления, а функционал остается тот же


    // ! после этого передать это  перечисление -> извлечь из него функционал ((o1, o2) -> 2 * o1 + o2) ->
    //  ! и вызывать там метод из BiFunction

    /* дальше class RectangleAction */
    /* дальше class Runner для запуска */



    //    {
//        @Override
//    public double service(double... param) {// double... param - переменное число параметров
//        return 2 * (param[0]+ param[1]);
//    }
//    }


//            {
//        @Override
//        public double service(double... param) {
//            return param[0] * param[1];
//        }
//    };


}
