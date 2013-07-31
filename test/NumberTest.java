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

    @Test
    public void testThreeIsNotAPrimeNumber() throws Exception {
        assertFalse(new Number(3).isPrime());
    }

    @Test
    public void testFourIsNotAPrimeNumber() throws Exception {
        assertFalse(new Number(4).isPrime());
    }

    @Test
    public void testPrimeFactorOfOneIsEmptyArray() throws Exception {
        assertArrayEquals(new Integer[]{},new Number(1).generatePrimeFactors());
    }


    @Test
    public void testPrimeFactorOfTwoIsTwo() throws Exception {
        assertArrayEquals(new Integer[]{2},new Number(2).generatePrimeFactors());
    }


}
