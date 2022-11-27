package two;

import java.util.Scanner;

public class ComparisonDemo2 {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj: ");
        int broj1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj: ");
        int broj2 = new Scanner(System.in).nextInt();

        if (broj1 == broj2) {
            System.out.println("isti su brojevi");
        }
        if(broj1 != broj2) {
            System.out.println("Razliciti su brojevi");
        }
    }
}
