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
        int[] testArr = { 1, 19, 3, 220, 4, 2, 33 };
        float expectedMean = (float) 40.285713;
        assertEquals(expectedMean, Main.getMean(testArr));
    }

    // Assigned to Alvin
    @Test
    public void testMedian() {
        int[] testOdd = { 1, 3, 3, 2, 4, 2, 3 }; // 122 3 334
        int[] testEven = { 1, 2, 3, 2, 4, 2 }; // 12 22 34
        int expectedOdd = 3;
        int expectedEven = 2;
        assertEquals(expectedOdd, Main.getMedian(testOdd));
        assertEquals(expectedEven, Main.getMedian(testEven));
    }

    // Assigned to Jaden
    @Test
    public void testMode() {
        int[] testArr = { 1, 2, 3, 2, 4, 2, 3 };
        int expectedMode = 2;
        assertEquals(expectedMode, Main.getMode(testArr));
    }
}
