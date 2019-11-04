package butabstract;

/**
 * Snake
 */
public class Snake extends Reptile {

    public Snake() {
        super("Hssss");
    }

    @Override
    public void fight() {
        System.out.println("HISSSS");
    }
}