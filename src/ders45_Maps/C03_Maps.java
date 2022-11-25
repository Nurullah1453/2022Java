package ders45_Maps;

import ders44_maps.MapDepo;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {

        Map<Integer,String> ögrenciMap= MapDepo.ornekMapOlustur();

        ögrenciMap.put(107,"Hasan-Yan-12-H-MF");
        ögrenciMap.put(101,"Adem-Fan-12-T-Soz");
        String subeAdı="H";
        MapDepo.subeOgrenciBilgileriniYazdır(ögrenciMap,subeAdı);
    }
}
