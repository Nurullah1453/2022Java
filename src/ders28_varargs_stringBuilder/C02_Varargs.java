package ders28_varargs_stringBuilder;

public class C02_Varargs {

    public static void main(String[] args) {

        topla(5,6);
        topla(5,3,8);
        topla(2,4,6,8);
        topla(1);
        topla();
        topla(1,23,21,312,3,124,134,1,31,21,23,123,124,12,4312);

        /*
        Bir method'da parametre sayısını sınırlandırmak istemezsek standart
        bir variable yerine Varargs kullanırız.

        Varargs data türünün yanına 3 adet nokta konularak deklare edilir. (...)
        int... => sayısı belirli olmayan int parametreler alan bir array'dir.
         */


    }

    public static void topla(int... sayılar) {

        int toplamSonucu=0;
        for (int each: sayılar
        ) {
            toplamSonucu += each;
        }
        System.out.println("Girilen Sayıların Toplamı: " + toplamSonucu);
    }

}
