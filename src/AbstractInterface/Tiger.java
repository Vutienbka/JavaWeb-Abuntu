package AbstractInterface;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Roarrrrrrrrr";
    }

    @Override
    public String howToEat() {
        return "Can masticate";
    }
}
