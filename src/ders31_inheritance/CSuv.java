package ders31_inheritance;

public class CSuv extends BinekArac{

    public static void main(String[] args) {

        CSuv suv1=new CSuv();

        System.out.println(suv1.marka); //Binek Araçların Markası Olur.
        System.out.println(suv1.model); //Binek Araçların Modeli Olur.
        System.out.println(suv1.motor); //Tüm araçlar motor kullanır.
        System.out.println(suv1.plaka); //Tüm araçların plakası olur.
        System.out.println(suv1.yakıt); //Araçlar farklı yakıtlar kullanır
        System.out.println(suv1.yıl); //1900
        suv1.hız(suv1.yakıt); //Binek Araçların Hızı Modele Göre Değişir
        suv1.teker(); //Binek Araçların 4 Tekeri Olur.

        CSuv suv2= new CSuv();
        suv2.marka="Toyota";
        suv2.model="Rav4";
        suv2.motor="1.6";
        suv2.plaka="27 EB 401";
        suv2.yakıt="Benzin";
        suv2.yıl=2012;
        suv2.hız(suv2.yakıt); //Benzinli SUV'ler Max 300 km hız yapar


    }public void hız(String yakıt){

        if (yakıt.equalsIgnoreCase("benzin")){
            System.out.println("Benzinli SUV'ler Max 300 km hız yapar");
        } else if (yakıt.equalsIgnoreCase("dizel")) {
            System.out.println("Dizel SUV'ler Max 260 km hız yapar");
        }else if (yakıt.equalsIgnoreCase("hibrit")){
            System.out.println("Hibrit Suv'lar max 220 km hız yapar");
        }else {
            System.out.println("Yakıt Belli değil max hız söyleyemem");
        }

    }

}
