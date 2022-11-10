package ders33_inheritanceDataTipeKullanımı_overriding;

public class Corolla extends BToyota{

    String model="Corolla";
    String uretimYeri="Türkiye";
    int yıl=2023;

    public static void main(String[] args) {
        /*
        Bir obje oluşturulurken data türü ve obje aynı classda ise bir variablenin değerini
        bulmak için o classa gideriz yoksa sırasıyla parent classlara bakılır.
        İlk bulunan kullanılır.
         */

        Corolla corolla1=new Corolla();
        System.out.println(corolla1.model); //Corolla classından kullanır
        System.out.println(corolla1.uretimYeri); //Corolla classından kullanır
        System.out.println(corolla1.yıl); //Corolla classından kullanır.
        System.out.println(corolla1.marka); //Btoyota classından kullanır
        System.out.println(corolla1.motor); //Araba classından kullanır.
        System.out.println(corolla1.plaka); //Araba classından kullanır.
        System.out.println(corolla1.yakıt); //Btoyotadan kullanır.


        BToyota corolla2=new Corolla();
        /*
        Obje oluşturulurken Data türü ve constructor farklı ise Variablenin değerini bulmak için
        data türü olan classa gidilir. Varsa kullanılır yoksa o class'ın parentlerına bakılır.
        Bulunamazsa CTE verir. (child classa bakmaz)
         */

        System.out.println(corolla2.model);//BTyota classı kullanılır
        //System.out.println(corolla2.uretimYeri);//CTE verir
        System.out.println(corolla2.yil);   //BTyota classı kullanılır
        System.out.println(corolla2.marka); //BTyota classı kullanılır
        System.out.println(corolla2.motor); //Araba classı kullanılır
        System.out.println(corolla2.plaka); //Araba classı kullanılır
        System.out.println(corolla2.yakıt); //BTyota classı kullanılır

        Araba corolla3=new Corolla();

        //System.out.println(corolla3.model);//CTE verir
        //System.out.println(corolla3.uretimYeri);//CTE verir
        //System.out.println(corolla3.yil);   //CTE verir
        //System.out.println(corolla3.marka); //CTE verir
        System.out.println(corolla3.motor); //Araba classı kullanılır
        System.out.println(corolla3.plaka); //Araba classı kullanılır
        System.out.println(corolla3.yakıt); //Araba classı kullanılır


        BToyota toyota1= new BToyota();

        System.out.println(toyota1.marka); //BToyota classı kullanılır
        System.out.println(toyota1.model); //BToyota classı kullanılır
        System.out.println(toyota1.motor); //Araba classı kullanılır
        System.out.println(toyota1.plaka); //Araba classından kullanılır
        System.out.println(toyota1.yil); //BToyota classından kullanılır
        System.out.println(toyota1.yakıt); //BToyota classından kullanılır

        Araba toyota2 = new BToyota();

        //System.out.println(toyota2.marka); //CTE verir
        //System.out.println(toyota2.model); //CTE verir
        System.out.println(toyota2.motor); //Araba classı kullanılır
        System.out.println(toyota2.plaka); //Araba classından kullanılır
        //System.out.println(toyota2.yil); //CTE verir
        System.out.println(toyota2.yakıt); //Araba classından kullanılır

        Araba araba=new Araba();
        System.out.println(araba.motor); //Araba classı
        System.out.println(araba.plaka); //Araba classı
        System.out.println(araba.yakıt); //Araba classı

    }



}
