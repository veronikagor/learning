package blinovtask.collections.iterator;

import java.util.ArrayList;

/**
 * Задача:
 * назначить скидку 5% при покупке < 10 р
 */

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<Order>() {
            {
                add(new Order(231, 12.));
                add(new Order(389, 2.9));
                add(new Order(747, 32.));
                add(new Order(517, 1.7));
                add(new Order(414, 17.));
            }
        };
        System.out.println(orders);
        float bigAmount = 10;
        int percent = 5;

        //вариант 1  с использованием c созданием кл OrderAction и т д
        OrderAction action = new OrderAction();
        action.discountAction(10, orders, percent);
        System.out.println(orders);

        //вариант 2  с использованием Functional Interface
//        orders.removeIf(o -> o.getAmount() >= bigAmount);
//        orders.forEach(o -> o.setAmount(o.getAmount() * (100 - percent) / 100.0));

    }
}
