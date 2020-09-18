package blinovtask.collections.map;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("T-Shirt", 7);
        map.put("Jeans", 5);
        map.put("Gloves", 4);
        System.out.println(map); // {Gloves=4, T-Shirt=7, Jeans=5}
//        Map<String, Integer> map = new TreeMap<>();// {Gloves=4, Jeans=5, T-Shirt=7} // По умолчанию TreeMap
//        сортирует элементы по ключу по возрастанию

        int value = map.put("Jeans", 4);
        System.out.println(value);// 5
        System.out.println(map);// {Gloves=4, T-Shirt=7, Jeans=4}

        Set<String> set = map.keySet(); //ключи всегда уникальны
        Collection<Integer> collection = map.values();//а вот значения могут повторяться
        Set<Integer> sets = new HashSet<>(collection);
        System.out.println(collection);//[4, 7, 4]
        System.out.println(sets);//[4, 7] из коллекции делаем set

        Set<Map.Entry<String, Integer>> values = map.entrySet();
        System.out.println(values);//[Gloves=4, T-Shirt=7, Jeans=4]

        Map<String, String> m = new HashMap<>(null);
        System.out.print(m.size());// runtime error
    }
}
// TreeMap  для добавления элементов (Интерфейс Comparator) compareTo()

// Класс WeakHashMap является реализацией интерфейса Map, который хранит только слабые ссылки в качестве
// ключей. Это позвоялет сборщику мусора удалять элемент структуры в том случае, если на ключ элемента
// типа “ключ – значение” за пределами таблицы никто не ссылается.