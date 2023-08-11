package C_ifElseStatements;

import java.util.Scanner;

public class A05_Question5 {
    public static void main(String[] args) {

        /*
        Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
kucukse “Maalesef kaldin” yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen notunuzu giriniz: ");
        double note= scan.nextDouble();
        if (note>=50){
            System.out.println("Sinifi gectin");
        }if (note<50){
            System.out.println("Maalesef kaldin!!!");
        }
    }
}
