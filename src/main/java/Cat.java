public class Cat extends Animal implements Predator {

    @Override
    public String getSound() {
        return "Мяу";
    }

    @Override
    public String getFood() {
        return "Молоко";
    }
}
