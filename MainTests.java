import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTests {
    // Assigned to Athena
    @Test
    public void testSum() {
        int[] testSum = { 1, 2, 3, 4 };
    int expectedSum = 10;
    assertEquals(expectedSum, Main.getSum(testSum));
  }
    

    // Assigned to Jared
    @Test
    public void testMean() {
        assertEquals(true, true);
    }

    // Assigned to Alvin
    @Test
    public void testMedian() {
        assertEquals(true, true);
    }

    // Assigned to Jaden
    @Test
    public void testMode() {
        int[] testArr = { 1, 2, 3, 2, 4, 2, 3 };
        int expectedMode = 2;
        assertEquals(expectedMode, Main.getMode(testArr));
    }
}
