package day03_ifElseStatements;

import java.util.Scanner;

public class A03_Question3 {
    public static void main(String[] args) {

     /*  Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin

       */

        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen bir sayi giriniz: ");
        int sayi= scanner.nextInt();

        if (sayi%3==0){
            System.out.println(sayi+ " sayisi 3'e tam bolunuyor.");
        } else if (sayi%5==0) {
            System.out.println(sayi +" sayisi 5'e tam bolunuyor.");

        }else{
            System.out.println( sayi+ " sayisi 3'e ve 5'e tam bolunmuyor");
        }
    }
}
