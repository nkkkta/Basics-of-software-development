package ifelse;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = console.nextDouble();
        double y1 = console.nextDouble();
        double x2 = console.nextDouble();
        double y2 = console.nextDouble();
        double x3 = console.nextDouble();
        double y3 = console.nextDouble();
        if (((x3 - x1)*(y2-y1)) == ((y3 - y1)*(x2 - x1))){
            System.out.println("Points lay on the one straight line");
        }
        else{
            System.out.println("Points don't lay on the one straight line");
        }
    }
}