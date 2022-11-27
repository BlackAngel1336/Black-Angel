package three;

import java.util.Scanner;

public class SwitchDemoMarina {
    public static void main(String[] args) {
        System.out.println("Svaki broj bit ce jedna boja");
        int boje = new Scanner(System.in).nextInt();
        switch (boje) {
            case 1:
                System.out.println("Crvena");
                break;
            case 2:
                System.out.println("Zelena");
                break;
            case 3:
                System.out.println("Plava");
                break;
            case 4:
                System.out.println("Zuta");
                break;
            case 5:
                System.out.println("Ljubicasta");
                break;
            default:
                System.out.println("Netačna boja");
        }
    }
}
