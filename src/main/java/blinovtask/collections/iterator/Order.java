package blinovtask.collections.iterator;

public class Order {
    private long orderID;
    private double amount;

    public Order(long orderID, double amount) {
        this.orderID = orderID;
        this.amount = amount;
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // правильное переопрнделение equals
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Order b = (Order) o;
        return orderID == b.orderID
                && amount == b.amount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("orderId=").append(orderID);
        sb.append("amount=").append(amount);
        sb.append("}\n");
        return sb.toString();
    }
}
