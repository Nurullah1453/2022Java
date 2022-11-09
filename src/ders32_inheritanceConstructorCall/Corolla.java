package ders32_inheritanceConstructorCall;

public class Corolla extends BToyota{

    Corolla (int pc){
        super(5);
        System.out.println("Parametreli Corolla Constructor");

    }

    Corolla(){

    }

    Corolla(String str){
        this();
        System.out.println("String Parametreli Corolla Constructor");

    }

    public static void main(String[] args) {

        Corolla corolla1= new Corolla();
        Corolla corolla2= new Corolla(3);
        Corolla corolla3= new Corolla("Ilker");


    }

}
