import org.junit.Test;
import static org.junit.Assert.*;

public class LionTest {

    @Test
    public void doesHaveManeShouldReturnTrueForMale() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeShouldReturnFalseForFemale() throws Exception {
        Lion lion = new Lion("Самка", new Feline());
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void getFoodShouldReturnMeat() throws Exception {
        Lion lion = new Lion("Самец", new Feline());
        assertEquals("Мясо", lion.getFood());
    }

    @Test
    public void getKittensShouldReturnFelineValue() throws Exception {
        Lion lion = new Lion("Самка", new Feline());
        assertEquals(1, lion.getKittens());
    }

    @Test(expected = Exception.class)
    public void constructorShouldThrowExceptionForInvalidSex() throws Exception {
        new Lion("Боевой вертолёт", new Feline());
    }
}
