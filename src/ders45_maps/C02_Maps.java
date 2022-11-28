package ders45_maps;

import ders44_maps.MapDepo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_Maps {
    public static void main(String[] args) {

        //öğrenciler mapinde şubesi H olan öğrencilerin isim soyisim ve sınıflarını yazdıralım.

        Map<Integer,String>ögrenciMap=MapDepo.ornekMapOlustur();

        Set<Integer> ögrenciKeyleri= ögrenciMap.keySet(); //Bir mapdeki keyleri set olarak döndürür.

        Collection<String>ögrenciValueCollection =ögrenciMap.values(); //Bir mapdeki tüm valueleri bize collection olarak döndürür.


    }
}
