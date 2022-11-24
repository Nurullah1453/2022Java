package ders44_maps;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapDepo.ornekMapOlustur(); //Depodaki mapten örnek map oluşturur.
        //8. satırdan sonra map üzerinde yapacagımız her değişiklik bu classdaki ögrenci mapi etkiler.

        //mapin bu halini bir görelim.
        System.out.println(ogrenciMap);
        //101=Ali-Can-10-H-MF,
        //102=Veli-Cem-11-M-Soz,
        //103=Ali-Cem-11-H-TM,
        //104=Ayse-Can-10-H-MF,
        //105=Ayse-Cem-11-M-TM,
        //106=Fatma-Han-10-K-Soz


        //Mape 1 tane yeni element ekleyelim.
        ogrenciMap.put(110,"Nurullah-Demir-11-U-TM");

        //102 numaralı öğrenciyi update edelim.
        ogrenciMap.put(102,"Sedef-Özer-12-D-Soz");


        //103 nolu ogrencinin isim soyismini yazdıralım.

        System.out.println(MapDepo.IsimSoyisimYazdır(ogrenciMap, 103));

        //105 numaralı ögrencinin şubesini S yapalım

        MapDepo.ogrenciyeYeniSubaAta(ogrenciMap,105,"S");

        System.out.println(ogrenciMap);
        /*
        {101=Ali-Can-10-H-MF,
         102=Sedef-Özer-12-D-Soz,
         103=Ali-Cem-11-H-TM,
         104=Ayse-Can-10-H-MF,
         105=Ayse-Cem-11-S-TM,
         106=Fatma-Han-10-K-Soz,
            110=Nurullah-Demir-11-U-TM}

         */

    }
}
