package ders37_exceptions;

public class C03_ThrowKeyword {
    public static void main(String[] args) {

        int sayı=1;
        System.out.println(sayı);

        try {
            sayı=2;
            System.out.println(sayı);
            if (sayı==2){
                throw new RuntimeException();
            }

            sayı=3;
            System.out.println(sayı);

            sayı=4;
            System.out.println(sayı);


            sayı=5;
            System.out.println(sayı);

        } catch (RuntimeException e) {

        }


        sayı=6;
        System.out.println(sayı);

    }
}
