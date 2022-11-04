package ders29_stringBuilder_accessModifier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_DateTimeFormatter {

    public static void main(String[] args) {

        LocalDateTime zaman = LocalDateTime.now();
        System.out.println(zaman); //2022-11-04T21:06:08.957998100

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/MM/YYYY");

        System.out.println(zaman.format(dtf1));

        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("d:MMM:YY");

        System.out.println(zaman.format(dtf2));

        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("d/MMMM/YYYY EEEE");

        System.out.println(zaman.format(dtf3));

    }
}
