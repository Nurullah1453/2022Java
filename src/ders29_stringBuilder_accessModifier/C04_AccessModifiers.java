package ders29_stringBuilder_accessModifier;

public class C04_AccessModifiers {



        String isim="Ali"; //accessmodifiers görünmüyor o zaman default accessmodifers geçerlidir
        //Bu class'dan ve ders29 packagesi içerisindeki diğer classlardan kullanılabilir

        //default int sayı=10; default accessModifiers yazılmaz. Hatta yazılamaz
        //yazmaya kalkışırsak java CTE verir.

        private static int sayı=10;


        public static void main(String[] args) {

                System.out.println(sayı); //10
                sayı=20;
                System.out.println(sayı); //20


        }
}
