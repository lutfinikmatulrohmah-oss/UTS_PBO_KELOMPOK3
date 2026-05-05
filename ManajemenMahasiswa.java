/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS_PBO_KELOMPOK3;

import java.util.Scanner;

/**
 *
 * @author Lutfi Nikmatul Rohmah 
 * NIM = 25104410080
 * Kelas = Teknik Infomatika
 */
public class ManajemenMahasiswa {
    
    public static void main(String[] args) {

        // Membuat objek Scanner untuk input user
        Scanner input = new Scanner(System.in);

        // Array untuk menyimpan data mahasiswa (maks 10)
        Mahasiswa[] daftarMhs = new Mahasiswa[10];

        int jumlah = 0;   // Jumlah data mahasiswa
        int pilihan;      // Pilihan menu

        // Perulangan menu sampai user memilih keluar
        do {
            System.out.println("================================");
            System.out.println("               MENU             ");
            System.out.println("================================");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Cari Mahasiswa (NIM)");
            System.out.println("4. Tampilkan Mahasiswa Lulus");
            System.out.println("5. Naikkan Semester Semua");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");

            // Input pilihan
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan newline

            switch (pilihan) {

                case 1:
                    // Menambahkan data mahasiswa baru
                    if (jumlah < 10) {

                        System.out.print("NIM           : ");
                        String nim = input.nextLine();

                        // Validasi NIM tidak boleh kosong
                        if (nim.isEmpty()) {
                            System.out.println("NIM tidak boleh kosong!");
                            break;
                        }

                        System.out.print("Nama          : ");
                        String nama = input.nextLine();

                        System.out.print("Jurusan       : ");
                        String jurusan = input.nextLine();

                        System.out.print("Semester (1-8): ");
                        int semester = input.nextInt();

                        System.out.print("IPK (0.0-4.0) : ");
                        double ipk = input.nextDouble();
                        input.nextLine(); // Membersihkan newline

                        // Validasi input semester dan IPK
                        if (semester < 1 || semester > 8 || ipk < 0.0 || ipk > 4.0) {
                            System.out.println("Input tidak valid!");
                        } else {
                            // Simpan data ke array
                            daftarMhs[jumlah] = new Mahasiswa(nim, nama, jurusan, semester, ipk);
                            jumlah++;
                            System.out.println("Data berhasil ditambahkan!");
                        }

                    } else {
                        // Jika array sudah penuh
                        System.out.println("Data penuh!");
                    }
                    break;

                case 2:
                    // Menampilkan semua data mahasiswa
                    for (int i = 0; i < jumlah; i++) {
                        daftarMhs[i].tampilData(true);
                    }
                    break;

                case 3:
                    // Mencari mahasiswa berdasarkan NIM
                    System.out.print("Masukkan NIM: ");
                    String cariNim = input.nextLine();

                    boolean ditemukan = false;

                    for (int i = 0; i < jumlah; i++) {
                        if (daftarMhs[i].getNim().equals(cariNim)) {
                            daftarMhs[i].tampilData(true);
                            ditemukan = true;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;

                case 4:
                    // Menampilkan mahasiswa yang lulus
                    for (int i = 0; i < jumlah; i++) {
                        if (daftarMhs[i].isLulus()) {
                            daftarMhs[i].tampilData(true);
                        }
                    }
                    break;

                case 5:
                    // Menaikkan semester semua mahasiswa
                    for (int i = 0; i < jumlah; i++) {
                        daftarMhs[i].naikSemester();
                    }
                    System.out.println("Semester semua mahasiswa naik!");
                    break;

                case 6:
                    // Keluar dari program
                    System.out.println("Terima kasih!");
                    break;

                default:
                    // Jika pilihan tidak valid
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 6);

        // Menutup Scanner
        input.close();
    }
}