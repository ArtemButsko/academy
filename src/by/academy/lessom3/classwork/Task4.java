package by.academy.lessom3.classwork;

public class Task4 {

    public static void main(String[] args){

        int s = 370_000;
        int sec;
        int m;
        int min;
        int h;
        int n;
        int day;
        int months;

        sec = s%60;
        m = (s-sec)/60;
        min = m%60;
        h = (m- min)/60;

        day = h/24;

        System.out.println(h+ " часов "+ min + " минут "+ sec+ " секунд");
        System.out.println("дней: "+day);

    }
}
