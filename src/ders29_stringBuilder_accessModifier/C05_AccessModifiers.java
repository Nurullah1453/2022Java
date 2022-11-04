package ders29_stringBuilder_accessModifier;

public class C05_AccessModifiers {

    public static void main(String[] args) {

        C04_AccessModifiers obj=new C04_AccessModifiers();

        obj.isim="Tugay";

        System.out.println(obj.isim); //Tugay

        C04_AccessModifiers obj2=new C04_AccessModifiers();

        System.out.println(obj2.isim); //Ali

        //obj.sayı Private variablelere başka classdan ulaşılamaz.


    }
}
