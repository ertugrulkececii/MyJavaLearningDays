package A_questionsVariablesEnScanner;

import java.util.Scanner;

public class A03_Question3 {
    public static void main(String[] args) {

        //3- Kullanicidan ismini soyismini ve yasini alip assagidaki formatta yazdirin.
        // Isminiz:John
        //Soyisminiz: Doe
        // Yasiniz: 31

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz :");
        String isim=scanner.nextLine();
        System.out.println("Lutfen soyadinizi giriniz :");
        String soyAdi= scanner.nextLine();
        System.out.println("Lutfen yasinizi giriniz :");
        int yas= scanner.nextInt();
        System.out.println("isminiz : " +isim +"\nSoyisminiz : "+soyAdi+"\nYasiniz : "+ yas);
    }
}
