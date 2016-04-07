package com.company;

import java.util.Scanner;

/**
 * Created by Syamsul Huda on 06/03/2016.
 */
public class Peminjaman {
    int opsiMenu3;
    newMainLy menuUtama= new newMainLy();
    public Peminjaman() {
    }

    public Peminjaman(int opsiMenu3) {
        this.opsiMenu3 = opsiMenu3;
    }

    public int getOpsiMenu3() {
        return opsiMenu3;
    }

    public void setOpsiMenu3(int opsiMenu3) {
        this.opsiMenu3 = opsiMenu3;
    }

    public void proses(){
        if(this.opsiMenu3==1){
            //Peminjaman
        }else if(this.opsiMenu3==2){
            //Pengembalian
        }else if(this.opsiMenu3==3){
            //Daftar Peminjam
        }else if(this.opsiMenu3==4){
            //Main.main(null);//Kembali ke menu Utama
        }else{
            //klo gk ada di opsi
        }
    }

    public void infoPeminjaman(){
        Scanner scan = new Scanner(System.in);
        System.out.println("===== Peminjaman Barang =====");
        System.out.println("1.Peminjaman");
        System.out.println("2.Pengembalian");
        System.out.println("3.Daftar Peminjam");
        System.out.println("4.Kembali Ke Menu Utama");
        System.out.println("Masukkan Pilihan Anda :");
        int opsi=scan.nextInt();
        this.opsiMenu3=opsi;
        proses();
    }
}
