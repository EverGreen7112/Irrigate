package test;

/**
 * Clock
 */
public class Clock {
    public int m_hours, m_minutes, m_seconds;

    public Clock(int hours, int minutes, int seconds) {
        m_hours = hours;
        m_minutes = minutes;
        m_seconds = seconds;
    }

    public void tick() {
        m_seconds += 1;
        
        if (m_seconds == 60)
        {
            m_seconds = 0;
            m_minutes +=1;
        }

        if (m_minutes == 60) {
            m_hours += 1;
            m_minutes = 0;
        }
    }
}