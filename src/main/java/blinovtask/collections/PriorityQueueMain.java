package blinovtask.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueMain {
    public static void main(String[] args) {
        Queue<String> prior = new PriorityQueue<>();
//        Queue<String> prior = new PriorityQueue<>(Comparator.reverseOrder()); //  в качестве конструктора
//        можно добавлять условия сортировки // output: V J A A 2

        prior.offer("J");
        prior.offer("A");
        prior.offer("V");
        prior.offer("A");
        prior.offer("2");
        while (!prior.isEmpty()) {
            System.out.println(prior.poll());
        }

    }
}
//output:
// 2
// A
// A
// J
// V

