import com.codebase.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before() {calculator = new Calculator();}

    @Test
    public void canAddNumber() {
        assertEquals(3, calculator.addNumber(1,2));
    }

    @Test
    public void canSubtractNumber() {
        assertEquals(5, calculator.subtractNumber(10,5));
    }

    @Test
    public void canMultiplyNumber() {
        assertEquals(12, calculator.multiplyNumber(4,3));
    }

    @Test
    public void canDivideNumber() {
        assertEquals(5, calculator.divideNumber(15,3), 0.0);
    }
}
