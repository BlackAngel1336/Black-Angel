package two;

import java.util.Scanner;

public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Pritisni peticu i započni igricu: ");
        int broj1 = new Scanner(System.in).nextInt();
        if (broj1 == 5) {
            System.out.println("Pritisnuo si peticu i počeo si igricu");
        }else {
            System.out.println("Nisi pritisnuo peticu");
        }




    }
}