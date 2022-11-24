package ders44_maps;

import java.util.HashMap;
import java.util.Map;

public class MapDepo {

    //OgrenciMap oluşturup bize döndüren bir method oluşturun.

    public static Map<Integer, String> ornekMapOlustur() {
        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-10-H-MF");
        ogrenciMap.put(102, "Veli-Cem-11-M-Soz");
        ogrenciMap.put(103, "Ali-Cem-11-H-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Ayse-Cem-11-M-TM");
        ogrenciMap.put(106, "Fatma-Han-10-K-Soz");

        return ogrenciMap;
    }

    public static String IsimSoyisimYazdır(Map<Integer, String> ogrenciMap, int ogrenciKey) {
        /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz}

        ogrenciKey=105
        */

        String ogrenciValue = ogrenciMap.get(ogrenciKey);  //105=Ayse-Cem-11-M-TM,
        String[] valueArr = ogrenciValue.split("-"); //[Ayse, Cem, 11, M, TM]
        String isimSoyisim = valueArr[0] + " " + valueArr[1];

        return isimSoyisim;
    }

    public static Map<Integer, String> ogrenciyeYeniSubaAta(Map<Integer, String> ogrenciMap, int ogrenciKey,String yeniSube) {
        //ogrenciKey mapte var mı ?


        if (ogrenciMap.containsKey(ogrenciKey)){
            //İstenen key varsa update edip eyni mapi döndürelim

            String istenenKeyinValuesu=ogrenciMap.get(ogrenciKey); //Ayse-Can-10-H-MF,
            String [] istenenKeyValueArrayi=istenenKeyinValuesu.split("-");//[Ayse,Can,10,H-MF]

            //yeni şube değerini atayalım
            istenenKeyValueArrayi[3]=yeniSube; //[Ayse,Can,10,K-MF]

            String istenenKeyinYeniValuesu=istenenKeyValueArrayi[0]+"-"+istenenKeyValueArrayi[1]+"-"+
                    istenenKeyValueArrayi[2]+"-"+istenenKeyValueArrayi[3]+"-"+istenenKeyValueArrayi[4];
            ogrenciMap.put(ogrenciKey,istenenKeyinYeniValuesu);

        }
            return ogrenciMap;


    }
}
