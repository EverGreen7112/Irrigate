package butabstract;

/**
 * Reptile
 */
public abstract class Reptile extends Animal {
    
    public Reptile(String sound) {
        super(sound);
    }

    public void crawl() {
        System.out.println("KH..KH...");
    };
}