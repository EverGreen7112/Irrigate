package test;

/**
 * A basic clock class!
 * Contains the current hours, minutes, and seconds, and able to increase them.
 * If we wanted a more complexed object (fo example, an alarm clock, 
 * we'll have to build upon it.)
 */
public class Clock {
    public int m_hours, m_minutes, m_seconds;

    /**
     * A consructor for the {@link Clock} class. <p>
     * 
     * (A reminder - this must be called, with these parameters, 
     * to create an {@link Clock} object, and as such runs whenever 
     * a new Clock object is created.).
     * 
     * @param hours - the hour when initilizing the clock
     * @param minutes - the minute when initilizing the clock
     * @param seconds - the second when initilizing the clock
     */
    public Clock(int hours, int minutes, int seconds) {
        m_hours = hours;
        m_minutes = minutes;
        m_seconds = seconds;
    }

    /**
     * Increases the seconds by one.
     */
    public void tick() {
        m_seconds += 1;
        
        if (m_seconds == 60) //If a full minute passed, reset seconds and increase minutes. 
        {
            m_seconds = 0;
            m_minutes +=1;
        }

        if (m_minutes == 60) { //If a full hour passed, reset minutes and increase minutes.
            m_hours += 1;
            m_minutes = 0;
        }
    }
}