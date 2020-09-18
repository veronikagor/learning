package codewars;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;

import java.util.Arrays;

public class InParts {
    public static String splitInParts(String s, int partLength) {
        int partsOutOfSize = s.length() % partLength;
        int partsSize = s.length() - partsOutOfSize;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < partsSize; i = i + partLength) {
            sb.append(s, i, i + partLength).append(" ");
        }
        if (partsOutOfSize > 0) {
            return sb.append(s.substring(s.length() - partsOutOfSize)).toString();
        } else {
            return sb.toString().trim();
        }
    }
}