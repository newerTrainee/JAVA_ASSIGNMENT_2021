import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
   @Test
    public void testSumOfNum(){
       int expectedResult = App.sum(5,6);
       assertEquals(expectedResult,11);
   }

}
