package Sesion1;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vận tốc = ");
        float vt = sc.nextFloat();
        System.out.print("Thời gian ");
        float tg = sc.nextFloat();

        System.out.printf("Quãng đường = %.2f", (vt * tg));
    }
}
