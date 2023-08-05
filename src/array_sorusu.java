import java.util.Scanner;

public class array_sorusu {
    public static void main(String[] args) {

        //  2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //  NOT: Buyuk harf, kucuk harf hassasiyeti olmasin. Kullanici o veya O yazdiginda output Ocak olsun

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String harf = scanner.next().toUpperCase();


        String[] aylar = {"Ocak", "Subat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};

       boolean varMi=false;
        for (int i = 0; i < aylar.length; i++) {


            if ((aylar[i].startsWith(harf))) {
                System.out.println(aylar[i] + " ");
                varMi=true;

            }




        }if (!varMi){

            System.out.println("Yazdiginiz harf karsiliksizdir.");
        }




    }
}

