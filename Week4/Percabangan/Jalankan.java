package Week4.Percabangan;

import java.util.Scanner;

public class Jalankan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ifelse cek = new Ifelse();

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.println("Status: " + cek.cekStatus(nilai));
        

        input.close();
    }
}
