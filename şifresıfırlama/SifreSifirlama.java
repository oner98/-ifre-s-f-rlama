package aaccdd;

import java.util.Scanner;

public class SifreSifirlama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Örnek mevcut şifre
        String mevcutSifre = "eskiSifre123";

        // Kullanıcıdan mevcut şifreyi girmesini iste
        System.out.print("Mevcut şifrenizi giriniz: ");
        String girilenSifre = scanner.nextLine();

        // Şifre kontrolü
        if (!girilenSifre.equals(mevcutSifre)) {
            System.out.println("Yanlış şifre!");

            // Kullanıcıya şifre sıfırlamak isteyip istemediğini sor
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayir): ");
            String cevap = scanner.nextLine();

            if (cevap.equalsIgnoreCase("evet")) {
                // Yeni şifreyi kullanıcıdan iste
                System.out.print("Yeni şifrenizi giriniz: ");
                String yeniSifre = scanner.nextLine();

                // Yeni şifrenin mevcut şifre ile aynı olup olmadığını kontrol et
                if (yeniSifre.equals(mevcutSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                    // Burada istenirse mevcutSifre'yi yeni şifre ile güncelleyebiliriz
                    mevcutSifre = yeniSifre;
                }
            } else {
                System.out.println("Şifre sıfırlama iptal edildi.");
            }
        } else {
            System.out.println("Şifre doğru, giriş başarılı.");
        }

        scanner.close();
    }
}
