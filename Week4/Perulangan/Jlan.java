package Week4.Perulangan;

import java.util.Scanner;

public class Jlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cetak brapa kali? ");
        int n = input.nextInt();

        // Membuat objek dari class Ulang
        Ulang u = new Ulang();
        u.cetakHalo(n); // Panggil method dari class Ulang

        input.close();
    }
}