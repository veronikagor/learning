package blinovtask.collections.map.enumMap;

import blinovtask.collections.set.enumSet.Counter;

import java.util.EnumMap;

public class EnumMapMain {
    public static void main(String[] args) {
        EnumMap<Counter, Integer > map = new EnumMap<Counter, Integer>(Counter.class);//конструктор доступен EnumMap
        map.put(Counter.UNO, 1);
        map.put(Counter.DOS, 2);
        map.put(Counter.TRES, 3);

    }
}
