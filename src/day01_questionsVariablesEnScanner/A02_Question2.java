package day01_questionsVariablesEnScanner;

import java.util.Scanner;

public class A02_Question2 {
    public static void main(String[] args) {

        // 2- Kullanicidan bir int ve birde double deger alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir integer ve bir double degeri sirasiyla giriniz: ");
        int varib=scanner.nextInt();
        double variable= scanner.nextDouble();

        System.out.println("Degerlarin toplami ="+ (variable+varib)+ ", carpimi ise = "+ (variable*varib)+ " dir.");

    }
}
