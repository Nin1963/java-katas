import org.junit.Assert;
import org.junit.Test;

public class OddSumTest {

    @Test
    public void testOddSum() throws Exception {
        OddSum myOddSum = new OddSum();
        Assert.assertEquals(16, myOddSum.sumValues(new int[] { 1, 2, 3, 4, 5, 6, 7 }));
    }

}
