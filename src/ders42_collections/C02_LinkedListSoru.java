package ders42_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkedListSoru {
    //Soru : Kullanicidan deger alarak iki String liste olusturun.
    // Kullanici deger girmeyi birakmak icin 0’a basmalidir.
    // Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
    // liste1 : …….
    // liste2 : …….
    // ortak elementler : …….


    public static void main(String[] args) {
        System.out.println("Önce Liste 1'i oluşturalım.");
        List<String>list1=kullanıcıdanAlarakListOlustur();
        System.out.println("Şimdi 2. Listeyi Oluşturalım.");
        List<String>list2=kullanıcıdanAlarakListOlustur();

        System.out.println("Liste1: "+list1);
        System.out.println("Liste2: "+list2);
        list1.retainAll(list2);
        System.out.println("Ortak Elemanlar: "+list1);
    }

    public static List<String> kullanıcıdanAlarakListOlustur() {

        List<String>isimListesi=new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        String isim="";
        while (!isim.equalsIgnoreCase("0")){
            System.out.println("Listeye eklemek için isim giriniz|\n" +
                    "Bitirmek için 0'a basınız");
            isim=scan.nextLine();

            if (!isim.equalsIgnoreCase("0")){
                isimListesi.add(isim);
            }

        }
        return isimListesi;

    }

}
