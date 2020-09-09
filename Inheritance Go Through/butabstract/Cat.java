package butabstract;

/**
 * Cat
 */
public class Cat extends Mammal {

    /**
     * Constrcuts a new cat by input gender
     * @param male - animal sex - true for male, false for female.
     */
    public Cat(boolean male) {
        super("Mew", male);
    }

    @Override
    public void fight() {
        System.out.println("Shtsss");
    }

    @Override
    public void feed() {
        // TODO
    }

}
