package ders39_abstractClass;

public class CHondaCivic extends BHonda{


    @Override
    public void motor() {
        System.out.println("Honda civic araclar vtec teknolojili çevreci motorları kullanır");
    }

    @Override
    public void kasa() {
        System.out.println("Civic araçlar sedan veya hb kasa kullanır");
    }

    @Override
    public void tekerler() {
        System.out.println("Civic araçlar 205x16x55 teker kullanır");
    }

    @Override
    public void yakıt() {
        System.out.println("Civic araçlar benzinlidir");
    }

    @Override
    public void güvenlik() {
        System.out.println("Civic araçlar güvenlik standartlarına uyar");

    }

    @Override
    public void abs() {
        System.out.println("Honda civic arabalar standart olarak abs kullanır");
    }

    @Override
    public void klima() {
        System.out.println("Honda civic arabalar standart olarak klima kullanır");
    }

    public static void main(String[] args) {
        /*
        Abstract parent classlardaki abstract methodlar concrete child classlar tarafından
        mecburen override edilir.

        Ancak abstract parentlardaki concrete methodları override etmek mecburi değildir.
        Eğer child classa uyarlamak isterseniz override edebilirsiniz veya override etmeyip
        parent classdaki haliyle kullanabiliriz.
         */
        CHondaCivic civic1=new CHondaCivic();
        civic1.abs();//civic
        civic1.klima();//civic
        civic1.marka();//honda
        civic1.özelTeknoloji();//honda
    }
}
