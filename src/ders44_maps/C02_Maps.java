package ders44_maps;

import java.util.Map;

public class C02_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=MapDepo.ornekMapOlustur();

        ogrenciMap.put(105,"Hasan-Can-11-K-MF"); //105 in value değişir.
        ogrenciMap.put(108,"Hikmet-Han-10-M-TM");

        System.out.println(ogrenciMap);


        //108 numaralı öğrencinin isim ve soyismini yazdırın
        System.out.println(MapDepo.IsimSoyisimYazdır(ogrenciMap,108)); //Hikmet Han

        //104 numaralı öğrencinin şubesini K yapın
        //methodda istenen key mapde varsa değiştirip mapi geri döndürelim
        //yoksa hiçbir işlem yapmadan mapi geri döndürelim

        int ogrenciKey=105;
        String yeniSube="N";
        ogrenciMap=MapDepo.ogrenciyeYeniSubaAta(ogrenciMap,ogrenciKey,yeniSube);
        System.out.println(ogrenciMap);

    }
}
