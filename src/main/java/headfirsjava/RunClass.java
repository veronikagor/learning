package headfirsjava;

public class RunClass {
    double area;
    int height;
    int length;

    public static void main(String[] args) {
        Triangle[] ta = new Triangle[4];
        int x = 0;
        while (x < 4) {
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            System.out.println(" " + x + " ,");
            x = x + 1;
        }

        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.println(" t5 = " + t5.area);
    }

    void setArea() {
    }
}