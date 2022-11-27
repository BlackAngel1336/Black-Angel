package three;

import java.util.Scanner;

public class BlockDemo {
    public static void main(String[] args) {
        System.out.println("Profa unesite broj poena nakon ispita");
        int brojPoena = new Scanner(System.in).nextInt();
        char ocjena;
        if (brojPoena >=90){
        ocjena = 'A';}
        else if (brojPoena >= 80){
            ocjena = 'B';
        }    else if (brojPoena >= 70){
            ocjena = 'C';
        } else if (brojPoena >= 60){
            ocjena = 'D';
        } else if (brojPoena >= 50){
            ocjena = 'E';
        } else  {
            ocjena = 'F';
        }
        System.out.println("Zasluzena ocjena je: "+ ocjena);


    }
}
