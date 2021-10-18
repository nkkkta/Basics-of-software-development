package cycles;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int summa = 0;
        for (int i = 1; i <= input; i++){
            summa +=i;
        }
        System.out.println(summa);
    }
}
