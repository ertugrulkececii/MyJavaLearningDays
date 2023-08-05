package day01_questionsVariablesEnScanner;

import java.util.Scanner;

public class A08_Question8 {
    public static void main(String[] args) {

        //8- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin degerlerini degistirin(swap).
        //x = x + y
        //y = x - y
        //x = x - y

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen degistirilmesini istediginiz iki sayi giriniz: ");
        int sayi1= scanner.nextInt();//10
        int sayi2=scanner.nextInt();//20

        sayi1=sayi2+sayi1;//30
        sayi2=sayi1-sayi2;//10
        sayi1=sayi1-sayi2;//20

        System.out.println("sayi1= "+sayi1+" sayi2= "+sayi2);
    }
}
