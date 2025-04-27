
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void getKittensShouldReturnOne() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensShouldReturnFive() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }
}
