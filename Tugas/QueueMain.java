package Tugas;

/**
 * @author Abhinaya
 */

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("==   Sistem Antrian RS ABHINAYA  ==");
        System.out.println("===================================");
        System.out.print("Masukkan kapasitas antrian: ");
        int n = sc.nextInt();

        Queue Q = new Queue(n);
        int pilih;

        do {
            System.out.println("===================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian terdepan");
            System.out.println("4. Cek Antrian paling belakang");
            System.out.println("5. Cari Pasien berdasarkan Nama");
            System.out.println("6. Cek semua Antrian");
            System.out.println("7. Exit");
            System.out.println("===================================");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            System.out.println("===================================");

            switch (pilih) {
                case 1:
                    System.out.print("Nama\t\t\t: ");
                    sc.nextLine();
                    String nama = sc.nextLine();
                    System.out.print("No ID\t\t\t: ");
                    int noID = sc.nextInt();
                    System.out.print("Jenis Kelamin (L/P)\t: ");
                    char jenisKelamin = sc.next().charAt(0);
                    System.out.print("Umur\t\t\t: ");
                    int umur = sc.nextInt();
                    Pasien p = new Pasien(nama, noID, jenisKelamin, umur);
                    Q.Enqueue(p);
                    break;
                case 2:
                    Pasien data = Q.Dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang dikeluarkan: " + data.nama + " " + data.noID + " "
                                + data.jenisKelamin + " " + data.umur);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.peekRear();
                    break;
                case 5:
                    System.out.print("Nama Pasien: ");
                    sc.nextLine();
                    String cari = sc.nextLine();
                    Q.peekPosition(cari);
                    break;
                case 6:
                    Q.daftarPasien();
                    break;
                case 7:
                    System.out.println("Terima kasih telah menggunakan layanan kami");
                    break;
            } 
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
