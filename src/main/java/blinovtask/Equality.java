package blinovtask;

public class Equality {
    public static void main(String[] args) {
        float result = 1 / 3.0f * 3;//
        System.out.println(1.f == result);//true
        System.out.println(1.1234567777f == 1.1234567888f);//true: только для float( 7 знаков после точки еще учитываются)
    }
}
