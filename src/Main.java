import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan eleman sayısını almak için Scanner sınıfını kullanıyoruz.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan eleman sayısını girmesini istiyoruz.
        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        // Kullanıcının girdiği eleman sayısına göre Fibonacci serisini oluşturuyoruz.
        System.out.println(elemanSayisi + " Elemanlı Fibonacci Serisi:");
        int sayi1 = 0, sayi2 = 1;

        // Eleman sayısı kadar döngü çalıştırıyoruz.
        for (int i = 0; i < elemanSayisi; i++) {
            // Her adımda bir önceki sayıyı ekrana yazdırıyoruz.
            System.out.print(sayi1 + " ");

            // Yeni sayıyı bulup değişkenleri güncelliyoruz.
            int toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }

    }
}
