package butabstract;

/**
 * Animal
 */
public abstract class Animal {
    String m_sound;

    /**
     * Constrcuts a new animal
     * @param sound - the sound the 
     */
    public Animal(String sound) {
        m_sound = sound;
    }

    /**
     * Produces sound
     * @param scream
     */
    public void speak(boolean scream) {
        System.out.println(m_sound);
    }

    /**
     * Prints the animal's fighting sound (like with a claw, venom or bite)
     */
    public abstract void fight();

    /**
     * Battle against another animal
     * @param animal - the animal to battle
     */
     //Notice this does not matter how each animal fights (claw, bite, venom or otherwise) or speaks,
     //The battle progresses all the same and just lets them fight and speak accordingly.
    public void battle(Animal animal) {
        fight(); //Start fight
        speak(true);

        animal.fight(); //Animal fights back
        animal.speak(true);
        
        fight(); //FINISH HIM
        speak(true);
        fight();
        
        speak(false); //It ended, oh well.
    }
}