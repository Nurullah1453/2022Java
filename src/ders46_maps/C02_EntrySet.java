package ders46_maps;

import ders44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    //Öğrenci mapinde sıralı olarak tüm öğrencilerin
    //Bölüm,Sınıf,Şube,İsim,Soyisim ve Numaralarını yazdıralım

    public static void main(String[] args) {

        Map<Integer,String> ögrenciMap= MapDepo.ornekMapOlustur();
        ögrenciMap.put(109,"Adem-Demir-11-D-Soz");

        //Soz,11,D,Adet Demir,109
        //Bu formatta Stringler oluşturup bir treeSet'e atayan ve bu seti bize döndüren bir method oluştralm.

        Set<String>sıralıÖgrenciListesi=MapDepo.sıralıÖgrenciListesiOlusturMethodu(ögrenciMap);
        System.out.println(sıralıÖgrenciListesi);


    }

}
