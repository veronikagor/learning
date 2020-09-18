package blinovtask;

public class Types {
    public static void main(String[] args) {

        double d = 0.3;
        float f = 1.3f;
        long l = 132142;
        char c = 'c';
        byte er = 127;
        int i = 32565;
        char df = 17;
        int u = 'h'; // !!!!
        float x = 5.0f;

        Integer g = new Integer((int) 356f);
        Object g1 = 356f;

        System.out.println(f);
        System.out.println(g);

//      Double d2 = (double) .0f;
        Double d3 = (double) 0.0f;
//      Double d4 = Double.valueOf( "1L"); //
        Double d5 = 0.d;
        Double d6 = (double) 1L;
        int q = (byte) 2;
        System.out.println();
        int ij = Integer.parseInt("1");
//      int c = new Integer("12");
        Integer uh = 78;
//      System.out.println(new Integer(null));
        System.out.println((String) null);
        System.out.println((true ? null : 0));


    }
}

