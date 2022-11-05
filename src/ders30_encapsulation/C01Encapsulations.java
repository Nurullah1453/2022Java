package ders30_encapsulation;

public class C01Encapsulations {

    public static void main(String[] args) {

        AEncapsuleClass personel1=new AEncapsuleClass();

       // personel1.hastaneIsmi="Java Hasanesi"; private oldugu için
        //görülemez

        //personel1.hastaUcreti=10000; private kullanılamaz

        //personel1.hemsireAdresi="Ankara"; private ulasılamaz
        //personel1.hemsireIsmi="Yıldız Yıldız"; private ulaslamaz

        System.out.println(personel1.getHastaneIsmi());

        personel1.setHastaUcreti(500);

        //getter ve setter methodları
        //bazende erişimi sınırlandırmak için değil
        //kullanıcıların işlevi iyi anlaması için kullanılır

        System.out.println(personel1.getHemsireAdresi());
        personel1.setHemsireAdresi("İstanbul");
        personel1.getHemsireIsmi();



    }
}
