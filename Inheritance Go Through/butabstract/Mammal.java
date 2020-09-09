package butabstract;

/**
 * Mammal
 */
public abstract class Mammal extends Animal {
    private boolean m_male;
    private String m_sound;

    public Mammal(String sound, boolean male) {
        super(sound);
        m_male = male;
    }

    public boolean isMale() {
        return m_male;
    }

    public abstract void feed();

    @Override
    public void speak(boolean scream) {
        System.out.println(m_sound);
    }
}

