package day03_ifElseStatements;

import java.util.Scanner;



public class A02_Question2 {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz: ");
       char harf= scan.next().toUpperCase().charAt(0);

       if (harf=='O'){
           System.out.println("Ocak");
       } else if (harf=='S') {
           System.out.println("Subat");
       } else if (harf=='M') {
           System.out.println("Mart");
       } else if (harf=='N') {
           System.out.println("Nisan");
       } else if (harf=='M') {
           System.out.println("Mayis");
       }else if (harf=='H'){
           System.out.println("Haziran");
       } else if (harf=='T') {
           System.out.println("Temmuz");

       } else if (harf=='A') {
           System.out.println("Agustos");

       } else if (harf=='E') {
           System.out.println("Eylul");

       } else if (harf=='E') {
           System.out.println("Ekim");

       } else if (harf=='K') {
           System.out.println("Kasim");

       } else if (harf=='A') {
           System.out.println("Aralik");

       }else {
           System.out.println("konsept disi bir harf girisi sorry:)");
       }

    }
}
