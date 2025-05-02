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

    @Test
    public void getFamilyShouldReturnFelineFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getFoodShouldReturnMeat() {
        Feline feline = new Feline();
        assertEquals("Мясо", feline.getFood());
    }
}
