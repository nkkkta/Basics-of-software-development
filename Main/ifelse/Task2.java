package ifelse;

import java.util.Scanner;

import static java.lang.Math.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = (int)(random() * 11);
        int b = (int)(random() * 11);
        int c = (int)(random() * 11);
        int d = (int)(random() * 11);
        System.out.printf("max(min(%d,%d),min(%d,%d)) = ",a,b,c,d);
        System.out.println(max(min(a,b),min(c,d)));
    }
}
