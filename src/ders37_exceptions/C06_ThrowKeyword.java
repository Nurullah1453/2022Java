package ders37_exceptions;

import java.util.Scanner;

public class C06_ThrowKeyword {
    public static void main(String[] args) {

        //Kullanıcıdan yaşını isteyin
        //eğer 0 veya negatif bir sayı girerse
        // uyarı olarak IllegalArgumentException
        //uyarısı verin ancak kod çalışmaya devam etsin

        Scanner scan= new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz");
        int yas=scan.nextInt();

        if (yas<=0){

            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                System.out.println("Yaş 0 ve daha küçük olamaz");
            }
        }

    }
}
