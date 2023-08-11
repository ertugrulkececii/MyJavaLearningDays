package A_questionsVariablesEnScanner;

import java.util.Scanner;

public class A07_Question7 {
    public static void main(String[] args) {

        //7- Kullanicidan 2 sayi alip ikisinin degerini birbiriyle degistirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen degistirmek istediginiz iki tane sayi giriniz :");
        int sayi1= scanner.nextInt();
        int sayi2=scanner.nextInt();
        int temp=0;

        temp= sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("sayi1= "+sayi1+" sayi2= "+sayi2);
    }
}
