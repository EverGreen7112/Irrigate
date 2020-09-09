package butabstract;

/**
 * Dog
 */
public class Dog extends Mammal {

    public Dog(boolean male) {
        super("Woof", male);
    }

    @Override
    public void fight() {
        System.out.println("HOWWWL");
    }

    @Override
    public void feed() {
        // TODO

    }
}