package C_ifElseStatements;

import java.awt.*;
import java.util.Scanner;

public class A10_Questions10 {
    public static void main(String[] args) {
        /*
        Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
“istediginiz birim sisteme kayitli degil” yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Mesafeyi km olarak giriniz: ");
        double km= scan.nextDouble();
        System.out.println("Donusturmek istediginiz birim metre: m, santimetre ise: cm, olarak yazin");
        String birim=scan.next();

        if (birim.equals("m")){
            System.out.println("Metre cinsinden sonuc ="+km*1000+"m");
        } else if (birim.equals("cm")) {

            System.out.println("Santimetre cinsinden sonucunuz ="+km*100000+"cm");
        }else
            System.out.println("istediginiz birim sisteme kayitli degil!!!");
    }
}
