package C_ifElseStatements;

import java.util.Scanner;

public class A08_Questions8 {
    public static void main(String[] args) {

        /*
        Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
zayif yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen agirliginizi kg cinsinden giriniz : ");
        double kg=scan.nextDouble();
        System.out.println("Lutfen boyunuzu cm cinsinden giriniz : ");
        double boy= scan.nextDouble();

        double kutleIndex=(kg*10000/(boy*boy));
        System.out.println("Vucut kitle indeksiniz : "+kutleIndex);
         if (kutleIndex>30){
             System.out.println("Maalesef OBEZ'siniz");
         } else if (kutleIndex<30 && kutleIndex>25) {
             System.out.println("Ne yazik ki kilolusun biraz dikkat et daa!!!");

         } else if (kutleIndex<25 && kutleIndex>20) {
             System.out.println("Kilonuz NORMAL bunu koruyunuz!");

         }else if (kutleIndex<=20){
             System.out.println("ZAYIF'siniz dikkat edin!");

         }else System.out.println("Hatali birseyler yaptiniz tekrar deneyin :)");
    }
}
