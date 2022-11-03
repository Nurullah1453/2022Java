package ders28_varargs_stringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {

        topla(5,6);
        topla(5,3,8);
        topla(2,4,6,8);

        //parametre sayısı değiştikçe bizden yeni bir method oluşturmamızı ister.




    }

    public static void topla(int sayı1, int sayı2, int sayı3, int sayı4) {
        System.out.println("4 Sayının Toplamı: "+ (sayı1+sayı2+sayı3+sayı4) );
    }

    public static void topla(int sayı1, int sayı2, int sayı3) {
        System.out.println("3 Sayının Toplamı: "+ (sayı1+sayı2+sayı3) );
    }

    public static void topla(int sayı1, int sayı2) {

        System.out.println("2 Sayının Toplamı: "+ (sayı1+sayı2) );
    }
}
