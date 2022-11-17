package ders38_abstraction;

public class DChildClassOfAbstractClass extends CParentAbstractClasses{

    //Abstract bir classdaki, abstract methodların tamamı concrete child classlar
    //tarafından override edilmelidir.

    @Override
    public void mecburiMethod1() {
        System.out.println("Child class method içerisinde methodu kendine uyarlar");
    }

    @Override
    public void mecburiMethod2() {

    }
}
