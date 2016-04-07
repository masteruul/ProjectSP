package com.company;

import sun.applet.resources.MsgAppletViewer_ja;

import java.util.Scanner;

/**
 * Created by Syamsul Huda on 06/03/2016.
 */
public class newMainLy {
    int menuInduk;
    LihatBarang menu1;
    ManajemenBarang menu2;
    Peminjaman menu3;

    public int getMenuInduk() {
        return menuInduk;
    }

    public void setMenuInduk(int menuInduk) {
        this.menuInduk = menuInduk;
    }

    public newMainLy() {
        menu1 = new LihatBarang();
        menu2 = new ManajemenBarang();
        menu3 = new Peminjaman();
    }

    public newMainLy(int menuInduk) {
        this.menuInduk = menuInduk;
    }

    public void proses() {
        if (this.menuInduk == 1) {
            menu1.infoLihatBarang();
        } else if (this.menuInduk == 2) {
            menu2.infoManajemenBarang();//Infomenu2
        } else if (this.menuInduk == 3) {
            menu3.infoPeminjaman();//Infomenu3
        } else if (this.menuInduk == 4) {
            System.out.println("Keluar Dari Progam . . . .");
            System.exit(0);
        } else {
            System.out.println("Pilihan yang anda masukkan salah...");
            System.out.println("Masukkan Kembali Pilihan anda!!!!");
            //reset Progam
        }
    }

    public void tampilMenuInduk() {
        Scanner scan = new Scanner(System.in);
        System.out.println("===== Menu Utama =====");
        System.out.println();
        System.out.println("1.Lihat Barang");
        System.out.println("2.Manajemen Barang");
        System.out.println("3.Peminjaman");
        System.out.println("4.Keluar");
        System.out.println("Masukkan Pilihan Anda :");
        this.menuInduk = scan.nextInt();
        this.proses();
    }
}
