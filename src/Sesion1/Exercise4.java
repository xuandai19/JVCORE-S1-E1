package Sesion1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("widt = ");
        float w = sc.nextFloat();
        System.out.print("height = ");
        float h = sc.nextFloat();

        System.out.printf("Diện tích : %.2f\n", w * h);
        System.out.printf("Chu vi : %.2f", 2 * (w + h));
    }
}
