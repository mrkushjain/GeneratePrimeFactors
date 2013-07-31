import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created with IntelliJ IDEA.
 * User: kush
 * Date: 30/07/13
 * Time: 5:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class NumberTest {



    @Test
    public void testOneIsNotAPrimeNumber() throws Exception {
          assertFalse(new Number(1).isPrime());
    }

    @Test
    public void testTwoIsAPrimeNumber() throws Exception {
        assertTrue(new Number(2).isPrime());
    }

}
