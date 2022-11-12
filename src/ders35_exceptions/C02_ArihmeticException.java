package ders35_exceptions;

public class C02_ArihmeticException {

    public static void main(String[] args) {

        //Verilen 2 sayıyı birbirine bölüp sonucun tam sayı kısmını yazdırın

        int sayı1=20;
        int sayı2=0;

        try {
            //Riskli oldugunu ön gördüğümüz kodlar
            System.out.println(sayı1/sayı2);
            System.out.println("Bakalım bu satır çalışacak mı?");
        } catch (Exception e) {
            //catch (Exception e) ön gördüğümüz risk
            System.out.println("Sayı 0'a bölünemez");
            //catch(0'den sonraki { } catch bloğu deniz
            // beklenen risk gerçekleşirse çalışacak kodlar)
        }

        /*
        Bazı exception'lar if else ile handle edilebilir ancak tüm exceptionlar için
        if else yeterli olmaz.
         */



    }
}
