package hashMapincollection;

import java.util.HashMap;

public class orderTest {
    public static void main(String[] args) {

        HashMap<Order, String> orderMap = new HashMap<>();


        Order order1 = new Order("ORD001", "rakesh");
        Order order2 = new Order("ORD001", "keerthi");
        Order order3 = new Order("ORD001", "varun");
        Order order4 = new Order("ORD001","rakesh");


        orderMap.put(order1, "Order 1 ");
        orderMap.put(order3, "Order 3");
        orderMap.put(order4, "Order 4 ");


        System.out.println(orderMap);
    }
}
