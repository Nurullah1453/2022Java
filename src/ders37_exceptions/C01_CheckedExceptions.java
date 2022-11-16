package ders37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_CheckedExceptions {
    public static void main(String[] args) {

        String dosyaYolu="src/ders36_checkedExceptions/Deneme.txt";
        int k=0;
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);

            while((k=fis.read())!=-1) {
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {

            System.out.println("Dosya yolu yanlış veya dosya arızalı.");

        } catch (IOException e) {

            System.out.println("Dosya okuma veya yazma ile ilgili bir sorun var");

            /*
            Bir kod calisirken birden fazla exception olusma ihtimali varsa
            bu kodu calisir hale getirmek icin 4 ihtimal vardir

            1- herbir exception ic ice try-catch bloklari kullanmak
            2- Bir tane try blogu birden fazla catch blogu olusturmak
            3- method signature'na tum exception ihtimallerini yazmak (exceptions handle edilmis olmaz)
            4- eger muhtemel exceptiopn'larin tumunu kapsayan, daha genis kapsamli bir exception varsa
            onu kullanmak
             */
            /*
            2. ve 3. ihtimallerde oluşması muhtemel exceptionlar arasında parent child ilişkisi
            olup olmadıgı kontrol edilmelidir. Aralarında parent child ilişkisi yoksa exceptionları
            istediğimiz sırada yazabiliriz.

            Ancak parent Child ilişkisi varsa önce child sonra parent yazılmalıdır. Aksi taktirde parent
            daha kapsamlı oldugundan tüm exceptionları yakalar ve aşağıdaki child exception işlevsiz kalır.
            Java bu durumu kabul etmez, CTE verir.
             */
        }

    }
}
