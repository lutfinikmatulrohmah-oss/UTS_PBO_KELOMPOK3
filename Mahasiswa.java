/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS_PBO_KELOMPOK3;

/**
 *
 * @author Lutfi Nikmatul Rohmah 
 * NIM = 25104410080
 * Kelas = Teknik Infomatika
 */
public class Mahasiswa {
    // Atribut (Encapsulation)
    private String nim, nama, jurusan;
    private int semester;
    private double ipk;

    // Getter & Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Constructor pada Overloading
    // Constructor default
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.jurusan = "";
        this.semester = 1;
        this.ipk = 0.0;
    }

    // Constructor dengan 2 parameter
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = "";
        this.semester = 1;
        this.ipk = 0.0;
    }

    // Constructor lengkap
    public Mahasiswa(String nim, String nama, String jurusan, int semester, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.semester = semester;
        this.ipk = ipk;
    }

    // Method pada Overloading
    // Menampilkan data mahasiswa
    public void tampilData() {
        System.out.println("NIM      : " + nim);
        System.out.println("Nama     : " + nama);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Semester : " + semester);
        System.out.println("IPK      : " + ipk);
        System.out.println("==============================");
    }

    // Menampilkan data dengan header (opsional)
    public void tampilData(boolean denganHeader) {
        if (denganHeader) {
            System.out.println("============================");
            System.out.println("       DATA MAHASISWA       ");
            System.out.println("============================");
        }
        tampilData();
    }

    // Mengecek apakah mahasiswa lulus
    public boolean isLulus() {
        return ipk >= 3.0;
    }

    // Menambah semester jika belum mencapai batas
    public void naikSemester() {
        if (semester < 8) {
            semester++;
        }
    }

    // Main untuk testing
    public static void main(String[] args) {

        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("NIM      = " + mahasiswa.getNim());
        System.out.println("Nama     = " + mahasiswa.getNama());
        System.out.println("Jurusan  = " + mahasiswa.getJurusan());
        System.out.println("Semester = " + mahasiswa.getSemester());
        System.out.println("IPK      = " + mahasiswa.getIpk());
    }
}
   
