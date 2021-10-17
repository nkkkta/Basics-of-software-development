package linearprogramms;

import static java.lang.Math.random;

public class Task4 {
    public static void main(String[] args) {
        double intPart = (int)(100 + random() * 900);//генерация тестов
        double fractPart = (int)(100 + random() * 900);
        double R = intPart + fractPart / 1000;
        double ReversedR = (R - (int) R) * 1000 + (int) R * 0.001;
        System.out.printf("Number is: %.3f%n", R);
        System.out.printf("Reversed number is: %.3f%n", ReversedR);
    }
}
