package butinterface;

/**
 * Mammal
 */
public abstract class Mammal implements Animal {
    private boolean m_male;
    private String m_sound;

    public Mammal(String sound, boolean male) {
        m_sound = sound;
        m_male = male;
    }

    public boolean isMale() {
        return m_male;
    }

    @Override
    public void speak(boolean scream) {
        System.out.println(m_sound);
    }
}


