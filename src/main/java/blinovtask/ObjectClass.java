package blinovtask;

public class ObjectClass {
        public static void main(String[] args) {
            Object obj = new Object();
            Class clazz = obj.getClass();
            System.out.println(clazz.getSuperclass() + ", ");
            Class clazzClass = clazz.getClass();
            System.out.println(clazzClass.getSuperclass());

        }
    }

// output: null, class java.lang.Object

//Так как класс Object находится на вершине иерархии классов в Java,
// то суперкласса класса Object не существует, а суперклассом любого класса Class является класс Object.