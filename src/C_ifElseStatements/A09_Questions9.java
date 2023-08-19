package C_ifElseStatements;

import java.util.Scanner;

public class A09_Questions9 {
    public static void main(String[] args) {
        /*
        Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
alirsa %15, yoksa %10 indirim yapin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz : ");
        int adet=scan.nextInt();
        System.out.println("Lutfen aldiginiz urunun liste fiyatini giriniz: ");
        double fiyat= scan.nextDouble();
        System.out.println("Musteri kartiniz varsa 'E' degilse 'H' giriniz:  ");
        char kartVarMi=scan.next().toUpperCase().charAt(0);

        if(kartVarMi=='E'){
            if (adet>=10){
                System.out.println("%20 indirimle urun tutariniz: "+((fiyat*20)/100)*adet);
            }else {
                System.out.println("%15 indirimle urun tutariniz: "+((fiyat*15)/100)*adet);
            }
        }else {
            if(kartVarMi=='H'){
                if (adet>=10){
                    System.out.println("%15 indirimle urun tutariniz: "+((fiyat*15)/100)*adet);
                }else if (adet<10){
                    System.out.println("%10 indirimle urun tutariniz: "+((fiyat*10)/100)*adet);
                }else System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz tekrar bekleriz...");
            }
        }

    }
}
