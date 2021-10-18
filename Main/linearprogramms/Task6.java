package linearprogramms;
//Принадлежит ли точка заданной области
public class Task6 {
    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        boolean isBelong = (((x >= -2 && x <= 2) && (y <= 5 && y >= 0)) || ((x >= -4 && x <= 4) && (y < 0 && y >= -3)));
        System.out.println(isBelong);
    }
}
