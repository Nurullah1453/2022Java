package ders32_inheritanceConstructorCall;

public class BToyota extends Araba{

    BToyota(){
        System.out.println("Parametresiz BTyota Constructor");
    }

    BToyota(int p2){
        System.out.println("Parametreli BToyota Consturctor");
    }

    BToyota (String pt2){
        super("mehmet");
        System.out.println("String Parametreli BToyota Constructor");
    }

}
