package ders40_Interfaces;

public interface I03_InteraceChildOfInterface extends I01_Interface{
    //bir ınterfaceyi bir ınterfacenin childi yapmak için extens keyword kullanılır
    //bir interface concrete classı inherit edemez

    void method1();
    //interface bir child parent interfaceyi override edebilir fakat
    //ikisininde bodysi olmadıgından bu işlemin bir anlamı yoktur.

    int method4();
    boolean method5();
}
