import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        System.out.print("Masukkan angka pertama untuk penjumlahan: ");
        int a1 = input.nextInt();
        System.out.print("Masukkan angka kedua untuk penjumlahan: ");
        int b1 = input.nextInt();

        System.out.print("Masukkan angka pertama untuk perkalian: ");
        int a2 = input.nextInt();
        System.out.print("Masukkan angka kedua untuk perkalian: ");
        int b2 = input.nextInt();

        int hasilTambah = kalkulator.tambah(a1, b1);
        int hasilKali = kalkulator.kali(a2, b2);

        System.out.println(a1 + " + " + b1 + " = " + hasilTambah + " " 
                         + a2 + " * " + b2 + " = " + hasilKali);

        input.close();
    }
}
