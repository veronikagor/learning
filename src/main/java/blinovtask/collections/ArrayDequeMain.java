package blinovtask.collections;

import java.util.ArrayDeque;// работает и как стек(FILO) и как очередь(FIFO)

public class ArrayDequeMain {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();// методы добавления   push()
                                                       // методы извлечения   pop()
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());// output 3 2 1
        }
        ArrayDeque<Integer> queue = new ArrayDeque<>();// //методы добавления   offer() - в конец очереди
                                                         // методы извлечения   poll()
        queue.offer(11);
        queue.offer(22);
        queue.offer(33);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());// output 11 22 33
        }
    }

}
