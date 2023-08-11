package D_prePostIncreament;

public class day03_prePostIncreaments {
    public static void main(String[] args) {

        //Soru 1- ASagidaki kod calisirsa konsolda gorunecek sonuclar neler olur?

        int a=10;

        System.out.println("a'nin degeri : "+ ++a); //11

        int b= a++;

        System.out.println("b'nin degeri : "+ b); //11

        int c=  b++ +a ;

        System.out.println("c'nin degeri : "+ c); //23

        System.out.println("Son toplam : "+ (a+b+c)); //47


    }
}
