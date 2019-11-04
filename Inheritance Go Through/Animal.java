/**
 * Animal
 */
public class Animal {
    String m_sound;

    public Animal(String sound) {
        m_sound = sound;
    }

    public void speak(boolean scream) {
        System.out.println(scream ? m_sound.toUpperCase() : m_sound.toLowerCase() );
    }

    public void fight() { }


}