package blinovtask.collections.set;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class SynchronizedSet {
    public static void main(String[] args) {

        Set<Object> set = new LinkedHashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");

        Set<Object> synchronizedSet = Collections.synchronizedSet(set); //следует выполнить синхронизацию  при
        // использование LinkedHashSet в приложении с множеством потоков, часть из которых может вносить изменения в набор
        set.remove("1");
        System.out.println(synchronizedSet);

        set.add(set);
        System.out.println(set); // output: [2, 3, (this Collection)]
        System.out.println(set.hashCode());    // Exception in thread "main" java.lang.StackOverflowError

    }
}

//