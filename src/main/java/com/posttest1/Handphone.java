/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.posttest1;

/**
 *
 * @author anggr
 */
public class Handphone {
    private String nama; //Ini adalah deklarasi variabel instance yang disebut name dengan tipe data String.Variabel ini tidak dapat diakses oleh kelas lain.
    private int tahunRilis; //Ini adalah deklarasi variabel instance yang disebut tahunRilis dengan tipe data int (integer).
    //kata kunci private mengindikasikan bahwa variabel tahunRilis hanya dapat diakses secara langsung oleh kode dalam kelas "Handphone".

    public Handphone(String nama, int tahunRilis) { // Ini adalah konstruktor kelas "Handphone".
        this.nama = nama;
        this.tahunRilis = tahunRilis;
    }

    public String getNama() { //Ini adalah metode-metode yang digunakan untuk mengambil nilai variabel instance "nama" 
        return nama;
    }

    public void setNama(String nama) { //: Ini adalah metode-metode penetap yang digunakan untuk mengubah nilai variabel instance "nama"
        this.nama = nama;
    }

    public int getTahunRilis() { //Ini adalah metode-metode yang digunakan untuk mengambil nilai variabel instance "tahunrilis" 
        return tahunRilis;
    }

    public void setTahunRilis(int tahunRilis) { //: Ini adalah metode-metode yang digunakan untuk mengubah nilai variabel instance "tahunRilis"
        this.tahunRilis = tahunRilis;
    }
}
