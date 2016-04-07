package com.company;

import java.util.Scanner;

public class LihatBarang {
    int opsiMenu2;
    newMainLy menuUtama = new newMainLy();
    public LihatBarang() {
    }

    public LihatBarang(int opsiMenu2) {
        this.opsiMenu2 = opsiMenu2;
    }

    public int getOpsiMenu2() {
        return opsiMenu2;
    }

    public void setOpsiMenu2(int opsiMenu2) {
        this.opsiMenu2 = opsiMenu2;
    }

    public void proses(){
        if(this.opsiMenu2==1){
            //menu11
        }else if(this.opsiMenu2==2){
            //menu12
        }else if(this.opsiMenu2==3){
            //menu13
        }else if(this.opsiMenu2==4){
            //Main.main(null);
        }else{
            //Klo Gk ada di opsi
        }
    }

    public void infoLihatBarang(){
        Scanner scan = new Scanner(System.in);
        System.out.println("===== List Barang =====");
        System.out.println("1.Lihat Semua Barang");
        System.out.println("2.Cari Barang");
        System.out.println("3.Barang Rusak ");
        System.out.println("4.Kembali Ke Menu Utama ");
        System.out.println("Masukkan Pilihan Anda :");
        int opsi=scan.nextInt();
        this.opsiMenu2=opsi;
        proses();

    }
}
