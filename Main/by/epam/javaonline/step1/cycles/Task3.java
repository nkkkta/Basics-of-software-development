package by.epam.javaonline.step1.cycles;
import static java.lang.Math.*;
//Найти сумму квадратов первых ста чисел
public class Task3 {
    public static void main(String[] args) {
        int summa = 0;
        for(int i =1;i<=100;i++){
            summa += pow(i,2);
        }
        System.out.println(summa);
    }
}
