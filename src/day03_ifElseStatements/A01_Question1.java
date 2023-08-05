package day03_ifElseStatements;

import java.util.Scanner;

public class A01_Question1 {
    public static void main(String[] args) {

        //Soru1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a nummer : ");

        int sayi=scan.nextInt();
        if (sayi%5==0){
            System.out.println("this number is a multiple of 5");
        }
    }
}
