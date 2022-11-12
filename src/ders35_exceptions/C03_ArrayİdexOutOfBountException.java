package ders35_exceptions;

import java.util.Scanner;

public class C03_ArrayİdexOutOfBountException {

    public static void main(String[] args) {

        //Kullanıcıdan bir index isteyin kullanıcının girdiği indexteki
        //verilen bir arrayden kullanıcının girdiği bir elementi yazdırın.

        int [] arr={3,4,6,7,8,312,31,23,1,23,123,};

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen index giriniz");
        int girilenIndex=scan.nextInt();

        try {
            System.out.println(arr[girilenIndex]);
        } catch (Exception hata) {

            System.out.println(hata.getMessage()); //Index 56 out of bounds for length 11
            hata.printStackTrace();//java.lang.ArrayIndexOutOfBoundsException: Index 56 out of bounds for length 11
            //at ders35_exceptions.C03_ArrayİdexOutOfBountException.main(C03_ArrayİdexOutOfBountException.java:19)
            //javanın yazdıgı tüm hata mesajını verir ama çalışmaya devam eder

            //catch bloğunda hiçbir kod olmasada kodlarımız normal çalışmaya devam eder.
            //catch bloğunda kullanıcıya yazdıracağımız mesaj tamamen kod yazanın insiyatifindedir
            //Exception classından hazır hata mesajlarıda yazdırabilir
            //kendi istediği kodlarıda çalıştırabilir, hiçbir şey yazmayadabilir.

        }

    }
}
