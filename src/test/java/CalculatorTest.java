import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() throws Exception{
        double sum = Calculator.add(1.0,2.0);
        Assertions.assertEquals(3.0,sum);
    }

    @Test
    public void testsubtraction() throws Exception{
        double sum = Calculator.subtract(1.0,2.0);
        Assertions.assertEquals(-2,sum);
    }


}
