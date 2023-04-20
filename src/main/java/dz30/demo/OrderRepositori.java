package dz30.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class OrderRepositori {
    static String format = "dd-MM-yyyy";
    List<Order> orders=new ArrayList<>();
    static String allorders="";

    public OrderRepositori(){
        try {
            orders.add(new Order(1, new SimpleDateFormat(format).parse("22-03-2023"), 30000, "Car,Bike"));
            orders.add(new Order(2, new SimpleDateFormat(format).parse("23-03-2023"), 25000, "Car"));
            orders.add(new Order(3, new SimpleDateFormat(format).parse("24-03-2023"), 35000, "Car,Bike,Motobike"));
        } catch (ParseException ignored){}
    }

    public Order getOrder(int id) {
        System.out.println(orders.get(id));
        return orders.get(id);
    }
    public String getAll(){
        for (Order i:orders){
            allorders+=i.toString();
        }
        return allorders;
}
}
