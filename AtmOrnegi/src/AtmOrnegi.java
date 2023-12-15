import java.util.Scanner;

public class AtmOrnegi {
    public static void main(String[] args) {
       String kullanicisifresi="esma23" ;
        Scanner klavye=new Scanner(System.in);
        System.out.println("ES BANKA HOŞ GELDİNİZ! ");
        System.out.println("Lütfen Şifrenizi Giriniz: ");
        String sifre=klavye.nextLine();

        for (int i=0;i<4;i++){
            if (kullanicisifresi.equals(sifre)){
                System.out.println("Giriş Başarılı.");
                break;
            }
            else{
                System.out.println("Hatalı Giriş Tekrar Deneyiniz ");
                sifre= klavye.nextLine();

            }
        }
        if (kullanicisifresi.equals(sifre)==false){
            System.out.println("Giriş Başarısız");
            System.exit(1);
        }

        double bakiye=23000;
while (true) {
    System.out.println("*********** İSLEMLER ************");
    System.out.println("Bakiyenizi öğrenmek istiyorsanız 1'i tuşlayınız. ");
    System.out.println("Para yatırmak istiyorsanız 2'yi tuşlayınız. ");
    System.out.println("Para çekmek istiyorsanız 3'ü tuşlayınız. ");
    System.out.println("Kart iade için 4'ü tuşlayınız. ");
    System.out.print("Yapmak İstediğiniz İşlem: ");
    int islem=klavye.nextInt();


    switch (islem) {
        case 1:
            System.out.println("BAKİYENİZ: " + bakiye);
            break;
        case 2:
            System.out.println("BAKİYENİZ: " + bakiye);
            System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
            double tutargirisi = klavye.nextDouble();
            System.out.println("İşleminiz başarılı!");
           bakiye=bakiye+tutargirisi;
            System.out.println("Yeni Bakiyeniz: " + bakiye);

            break;
        case 3:
            System.out.println("BAKİYENİZ: " + bakiye);
            System.out.println("Çekmek İstediğiniz Tutarı giriniz: ");

            double istenilenpara = klavye.nextDouble();
            if (istenilenpara > bakiye) {
                System.out.println("Yetersiz Bakiye! İşleminizi gerçekleştiremiyoruz! ");
            } else {
                 bakiye=bakiye-istenilenpara;
                System.out.println("Yeni Bakiyeniz: " + bakiye);

            }

            break;
        case 4:
            System.out.println("Kartınızı Almayı Unutmayınız!!!");
            System.exit(1); //programı tamamen durdurur
            break;
        default:
            System.out.println("Geçersiz İşlem Talebi ");
            break;
    }
    System.out.println("Başka İşlem Yapmak İstiyor Musunuz? ");
    String devammi=klavye.next();
    if (devammi.equalsIgnoreCase("hayır")){
        System.out.println("Kartınızı Almayı Unutmayın");
        break;
    }

}
    }

}