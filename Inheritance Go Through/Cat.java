
/**
 * Cat
 */
public class Cat extends Mammal {

    public Cat(boolean male) {
        super("Mew", male);
    }

    @Override
    public void fight() {
        System.out.println("Shtsss");
    }

}