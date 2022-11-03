package ders27_immutableClasses_DataAndTime;

import java.time.LocalDate;

public class C03LocalDate {

    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now(); //Bugünkü tarih

        System.out.println(tarih);

        System.out.println(tarih.minusDays(100));

        System.out.println(tarih.getMonth());

        System.out.println(tarih.getDayOfMonth());

    }
}
