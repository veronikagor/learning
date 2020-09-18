package blinovtask.bean;

import java.util.Objects;

public class Order extends Entity {
    private long orderId;
    private double amount;

    public Order() {
    }

    public Order(long orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId &&
                Double.compare(order.amount, amount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, amount);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", amount=" + amount +
                '}';
    }
}

// Класс bean создается для хранения информации.
// Должен содержать:
//1. Public class
//2. Default constructor
//3. Private fields
//4. Correct geteer and setter
//5. Serializable
//6. Equals, hashCode, toString overriding