package com.company;

import java.util.Scanner;

/**
 * Created by Syamsul Huda on 06/03/2016.
 */
public class ManajemenBarang {
    int opsiMenu3;
    newMainLy menuUtama = new newMainLy();
    public ManajemenBarang() {
    }

    public ManajemenBarang(int opsiMenu3) {
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
            //menu11
        }else if(this.opsiMenu3==2){
            //menu12
        }else if(this.opsiMenu3==3){
            //menu13
        }else if(this.opsiMenu3==4){
            //Main.main(null);//Kembali Menu Utama
        }else{
            //Klo Gk ada di opsi
        }
    }

    public void infoManajemenBarang(){
        Scanner scan = new Scanner(System.in);
        System.out.println("===== Manajemen Barang =====");
        System.out.println("1.Tambah Barang");
        System.out.println("2.Hapus Barang");
        System.out.println("3.Ubah Info Barang");
        System.out.println("4.Kembali Ke Menu Utama");
        System.out.println("Masukkan Pilihan Anda :");
        int opsi=scan.nextInt();
        this.opsiMenu3=opsi;
        proses();
    }
}
