/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.perkenalanmahasiswa.tugas;

/**
 *
 * @author amtat
 * Nama                 : Tatang Sulaeman
 * Kelas                : IF2
 * NIM                  : 10119068
 * Deskripsi program    : Menampilkan perkenelan mahasiswa
 */
public class Main {
    public static void main(String[] args){
        Mahasiswa dataMahasiswa = new Mahasiswa ();
        
        dataMahasiswa.nim = "10110269";
        dataMahasiswa.nama = "Rizki Adam Kurniawan";
        dataMahasiswa.perkenalkanDiri();
        
        dataMahasiswa.nim = "10110270";
        dataMahasiswa.nama = "Indra Tiola";
        dataMahasiswa.perkenalkanDiri();
        
        dataMahasiswa.nim = "10110271";
        dataMahasiswa.nama = "Robi Tanzil";
        dataMahasiswa.perkenalkanDiri();
        
        dataMahasiswa.nim = "10110272";
        dataMahasiswa.nama = "Muhammad Nur Awaludin";
        dataMahasiswa.perkenalkanDiri();
        
        System.out.println("DIBUAT OLEH TATANG SULAEMAN");
    }
}

