package dz30.demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Order {
    int id;
    Date date;
    int cost;
    String product;

    public Order(int id, Date date, int cost, String product) {
        this.id = id;
        this.date = date;
        this.cost = cost;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "  Order{" +
                "id=" + id +
                ", date=" + date +
                ", cost=" + cost +
                ", product='" + product + '\'' +
                '}';
    }
}
