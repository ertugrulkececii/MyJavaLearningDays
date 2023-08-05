package day01_questionsVariablesEnScanner;

import java.util.Scanner;

public class A01_Question1 {
    public static void main(String[] args) {

        // 1- Kullanicidan 3 farkli data turunde deger alip girilen degerleri aciklamalariyla yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen String data turunde bir deger giriniz: ");
        String vari= scanner.next();
        System.out.println("Girdigniz deger String data turundedir.");

        System.out.print("Lutfen int data turunde bir deger giriniz: ");
        int varib=scanner.nextInt();
        System.out.println("Girdigniz deger integer data turundedir.");

        System.out.print("Lutfen double data turunde bir deger giriniz: ");
        double variable= scanner.nextDouble();
        System.out.println("Girdigniz deger double data turundedir.");

    }
}
