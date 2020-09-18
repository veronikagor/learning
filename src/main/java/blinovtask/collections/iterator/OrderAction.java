package blinovtask.collections.iterator;

import java.util.Iterator;
import java.util.List;

public class OrderAction {
    public void discountAction(float bigAmount, List<Order> orders, int percent) {
        Iterator<Order> iterator = orders.iterator(); //типизировать тем же типом что и List
//        iterator.remove(); // если методу remove не предщевствует next() выдаст IllegalStateException
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getAmount() >= bigAmount) {
                iterator.remove();
            } else {
                order.setAmount(order.getAmount() * (100 - percent)/ 100.0);// т к можем получить ноль переводим в тип double

            }
        }


    }

}
// Использование Iterator более безопасно, чем Enumeration, поскольку Iterator не позволяет менять объект
// коллекции иным споcобом, кроме как с использованием собственного метода remove(), а при попытке изменения
// объекта коллекции выбрасывает исключение ConcurrentModificaitonException.