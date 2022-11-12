package ders34_overriding_Pollymorphism;

public class DChild extends CParent{

    //Overriding kuralları
    //1.Kural: AccessModifier method signature dahil olmadıgından accessmodifier farklı olabilir.
    //  Child parentı sınırlandıramaz. Yani overriding methodun access modifier'i daha geniş
    //  kapsamlı olmalıdır.
    //  private-default-protecdet-public

    public void method1(){

    }

    //2.Kural: Private ve static methodlar override edilemez.
    //Aynı isimde method oluşturulunca Java CTE vermez fakat override işareti çıkmaz ve
    // override notasyonu kullanılmak istenirse CTE olur.
    // Yani java bunları farklı classlardaki farklı methodlar olarak kabul eder.

    //public void method2(){}

    private void method(){

    }

    //3.Kural: Return type method signaturesine dahil olmadıgından farklı seçilebilir ancak
    //return type void veya primitive ise aynı olmak zorundadır.
    //Eğer return typeler nonprimitive ise Child classdaki return type parent classdaki
    //return type ile aynı veya childi olmalıdır

    public void method4(){

    }

    public Integer method5(){
        return 5;
    }



}
