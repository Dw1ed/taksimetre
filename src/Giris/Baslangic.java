
package Giris;
import java.util.Scanner;


public class Baslangic {
    public static void main(String[] args) {
        int km;
        double perkm=2.20,total,startPrice = 10;
        
        
        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinde giriniz ");
        km=input.nextInt();
        total=(km*perkm);
        total+= startPrice;

        total=(total<20) ? 20:total;
        System.out.print("Toplam Tutar:"+total);
        
        
    }
}
