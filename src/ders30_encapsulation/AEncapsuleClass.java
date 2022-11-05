package ders30_encapsulation;

public class AEncapsuleClass {

    private String hastaneIsmi="Yıldız Hastanesi";
    //Hastanesi ismi görülebilsin ama değiştirilemesin
    //getter methodu lazım


    public void setHastaUcreti(int hastaUcreti) {
        this.hastaUcreti = hastaUcreti;
    }

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }

    private int hastaUcreti;
    //Hasta ücreleride giriş yapılabilsin ama ücret sigortadan
    //alınacagı için personel göremesin
    //setter methodu lazım
    private String hemsireIsmi;
    private String hemsireAdresi;

    public String getHemsireIsmi() {
        return hemsireIsmi;
    }

    public void setHemsireIsmi(String hemsireIsmi) {
        this.hemsireIsmi = hemsireIsmi;
    }

    public String getHemsireAdresi() {
        return hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }
//Bu instance variablelerede herkes ulaşabilsin.
    //Bu durumda public yapmak akla gelen ilk çözüm olacaktır.
    //Bu variableleri public yapmak yerine
    //private yapıp getter ve setter oluşturmakda
    //aynı işlevi görür
}
