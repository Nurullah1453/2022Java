package ders47_mapsMethodları;

import ders44_maps.MapDepo;

import java.util.Map;

public class C02_Contains {

    public static void main(String[] args) {

        Map<Integer,String> ögrenciMap= MapDepo.ornekMapOlustur();

        System.out.println(ögrenciMap);
        /*
        {101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz}
         */
        System.out.println(ögrenciMap.containsKey(105));//true
        System.out.println(ögrenciMap.containsKey(111));//false

        System.out.println(ögrenciMap.containsValue("10"));//false
        System.out.println(ögrenciMap.containsValue("Veli-Cem-11-M-Soz")); //true

        //containsValue tamamen aynısı ile true verir 1 harfi bile farklıysa false döner



    }
}
