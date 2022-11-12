package ders35_exceptions;

import java.util.Scanner;

public class C01_exception {

    public static void main(String[] args) {

        //Kullanıcıdan bir tam sayı alın ve sayının karesini yazdırın
        //Kullanıcı ondalıklı sayı girerse kullanıcıya uyarı yazısı yazdırıp
        //Tekrar Sayı İsteyin bir method oluşturun
        sayıAlKaresiniYazdır();


    }
    public static void sayıAlKaresiniYazdır(){

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Bir Tam Sayı Giriniz");


        try {
            int girilenSayı = scan.nextInt();
            //Eğer ondalıklı sayı girilirse 23. satır exeption verecek ve catch'e kadar olan kodlar
            //çalışmayacak catch bloğu hata yakalandıgında ne yapmasını istediğimizi söylediğimz yerdir.
            //bu soruda istenen exeption oluştugunda yeniden değer istenmesi.
            //Bu yüzden exception oluştugunda yeniden methodu calıstırdık.
            //hata olmazsa catch bloğu devreye girmez ve kod normal bir şekilde biter.
            System.out.print("Girdiğiniz Sayının Karesi: ");
            System.out.println(girilenSayı*girilenSayı);
        } catch (Exception e) {
            System.out.println("Tam Sayı Girmelisin");
            sayıAlKaresiniYazdır();

        }




    }



}
