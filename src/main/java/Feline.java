
import java.util.List;
import java.util.Arrays;

public class Feline {
    public List<String> eatMeat() throws Exception {
        return Arrays.asList("Животные", "Птицы", "Рыба");
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int count) {
        return count;
    }
}