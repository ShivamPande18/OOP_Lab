public class Time {
    int hour;
    int minute;
    int second;

    Time()
    {
        hour = minute = second = 0;
    }

    Time(int _hour, int _minute, int _second)
    {
        hour = _hour;
        minute = _minute;
        second = _second;
    }

    void Display()
    {
        System.out.println("Time = " + hour + ":" + minute + ":" + second);
    }

    Time Add(Time t1, Time t2)
    {
        
        int sec = t1.second + t2.second;
        int min = t1.minute + t2.minute;
        int hrs = t1.hour + t2.hour;
        
        
        if(sec>60)
        {
            sec -= 60;
            min++;
        }
        if(min>60)
        {
            min-=60;
            hrs++;
        }
        
        
        Time t = new Time(hrs,min,sec);
        return t;
    }
}
