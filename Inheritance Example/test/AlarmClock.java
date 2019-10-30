package test;

/**
 * AlarmClock
 */
public class AlarmClock extends Clock {
    public int m_wakeHour;

    public AlarmClock(int hours, int minutes, int seconds, int wakeHour) {
        super(hours, minutes, seconds);
        m_wakeHour = wakeHour;
    }

    public int getMinutes() {
        return m_minutes;
    }


    
    public void tick() {
        super.tick();
        if (m_hours == m_wakeHour) {
            System.out.println("WAKE UP!");
        }
    }

    int getHour() {
        return m_hours;
    }


}