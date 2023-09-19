import com.codebase.WaterBottle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class WaterBottleTest {
    WaterBottle waterBottle;

     @Before
    public void before() {waterBottle = new WaterBottle(100);
     }

     @Test
     public void startsWith_100() {
         assertEquals(100, waterBottle.getVolume());
     }

     @Test
    public void canDrink() {
         assertEquals(90, waterBottle.drink());
     }

    @Test
    public void canEmpty() {
         waterBottle.empty();
         assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canFill() {
         waterBottle.fill();
         assertEquals(100, waterBottle.getVolume());
    }
}

