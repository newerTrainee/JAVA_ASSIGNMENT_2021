package order;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
@Test
    public void testFunctions(){
    Order o = new Order();
    o.setQuantity(50);
    assertEquals(50,o.getQuantity());

}
@Test
    public void testClassObject(){
    List<Order> orders = new ArrayList<>();
    orders.add(new Order(40,"Soap",35));
    orders.add(new Order(20,"Gifts",50));
    orders.add(new Order(10,"silk",60));

}
}