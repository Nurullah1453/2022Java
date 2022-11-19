package ders40_Interfaces;

public class I02_ConcreteChildClassOfInterface implements I01_Interface {
    //Bir classı bir ınterface'nin child'ı yapmak için implements keyword kullanılır.

    public static void main(String[] args) {
        System.out.println(mesaj);
        //sayı1=40; final yazmasada ınterface finaldir atama yapamayız
    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
