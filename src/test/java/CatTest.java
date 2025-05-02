import org.junit.Test;
import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void getSoundShouldReturnMeow() {
        Cat cat = new Cat();
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodShouldReturnMilk() {
        Cat cat = new Cat();
        assertEquals("Молоко", cat.getFood());
    }
}


