package ders28_varargs_stringBuilder;

public class C05_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java candır.");

        System.out.println(sb.capacity()); //28   (16+12 yapar)
        System.out.println(sb.length()); //12

        System.out.println(sb.reverse()); //tersten yazar
        sb.reverse();

        System.out.println(sb.replace(0,4,"Ahmet hoca")); //0,1,2,3 ü kaldırım yerine Ahmet hoca yazacak

        System.out.println(sb.insert(18,"Bu bir yalandır")); //18. indexe bu bir yalandır yazar



    }
}
