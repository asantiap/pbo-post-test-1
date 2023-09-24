/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.posttest1;

    
import java.util.ArrayList; //impor (import statement) yang digunakan untuk mengimpor kelas ArrayList

public class Posttest1 { //Ini adalah deklarasi kelas utama .
     public static void main(String[] args) { 
        // ArrayList untuk Nama-nama Handphone
        ArrayList<Handphone> daftarHandphone = new ArrayList<>();

        // ArrayList dengan nama-nama Handphone
        daftarHandphone.add(new Handphone("iPhone 15 Pro", 2023));
        daftarHandphone.add(new Handphone("Samsung Galaxy S23", 2023));
        daftarHandphone.add(new Handphone("Oppo Reno 10", 2024));
        daftarHandphone.add(new Handphone("Poco F5 Pro", 2023));
        daftarHandphone.add(new Handphone("Xiaomi Mi 11", 2021));

        // Perulangan untuk menampilkan informasi Handphone
        for (Handphone handphone : daftarHandphone) {
            System.out.println("Handphone: " + handphone.getNama() + ", Tahun Rilis: " + handphone.getTahunRilis());
        }
    }
}
