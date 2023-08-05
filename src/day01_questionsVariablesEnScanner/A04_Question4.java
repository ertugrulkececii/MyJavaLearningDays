package day01_questionsVariablesEnScanner;

import java.util.Scanner;

public class A04_Question4 {
    public static void main(String[] args) {
        // 4- Kullanicidan bir dikdortgenin iki kenar uzunlugunu alip dikdortgenin alanini yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen dikdortgenin iki kenar uzunlugunu giriniz : ");
        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        System.out.println("Dikdortgenin alani = "+ kenar2*kenar1);
    }
}
