public class Emtwo11128 {
    public static void main(String[] args) {
        Time t = new Time(12, 35, 30); // 객체
        System.out.println(t);
        t.setHour(t.getHour() + 1);
        System.out.println(t);

    }
}

class Time {
    // 필드명
    private int hour;
    private int minute;
    private int second;

    // 생성자
    Time(int hour, int minute, int second) { // 객체
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // 메서드
    public int getHour() {return hour;}

    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            return;
        this.hour = hour;
    }

    public int getMinute() {return minute;}

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59)
            return;
        this.minute = minute;
    }

    public int getSecond() {return second;}

    public void setSecond(int second) {
        if (second < 0 || second > 59)
            return;
        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}

//접근제한자를이용한캡슐화