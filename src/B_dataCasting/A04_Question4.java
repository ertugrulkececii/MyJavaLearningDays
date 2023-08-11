package B_dataCasting;

import java.util.Scanner;

public class A04_Question4 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen iki double deger giriniz:");
        double sayi1= scanner.nextDouble();
        double sayi2= scanner.nextDouble();

        int result= (int)(sayi1/sayi2);
        System.out.println("Verilen double sayilarinin sonucunun int degeri= "+ result);
    }
}
