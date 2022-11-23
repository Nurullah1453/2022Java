package ders43_collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {
    public static void main(String[] args) {

        Set<Integer> sayılar = new HashSet<>();
        sayılar.add(12);
        sayılar.add(15);

        Set<Integer> sıralıSet = new TreeSet<>();
        sıralıSet.add(23);
        sıralıSet.add(34);

        sıralıSet.addAll(sayılar);

        System.out.println(sıralıSet);  //[12, 15, 23, 34]

        //Bir HashSet ve bir TreeSet oluşturalım ikisinede random 1000 tane sayı ekleyip
        //İşlem sürelerini kıyaslayalım

        Random rnd = new Random();
        int sayı;

        LocalTime hashBaslangıc=LocalTime.now();
        for (int i = 0; i <= 1000; i++) {

            sayı = rnd.nextInt(100000);
            sayılar.add(sayı);
        }
        LocalTime hashBitis=LocalTime.now();

        LocalTime treeBaslangıc=LocalTime.now();
        for (int i = 0; i <= 5000; i++) {

            sayı = rnd.nextInt(100000);
            sıralıSet.add(sayı);

        }
        LocalTime treeBitis=LocalTime.now();

        System.out.println("HashSet başlangıc: "+hashBaslangıc+" bitis: "+hashBitis);

        System.out.println("Tree set baslangıc: "+treeBaslangıc+" bitis: "+treeBitis);

        System.out.println("Hash süresi "+(hashBitis.getNano()-hashBaslangıc.getNano()));

        System.out.println("Tree süresi "+(treeBitis.getNano()-treeBaslangıc.getNano()));


    }
}