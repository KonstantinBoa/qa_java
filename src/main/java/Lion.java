import java.util.List;

public class Lion {
    private final boolean hasMane;
    private final Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;

        if (sex.equals("Самец")) {
            this.hasMane = true;
        } else if (sex.equals("Самка")) {
            this.hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола - самец или самка");
        }
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
