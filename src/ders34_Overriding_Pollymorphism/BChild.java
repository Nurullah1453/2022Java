package ders34_Overriding_Pollymorphism;

public class BChild extends AParent{

    public void method1(){
        System.out.println("Child Class method1");
    }
    public void method2(int a){
        //Overriding olabilmesi için hem method ismi hemde method signature aynı olmalı.
        System.out.println("Child class method2");
    }
    public void method2(String isim){
        System.out.println("Child class String parametreli method2");
    }

    @Override
    public void method3() {
        //super.method3(); overriding varsa parent ve child classdaki overridden ve overriding
        //methodlardan sadece biri çalışır
        //eğer ikisini birden çalıştırmak istersek super.method3() kullanılır.

        //overriding method @Override notasyonu ile işaretlenebilir.
        //@Override kullanılmayan overriding işleminde Parent classdaki overridden method
        //silinirse hiçbir sorun olmaz.
        //Ancak @Override kullanılan overriding işleminde Parent classdaki overridden method
        //silinirse CTE verir. Böylece overridden methodun silinmesi engellenir.
    }
}
