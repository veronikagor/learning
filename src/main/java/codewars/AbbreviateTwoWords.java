package codewars;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] twoWords = name.split(" ", 2);
        String newName = twoWords[0].charAt(0) + "." + twoWords[1].charAt(0);
        System.out.println(newName);

        return newName.toUpperCase();
    }
}
