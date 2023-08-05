package day01_questionsVariablesEnScanner;

import java.util.Scanner;

public class A05_Question5 {
    public static void main(String[] args) {

        // 5- Kullanicidan ismini soyismini ve yasini alip assagidaki formatta yazdirin.

       // girilen bilgiler : J. Doe, 41

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen isiminizi griniz :");
        String isim = scanner.nextLine();
        System.out.println("lutfen soyisiminizi giriniz: ");
        String soyisim= scanner.nextLine();
        System.out.println("lutfen yasinizi giriniz: ");
        int yas= scanner.nextInt();


        System.out.println("girilen bilgiler : "+isim.toUpperCase().charAt(0)+" "+soyisim.toUpperCase().charAt(0) +soyisim.substring(1).toLowerCase()+ ", "+ yas );
    }
}
