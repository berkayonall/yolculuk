import java.util.Scanner;

public class yolculuk {
    public static void main(String[] args) {

        int mesafe, yas, yolculukturu;
        double sonuc ;

        Scanner input = new Scanner(System.in);

        System.out.println("Yaşınız :");
        yas = input.nextInt();

        System.out.println("Mesafe KM :");
        mesafe = input.nextInt();

        System.out.println("Tek Yön: 1" +
                "Gidiş-Geliş: 2");
        yolculukturu = input.nextInt();

        if (yas>24 && yas<65 ){
           if (yolculukturu == 1){
               sonuc = (mesafe*0.1);
               System.out.println("Tutar :" + sonuc);
           }
        }
         if (yas<=24 && yas >=12){
            if (yolculukturu == 1){
                sonuc = (mesafe*0.1);
                System.out.println("Tutar :" + (sonuc*0.9));
            }
        }
        if (yas>24 && yas<65 ){
            if (yolculukturu ==2 ) {
                sonuc = (mesafe * 0.1);
                System.out.println("Tutar :" + (sonuc*2));
            }
        }
        if (yas<=24 && yas >=12){
            if (yolculukturu == 2){
                sonuc = (mesafe*0.1);
                System.out.println("Tutar :" + (sonuc*0.7*2));
            }
        }

        if (yas>=65 ){
            if (yolculukturu == 1){
                sonuc = (mesafe*0.1);
                System.out.println("Tutar :" + (sonuc*0.7));
            }
        }

        if (yas>=65 ){
            if (yolculukturu == 2){
                sonuc = (mesafe*0.1);
                System.out.println("Tutar :" + (sonuc*0.5*2));
            }
        }

        if (yas<12 && yas>0 ){
            if (yolculukturu == 1){
                sonuc = (mesafe*0.1);
                System.out.println("Tutar :" + (sonuc*0.5));
            }
        }

        if (yas<12 && yas>0 ){
            if (yolculukturu == 2){
                sonuc = (mesafe*0.1);
                System.out.println("Tutar :" + (sonuc*0.2*2));
            }
        }
        else {System.out.println("Yanlış Değer Girdiniz!!");}
    }
}