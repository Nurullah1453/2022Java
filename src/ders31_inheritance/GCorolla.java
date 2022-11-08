package ders31_inheritance;

public class GCorolla extends FToyota{

    String model ="Corolla";
    String üretimYeri="Türkiye";

    GCorolla(){
        super();
        System.out.println("Corolla Constructor'ı çalıştır");
    }

    public static void main(String[] args) {

        GCorolla corolla1= new GCorolla();
        System.out.println(corolla1.marka); //Toyota

        /*
        Bir child class'da obje oluşturduğumuzda oluşturulan obje sadece child class'a ait özellikleri
        değil tüm parent classlarındaki özellikleride taşır.

        Bir objenin bir class'ın özelliklerini taşıması için o obje oluşturulurken class'a ait
        constructor'ın çalışmış olması gerekir.
        Yani chil class'ındaki obje oluşturulurken tüm parent classlar'daki constructorlar'da
        otomatik olarak çalısır.

        Java bu işlem için şöyle bir mekanizma geliştirmiştir:
        Bir class oluşturduğumuzda biz constructor oluşturmasakda java'nın o class'a default
        constructor koydugu gibi extends keyword kullanan bir class'da oluşturulan herbir
        constructor'ın ilk satırına biz görmesekde super () constructor call koyar.

         */

    }

}
