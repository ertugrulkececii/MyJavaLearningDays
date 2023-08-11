package B_dataCasting;

public class A01_Question1 {
    public static void main(String[] args) {

        //1- Integer olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin.

        int sayi1=143;
        int sayi2=47;
        int sayi3=500;
        double ortalama= (double) ((sayi1+sayi2+sayi3)/3);

        System.out.println("ortalama double degeri: " + ortalama);
    }
}
