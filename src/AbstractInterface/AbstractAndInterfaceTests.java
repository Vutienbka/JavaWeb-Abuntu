package AbstractInterface;

import java.util.Arrays;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                System.out.println(((Chicken) animal).howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();

        for(Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
