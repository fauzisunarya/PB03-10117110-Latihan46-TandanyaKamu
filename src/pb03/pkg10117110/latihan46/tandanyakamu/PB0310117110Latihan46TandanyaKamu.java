




/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Keterangan sifat seseorang berdasarkan usia Dengan Menggunakan Konsep OOP
 */

package pb03.pkg10117110.latihan46.tandanyakamu;

import java.util.Scanner;


public class PB0310117110Latihan46TandanyaKamu {

 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Age objAge = new Age(2018);
        System.out.print("Masukan tahun Lahir Anda : ");
        objAge.setYearBirth(scan.nextInt());
        System.out.println("");
        
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun Lahir Anda "+objAge.getYearBirth());
        System.out.println("Hari ini Tahun : "+objAge.getYearNow());
        System.out.println("Umur kamu sampai saat ini adalah "+objAge.hitungUmur
        ()+" tahun ");
        System.out.println("Tandanya Kamu "+objAge.tandanyaKamu(objAge.hitungUmur()));
        
    }
    
}
