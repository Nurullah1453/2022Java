package ders26_passByvalue_immurtableClasses;

import java.util.ArrayList;
import java.util.List;

public class C06_ImmutableClasses {

    public static void main(String[] args) {

        String str="Java guzeldir";

        System.out.println(str.toUpperCase());

        System.out.println(str);

        str.toLowerCase();

        System.out.println(str);

        //String immutable oldugu için method ile yapılan degişikler
        //String'i kalıcı degiştirmez.

        List<String>harfler=new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.remove(0);

        System.out.println(harfler);

        //List immutable olmadıgı için kalıcı olarak degiştirir

    }
}
