package service;

import order.Order;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {

    @Test
    public void checkgetInstance() {

 assertTrue(EmailService.getInstance() instanceof EmailService);

        }

@Test
    public void checkException(){
    Order o = new Order();
    Executable executable =() ->new EmailService().sendEmail(o);
assertThrows(RuntimeException.class,executable);
}

@Test
    public void checkGetInstance(){
    boolean var = new EmailService().sendEmail(new Order(),"Gifts");
    assertTrue(var);
}


}