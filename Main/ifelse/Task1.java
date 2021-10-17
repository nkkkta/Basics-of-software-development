package ifelse;

public class Task1 {
    public static void main(String[] args) {
        double Angle1 = 90;
        double Angle2 = 45;
        if (Angle1 + Angle2 < 180) {
            System.out.println("Triangle is exist");
            if ((Angle1 + Angle2) == 90 || Angle1 == 90 || Angle2 == 90) {
                System.out.println("The triangle is rectangular");
            }
        } else {
            System.out.println("Triangle isn't exist");
        }
    }
}
