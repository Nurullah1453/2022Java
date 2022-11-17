package ders38_abstraction;

public abstract class CParentAbstractClasses {

    /*
    Abstract bir class abstract methodlara sahip olabilir.
    Bir abstract class oluşturmak için class declarationuna abstract keyword eklenmelidir.

     */

    public abstract void mecburiMethod1();

    public abstract void mecburiMethod2();
    //soyut(abstract) methodların bodysi olmaz

    public String concreteMethod(){
        //bugüne kadar kullandıgımız normal methodlara soyut olmayan method demek yerine
        //concrete method denir.
        return "";
    }

    /*
    Bir parent classda child classların mutlaka override edeceği bir method oluşturduğumuzda
    method body'si gereksizleşir.
    Çünkü hiç çalışmayacaktır.
    1-Abstract dediğimizden dolayı parent classdan obje oluşturulamayacagı için objeler için bu method
    kullanılamaz.
    2-Child classlarda mecburen bu methodu override edeceklerinden bu methodların bodysi asla
    kullanılmayacaktır.

    Java hiç kullanılmayacak bu method bodyleri yazmamamıza imkan tanımıştır.
     */

    //Child classların mutlaka override etmesini istediğimiz methodları abstract olarak tanımlar
    //ve bodysiz olarak oluştururuz.

}
