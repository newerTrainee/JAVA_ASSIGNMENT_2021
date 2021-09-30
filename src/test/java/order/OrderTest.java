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
    public void testConstructor(){
  Order o =  new Order(40,"Soap",35);
 assertAll("Error in values",
            () ->assertEquals("Soap", o.getItemName()),
            () ->assertEquals(40, o.getQuantity()),
            () ->assertEquals(35, o.getPrice())
    );
    }
}
