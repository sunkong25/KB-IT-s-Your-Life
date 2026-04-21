package ch07.abstract_;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarMain {
    public static void main(String[] args) {
        // 시스템 오늘 날짜
        Date date = new Date();
        System.out.println("오늘 날짜: " + date);

        SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 HH시 mm분 ss초");
        System.out.println("오늘 날짜: " + sdf.format(date));

        // 시스템의 날짜와 시간을 기준으로 생성
        // Calendar cal = new Calendar(); --- 추상클래스
        //자식 클래스
        // Calendar cal = new GregorianCalendar(); // 자식 클래스
        Calendar cal = Calendar.getInstance(); //메서드 -> 싱글톤X

//        int year = cal.get(Calendar.YEAR);
        int year = cal.get(1);
        int month = cal.get(Calendar.MONTH);// 1월 => 0, 2월 => 1
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);

        System.out.println(year + "년 " + (month + 1) + "월 " + day + "일 " + hour + "시 " + minute + "분 " + second + "초");
    }
}
