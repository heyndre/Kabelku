/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kabelku;

import java.util.Scanner;

/**
 *
 * @author Andre
 */
public class Kabelku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // TODO code application logic here
        String tekan = "(tekan enter untuk melanjutkan)"; //singkatan untuk tekan ....
        String id_asli = "admin"; //id petugas yang akan digunakan
        String pass_asli = "testing"; //password petugas yang akan digunakan
        String id_petugas ; //variable container id yang di input
        String pass_petugas ; //variable container password yang di input
        byte menu;
        byte paket;
        String nama;
        String alamat;
        String id_pelanggan;
        byte jumlah_tv;
        int harga;
        byte diskon = 10;
        String channel_lokal = "+ 10 channel nasional";
        int regular = 30000;
        int premium = 57500;
        int superr = 85000;
        int regist = 15000;
        Scanner scan = new Scanner(System.in);
        
        
        
        //start splash screen
        System.out.println("Selamat datang di aplikasi TV Kabelku. ");
        //login id petugas
        System.out.println("Silahkan masukkan user ID petugas anda "+tekan);
        id_petugas = scan.next();
        //login password petugas
        System.out.println("Silahkan masukkan password anda " +tekan);
        pass_petugas = scan.next();
        
        while ((!id_petugas.equals(id_asli)) && (!pass_petugas.equals(pass_asli))) {
            System.out.println("Log in gagal. Data yang anda masukkan tidak sesuai. Silahkan coba lagi.");
             //login id petugas
            System.out.println("Silahkan masukkan user ID petugas anda "+tekan);
            id_petugas = scan.next();
            //login password petugas
            System.out.println("Silahkan masukkan password anda " +tekan);
            pass_petugas = scan.next();
            }
       
       
            System.out.println("Selamat datang di main menu");
            System.out.println("Silahkan masukkan kode menu yang akan anda gunakan :");
            System.out.println("1 untuk registrasi pelanggan baru");
            System.out.println("2 untuk transaksi pembayaran tagihan");
            System.out.println("3 untuk penggantian paket layanan pelanggan");
            menu = scan.nextByte();
            while (menu >3 || menu < 1) { System.out.println("Kode yang anda masukkan tidak sesuai. silahkan masukkan kode menu yang akan anda gunakan");
            menu = scan.nextByte();
            } // Checking range kode menu
                if (menu == 1) {
                System.out.println("Anda telah memilih menu registrasi pelanggan baru");
                System.out.println("Silahkan masukkan jenis paket yang akan digunakan. 1 untuk regular, 2 untuk premium, 3 untuk super"+tekan);
                paket = scan.nextByte();
                while (paket > 3 || paket < 1) {
                System.out.println("Kode paket yang anda masukkan salah. Silahkan coba lagi" +tekan);
                }//Bracket if paket range 1 - 3
                if (paket == 1) {
                    System.out.println("Anda telah memilih paket 1 (Regular). Paket ini terdiri dari 20 channel berbayar"+channel_lokal );
                    System.out.print("Silahkan masukkan nama pelanggan"+tekan);
                    nama = scan.next();
                    System.out.println("Silahkan masukkan alamat pelanggan (format nama_jalan,nomor_rumah,kelurahan,kecamatan"+tekan);
                    alamat = scan.next();
                    System.out.println("Silahkan masukkan jumlah tv yang didaftarkan pelanggan" +tekan);
                    jumlah_tv = scan.nextByte();
                    if (jumlah_tv == 1) { //jumlah tv 1, tanpa diskon
                        harga = regular + regist;
                        System.out.print("Biaya yang dibayarkan pelanggan bulan ini : " + harga);
                        System.out.println(" yang terbagi atas biaya pemasangan :"+regist+" dan biaya bulanan :" + regular);
                    }
                    
                    
                }
                
                } // Bracket if menu 1 (pendaftaran)
                else if (menu == 2) {
                   
                } // Bracket if menu 2 (pembayaran)
                else {
                    
                } // Bracket if menu 3 (ganti paket)
            } // Bracket if range menu 1 - 3
            
        
         
        }

       

