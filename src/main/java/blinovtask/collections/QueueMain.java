package blinovtask.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>() {//создать Queue можно с помощъю инициализации его объектом LinkedList
            {
                this.offer("Jeans");
            }
        };
        queue.add("Dress");
        queue.offer("T-Shirt");
//        queue.removeIf(s -> s.endsWith("t"));  // стандартные методы изменяют исходную очередь
//        queue.forEach(System.out::println);    //output: Jeans Dress

        queue.stream().filter(s -> !s.endsWith("t")).forEach(System.out::println);// !не изменяют исходную очередь
        queue.forEach(System.out::println);  //output: Jeans Dress T-Shirt

//        queue.remove(); // удалит Jeans - он первый зашел
//        queue.remove("Dress"); //удалит именно Dress - 2 варианта remove()

//        queue.clear();// очистит очередь
//        queue.forEach(System.out::println);// выыод - пустой

    }
}
// FIFO - firs up first out - принцип очереди(Queue)
//                  exception      null
//методы добавления  add()        offer() - в конец очереди
// методы удаления   remove()     poll()
// методы проверки   element()    peek()