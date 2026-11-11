import java.util.Calendar;

public class Cmenumweek111026 {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }
        System.out.println("오늘 요일:" + today);
        if(today == Week.SUNDAY){
            System.out.println("일요일에는 축구를 합니다.");
        } else if (today == Week.MONDAY) {
            System.out.println("월요일에는 야구를 합니다");
        } else if (today == Week.TUESDAY) {
            System.out.println("오늘은 화요일입니다.");
        } else if (today == Week.WEDNESDAY){
            System.out.println("수요일입니다.");
        }
    }
}
//열거 타입과 열거 상수 5강
/*import java.util.Calendar; 
Week today = null;

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK); */