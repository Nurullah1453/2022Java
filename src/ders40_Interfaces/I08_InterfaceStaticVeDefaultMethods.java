package ders40_Interfaces;

public interface I08_InterfaceStaticVeDefaultMethods {

     /*
    Java 8 ile Dveloper'ların talebi üzerine yeni bir istisnai durum javaya eklenmiştir.
    Bir interfaceyi yıllar içerisinde yüzlerce class inherit etmiş olabilir.
    sonradan interfaceye eklenen bir abstract method tüm eski childlar taraından inherit
    edilmelidir. aksi taktirde tüm eski child classlar CTE verecektir.

    Java 8 ile birlikte java interfacelere default ve static ile işaretlenmek şartıyla
    bodysi olan method eklenmesine izin vermiştir.
    Bu sayede interfaceye sonradan eklenen method bodysi oldugu için override edilmek
    zorunda değildir.

    İnterface içerisinde bodysi olan method oluşturmak için kullanılan default ve static keywordleri
    arasında tek bir fark vardır:

    default kullanılan methodlar obje oluşturularak çağırılabilirken static olarak işaretlenen
    methodlar direkt kullanılabilir.

     */


    void method1();

    void method2();


    //İnterfacedeki tüm methodlar public ve abstracttır.
    //biz interfaceki methodun deklarasyonuna default yazarsak bu acces modifier degildir.


    public default void method3() {
        System.out.println("İnterface içindeki bodyli default method");
    }

    public static void method4(){
        System.out.println("İnterface içindeki bodyli static method");
    }

}
