package C_ifElseStatements;

import java.util.Scanner;

public class A06_Question6 {
    public static void main(String[] args) {

        /*

         Soru 6- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
         olarak yazdirin, yoksa girilen harfi yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char karakter = scan.next().charAt(0);

        if (Character.isUpperCase(karakter)) {
            System.out.println("Girdiginiz harf: " + karakter);
        } else {
            System.out.println("Kucuk girilen harf buyuk harfe donusturulmustur : " + Character.toUpperCase(karakter));
        }
    }
}
