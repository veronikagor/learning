package blinovtask.staticAttributes;

public class LaunchOrder {
    static {
        System.out.println("1 ");
    }

    {
        System.out.println("3 ");
    }

    LaunchOrder(){
        System.out.println("4 ");
    }

    public static void main(String[] args) {
        System.out.println("2 ");
    }
}

//output:
// 1 2