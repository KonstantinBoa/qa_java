import java.util.List;
import java.util.Arrays;

public class Feline {
    public List<String> eatMeat() {
        return Arrays.asList("Животные", "Птицы", "Рыба");
    }

    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int count) {
        return count;
    }

    public String getFood() {
        return "Мясо";
    }
}
