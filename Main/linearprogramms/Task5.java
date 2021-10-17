package linearprogramms;

public class Task5 {
    public static void main(String[] args) {
        int totalSeconds = 366537360;
        int seconds = totalSeconds %60;
        int minutes = (totalSeconds /60)%60;
        int hours = ((totalSeconds /3600)%24);
        System.out.println(hours +"h"+" "+minutes+"m"+" "+seconds+"s");
    }
}
