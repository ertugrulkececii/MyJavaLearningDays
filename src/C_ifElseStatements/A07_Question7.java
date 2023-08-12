package C_ifElseStatements;

import java.util.Scanner;

public class A07_Question7 {
    public static void main(String[] args) {
     /*  Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

      */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi Erkek ise:E Kadin ise:K olarak giriniz.");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();


        if (cinsiyet == 'E') {

            if (yas >= 80 || yas < 0) {
                System.out.println("Gecersiz yas girisi!!!");

            } else if (yas >= 65) {
                System.out.println("ERkek emekli olabilir");
            } else System.out.println("Erkek olarak emekli olmak icin " + (65 - yas) + " yil daha calismalisiniz.");

        } else if (cinsiyet == 'K') {

            if (yas < 10 || yas > 80) {
                System.out.println("Gecersiz yas girisi!!!1");
            } else if (yas >= 60) {
                System.out.println("Kadin emekli olabilir.");
            } else {
                System.out.println("Kadin olarak emekli olmak icin " + (60 - yas) + " yil daha calismalisiniz.");
            }

        } else {

            System.out.println("Hatali cinsiyet girisi!!!!");
        }
    }
}

