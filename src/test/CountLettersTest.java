import org.junit.Assert;
import org.junit.Test;

public class CountLettersTest {

    @Test
    public void testCountLetters() throws Exception {
        CountLetters myCountLetters = new CountLetters();
        Assert.assertEquals(5, myCountLetters.findLetterCount("abracadabra", "a"));

    }
}
