package animal;
import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String howToEat(){
        return "Chicken could be Pan-fried";
    }

    @Override
    public String makeSound() {
        return "My name is chicky";
    }
}
