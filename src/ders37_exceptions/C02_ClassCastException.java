package ders37_exceptions;

public class C02_ClassCastException {

        public static void main(String[] args) {

            short sayı1=23;
            int sayı2=sayı1;

            Short sayı3=24;
            //Integer sayı4=sayı3; Integer ve Short arasında parent child ilişkisi olmadığından
            //                     birbirine atama yapamayız.


            //Aralarında parent child ilişkisi olan classlardan oluşan objeler için
            //outo-widening veya explicit-norrowing mümkündür

            Object obj = sayı3;
            System.out.println("Shord'tan objeye cast edince: "+obj);

            Integer sayı5=(Integer) obj;

            System.out.println("Shord datayı obje üzerinde Integer'a çevirince: "+sayı5);
            //.ClassCastException
        }
    }


