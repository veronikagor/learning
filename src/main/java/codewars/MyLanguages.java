package codewars;

import java.util.*;
import java.util.Map.Entry;
import java.util.Map.Entry;

public class MyLanguages {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        int value = 0;
        int i = 0;
        int[] values = new int[results.size()];
        List<Integer> list = new ArrayList();
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            value = entry.getValue();
            values[i] = value;
            i++;
            list.add(entry.getValue());
        }
        Collections.sort(list);
        Collections.reverse(list);

        ArrayList result = new ArrayList();
        for (int val: list) {
            for (Map.Entry<String, Integer> entry : results.entrySet()) {
                if (val == entry.getValue() && val > 59){
                    result.add(entry.getKey());
                }
            }
        }
        LinkedHashSet<String> resultNew = new LinkedHashSet<>(result);
ArrayList<String> resultWithOutDuplicate = new ArrayList<String>(resultNew);

return resultWithOutDuplicate;
    }
}
