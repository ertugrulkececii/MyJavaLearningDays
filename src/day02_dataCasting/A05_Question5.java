package day02_dataCasting;

import java.util.Scanner;

public class A05_Question5 {
    public static void main(String[] args) {

       // Soru 5- Kullanicidan bir double, bir  tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen bir double ve bir int deger giriniz: ");
        double sayi1= scanner.nextDouble();
        int sayi2= scanner.nextInt();

        int bolum= (int)(sayi1/sayi2);
        System.out.println("bolumun tam sayi sonucu= "+bolum);

    }
}
