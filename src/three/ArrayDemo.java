package three;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int []numbers= new int[3];

        System.out.println("Unesi prvi broj");
        numbers [0] =new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj");
        numbers[1] =new Scanner(System.in).nextInt();
        System.out.println("Unesi treci broj");
        numbers[2]= new Scanner(System.in).nextInt();
        System.out.println(numbers);



    }
}
