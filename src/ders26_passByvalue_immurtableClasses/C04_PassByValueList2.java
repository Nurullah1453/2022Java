package ders26_passByvalue_immurtableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList2 {

    public static void main(String[] args) {

        // Bir method oluşturalım
        //method'da yeni bir liste oluşturun.
        //Listeye sayılar listesindeki değerlerin 5 fazlasını element olarak atayın.
        //Sonra sayılar listesine değer olarak yeni listi atayın
        //Ve sayılar listini yazdırın


        List<Integer> sayılar=new ArrayList<>();

        sayılar.add(10);
        sayılar.add(20);
        sayılar.add(30);

        yeniListDeğeriAta(sayılar);

        System.out.println("Method Calldan Sonra Main Methodda Sayılar : " + sayılar);



    } public static void yeniListDeğeriAta (List<Integer>sayılar){

        List<Integer> yeniList = new ArrayList<>();

        for (int i = 0; i <sayılar.size() ; i++) {

            yeniList.add(sayılar.get(i)+5);

        }

        sayılar=yeniList;

        System.out.println("Method'da sayıların son hali: " +sayılar);

    }
}
