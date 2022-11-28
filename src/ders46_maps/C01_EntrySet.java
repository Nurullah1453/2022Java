package ders46_maps;

import ders44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {



        //önceki 2 derste key ve value değelerini key'i set olarak value ise collection olarak
        //toplu alabiliyorduk. Ancak key ve value birlikte kullanmak istediğimizde
        //Bu işlemi yapmak zor olur.

        //Bunun için java entry İnterfacesini oluşturmuştur.
        //Entryler key=value ikilisini bir entry olarak kabul ederler.

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

        Set<Map.Entry<Integer,String>> ögrenciEntrySeti=ögrenciMap.entrySet();
        System.out.println(ögrenciEntrySeti);
        /*
        [101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz]

        //Aralarındaki farklar:
        1-Yukarıdaki map--Burdaki Set Yukarıdakinde süslü parantez burda ise köşeli parantez
        2-Yukarıdakinde key ve valueler her eleman için bir arada ama ayrı ayrı bireyler.
        Entryde ise key=value ikisi birlikte bir element oluşturuyor.
         */

        //Entry seti içerisindeki entryleri bizde numara vererek yazdıralım.
        int sıraNo=1;

        for (Map.Entry<Integer,String> eachEntry:ögrenciEntrySeti
             ) {
            System.out.println(sıraNo+"-   "+eachEntry);
            sıraNo++;
        }

        //Entryleri kullanarak keyleri 1 yazdıralım.

        for (Map.Entry<Integer,String>eachEntry:ögrenciEntrySeti
             ) {
            System.out.println(eachEntry.getKey());
        }

        //Entryleri kullanarak tüm öğrencilerin sınıflarını 1 artırıp 12. sınıfta olan varsa mapten cıkaralım.

        //Tüm entryleri elden geçirelim.
        String entryValue;
        String []entryValueArr;

        for (Map.Entry<Integer,String> eachEntry:ögrenciEntrySeti
             ) {
            //Her bir entrydeki valueyu alıp parçalayıp istenen updateyi yapıp yeniden mape eklememiz lazım.

            entryValue=eachEntry.getValue();
            entryValueArr=entryValue.split("-");

            if (entryValueArr[2].equals("12")){
                //öğrencinin sınıfı 12 ise
                eachEntry.setValue("Mezun Oldu");

            }else {
                //ögrencinin sınıfı 12 değilse
                int sınıf=Integer.parseInt(entryValueArr[2]);
                sınıf++;
                entryValueArr[2]=sınıf+"";
                eachEntry.setValue(entryValueArr[0]+"-"+entryValueArr[1]+"-"+entryValueArr[2]+"-"+
                        entryValueArr[3]+"-"+entryValueArr[4]);
                }
            }
        System.out.println(ögrenciMap);
        }


    }

