package test;

/**
 * CookoClock
 */
public class CookoClock extends Clock {
    
    public CookoClock(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
    }

    @Override
    public void tick() {
        super.tick();
        if (m_minutes == 0 && m_seconds == 0) System.out.println("KOOKOO");
    }

    
}