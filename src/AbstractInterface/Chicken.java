package AbstractInterface;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chip chip";
    }

    @Override
    public String howToEat() {
        return "Can peck";
    }
}
