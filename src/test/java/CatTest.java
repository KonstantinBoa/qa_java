
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.List;

public class CatTest {

    @Test
    public void getSoundShouldReturnMeow() {
        Feline feline = mock(Feline.class);
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodShouldReturnMeatList() throws Exception {
        Feline feline = mock(Feline.class);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expectedFood);

        Cat cat = new Cat(feline);
        assertEquals(expectedFood, cat.getFood());
    }
}
