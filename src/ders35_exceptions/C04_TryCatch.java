package ders35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_TryCatch {
    //Kullanıcıdan istediği kadar sayı girmesini isteyip
    //Girilen sayıları toplayalın
    //Kullanıcının işlemi bitirmek için Q'ya basmasını isteyin
    //Q'ya basıldıgında toplam kaç sayı girdiğini ve bu sayıların toplamını yazdırın

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        double girilenSayı=0;
        double sayılarınToplamı=0;
        int sayac=0;
        boolean devam=true;

        while (devam){

            System.out.println("Toplanmak Üzere Sayı Giriniz. \n Bitirmek İçin Q ya basınız");

            try {
                girilenSayı = scan.nextDouble();
                sayılarınToplamı+=girilenSayı;
                sayac++;
            } catch (InputMismatchException e) {

                String str=scan.next();
                if (str.equalsIgnoreCase("q")){
                    break;
                }

            }



        }

        System.out.println("Girilen "+sayac +" adet sayının toplamı: " + sayılarınToplamı);

    }
}
