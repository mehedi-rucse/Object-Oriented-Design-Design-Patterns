import java.util.*;

public class Broker {
    private final List<Order> orderList = new ArrayList<Order>();
    public void takeOrder(Order order){
        orderList.add(order);
    }
    public void placeOrder(){
        for(Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}
