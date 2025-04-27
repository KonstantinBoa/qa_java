
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.List;

public class LionTest {

    @Test
    public void doesHaveManeShouldReturnTrueForMale() throws Exception {
        Feline feline = mock(Feline.class);
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeShouldReturnFalseForFemale() throws Exception {
        Feline feline = mock(Feline.class);
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void getFoodShouldReturnMeatList() throws Exception {
        Feline feline = mock(Feline.class);
        List<String> food = Arrays.asList("Мясо");
        when(feline.eatMeat()).thenReturn(food);

        Lion lion = new Lion("Самец", feline);
        assertEquals(food, lion.getFood());
    }

    @Test
    public void getKittensShouldReturnFelineValue() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.getKittens()).thenReturn(2);

        Lion lion = new Lion("Самка", feline);
        assertEquals(2, lion.getKittens());
    }

    @Test(expected = Exception.class)
    public void constructorShouldThrowExceptionForInvalidSex() throws Exception {
        Feline feline = mock(Feline.class);
        new Lion("Боевой вертолёт", feline);
    }
}
