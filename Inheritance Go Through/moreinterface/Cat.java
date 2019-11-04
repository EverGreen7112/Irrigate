package moreinterface;

import butinterface.Animal;

/**
 * cat
 */
public class Cat implements Animal {
    private boolean m_male;

    public Cat(boolean male) {
        m_male = male;
    }

    @Override
    public void speak(boolean scream) {
        System.out.println(scream ? "HISSS" : "Meow");
    }

    @Override
    public void fight() {
        System.out.println("Shtsss");

    }

    public boolean isMale() {
        return m_male;
    }
    
}

