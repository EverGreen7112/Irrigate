package test;

/**
 * A CookoClock class.
 * 
 * Exactly the same as {@link Clock}, except it shouts "KOO-KOO" every full hour.
 */
public class CuckooClock extends Clock { 
    //EXTENDS clock, meaning that is has all of its properties
    // (m_hours, m_minutes, m_seconds), and its method tick().
    
    /**
     * Constructs a new {@link CuckooClock} object.
     * @param hours - the current hour.
     * @param minutes - the current minutes.
     * @param seconds - the current seconds.
     */
    public CuckooClock(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds); 
        
        //Remember, inheritance basically mean something with extra features. However, 
        //we must clearly define that something - and as such fully build it with its constructor.
        //We call this constructor with the word "super". 
    }

    /**
     * Increases time by one second, and if it's an exact full hour, "shouts KOO-KOO".
     */
    //Notice we are OVERRIDING the method. this means that rather then running 
    //normally (like in Clock).
    //Had we not overriden tick, it would simply run the normal, Clock version of it.
    @Override 
    public void tick() {
        super.tick(); //Runs the tick() method of the class extending from (Clock)
        if (m_minutes == 0 && m_seconds == 0) System.out.println("KOO-KOO");
    }

    
}