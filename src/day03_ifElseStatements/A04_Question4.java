package day03_ifElseStatements;

import java.util.Scanner;

public class A04_Question4 {
    public static void main(String[] args) {

        /*Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
       “Eskenar ucgen” yazdirin
*/
         Scanner scan=new Scanner(System.in);
        System.out.print("Ucgenin 1.kenarini giriniz: ");
         double kenar1= scan.nextDouble();
        System.out.print("Ucgenin 2.kenarini giriniz: ");
        double kenar2= scan.nextDouble();
        System.out.print("Ucgenin 3.kenarini giriniz: ");
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3){
            System.out.println("Eskenar ucgen");
        }
    }
}
