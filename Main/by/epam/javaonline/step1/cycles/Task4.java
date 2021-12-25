package by.epam.javaonline.step1.cycles;

import java.math.BigInteger;
//Найти произведение квадратов первых двухста чисел
public class Task4 {
    public static void main(String[] args) {
        BigInteger product = BigInteger.ONE;
        for(int i = 2;i <= 200;i++){
            BigInteger square = BigInteger.valueOf(i * i);
            product = product.multiply(square);
        }
        System.out.println(product);
    }
}
