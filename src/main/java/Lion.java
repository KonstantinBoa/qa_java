
import java.util.List;

public class Lion {
    private final boolean hasMane;
    private final Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        if (!sex.equals("Самец") && !sex.equals("Самка")) {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.hasMane = sex.equals("Самец");
        this.feline = feline;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public List<String> getFood() throws Exception {
        return feline.eatMeat();
    }
}