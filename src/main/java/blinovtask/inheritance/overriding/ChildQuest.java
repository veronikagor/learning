package blinovtask.inheritance.overriding;

public class ChildQuest extends ParentQuest {
    static int i;
    public static void main(String [] args){
        ChildQuest ob = new ChildQuest();
        System.out.print(i);
    }
}
 // вывод 1 0
