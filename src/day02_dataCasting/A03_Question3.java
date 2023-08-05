package day02_dataCasting;

import java.util.Scanner;

public class A03_Question3 {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        // ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.print("lutfen byte'a donusturmek istediginiz bir sayi giriniz: ");
        int sayi=scanner.nextInt();

        byte bytee= (byte)sayi;
        System.out.println("Girilen sayinin (byte)-128 ile 128 arasindaki degeri = "+bytee);
    }
}
