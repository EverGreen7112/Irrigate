/**
 * Mammal
 */
public class Mammal extends Animal {
    private boolean m_male;

    public Mammal(String sound, boolean male) {
        super(sound);
        m_male = male;
    }

    public void feed() {

    }

    public boolean isMale() {
        return m_male;
    }
}