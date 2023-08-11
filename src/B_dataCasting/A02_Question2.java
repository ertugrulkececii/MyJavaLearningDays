package B_dataCasting;

import java.util.Scanner;

public class A02_Question2 {
    public static void main(String[] args) {

        //2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz: ");

       char harf= scanner.next().charAt(0) ;

        System.out.println("Girdiginiz harften sonraki 3 harf: "+(char)(harf+1)+ ", "+(char)(harf+2)+", "+(char)(harf+3) );


    }
}
