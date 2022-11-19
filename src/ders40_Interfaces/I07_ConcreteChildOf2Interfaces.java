package ders40_Interfaces;

public class I07_ConcreteChildOf2Interfaces implements I05_Interface,I06_Interface{
   /*
   1-Bir class sadece bir classa extens edilebilir ancak birden fazla ınterface implements edilebilir.
   2-Concrete child class implement ettiği tüm interfacelerdeki abstract methodları override
   etmek zorunda oldugundan iki interfacedeki tüm methodları override etmek gerekir.
   İki interfacede aynı isimde ve aynı return type sahip methodlardan hangisini override ettiği
   önemli değildir. Ancak isimler aynı return typelar farklı oldugunda iki interfaceyi birden
   implement etmemiz mümkün olmayacaktır. Bu durumda
   *Ya child classdan bu iki interfaceyi implements etmekten vazgecmelisiniz
   *Veya sisteme müdahale imkanınız varsa bu karısıklıgı çözmelisiniz.
   3-Child classdan parent interfacelerdeki variableları kullanmak istersek
    -aynı isimde iki interfacede'de variable varsa tercihimizi belirtmeliyiz
    interfaceIsmi.variableIsmi şekilde...
    -Çakışma yoksa kullanacagımız variable sadece 1 interfacede varsa sadece variable ismi
       yazmak yeterli olacaktır.

   */

    public static void main(String[] args) {
        System.out.println(I06_Interface.MESAJ);
        System.out.println(I05_Interface.SAYI);
        System.out.println(SAYI2);
   }


    @Override
    public void method1() {

    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public int method4() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
