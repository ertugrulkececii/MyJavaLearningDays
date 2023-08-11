package A_questionsVariablesEnScanner;

import java.util.Scanner;

public class A06_Question6 {
    public static void main(String[] args) {

        //6- Kullanicidan bir cemberin yari capini alip, cevresini ve alanini yazdirin.

        // cevresi: 2.p.r
        // alani: p.r.r
        // pi=3

        Scanner scanner= new Scanner(System.in);
        System.out.println("lutfen bir cenber yari capi giriniz: ");
        double yaricap= scanner.nextDouble();
        System.out.println("Cemberin cevresi= "+(yaricap*3*2) +"\ncemberin alani= "+ (3*yaricap*yaricap) );
    }
}
