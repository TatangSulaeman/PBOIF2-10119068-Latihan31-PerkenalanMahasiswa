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
public class Mahasiswa {
    String nim, nama;
    
    public void perkenalkanDiri() {
        String outputText = 
                "Hello everyone" + "\n" +
                "My NIM is " + nim + "\n" +
                "My Name is " + nama + "\n"+
                "";
        System.out.println(outputText);

    } 
    
}
