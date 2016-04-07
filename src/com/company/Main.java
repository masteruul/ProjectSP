package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //DBBarang.createShema();
        /*Barang b1=new Barang(11001,"Samsak","Alat Latihan",2,"Baik","Banyakin Dgunakan");
        Barang b2=new Barang(11002,"Target Kaki","Alat Latihan",2,"Baik","Masih Enak digunakan");
        Barang b3=new Barang(11003,"Matras","Alat Latihan",104,"Baik","Perlu Perawatan");
        DBBarang.inputQuery(b1);
        DBBarang.inputQuery(b2);
        DBBarang.inputQuery(b3);
        b2.setJumlah(6);
        b2.setKeterangan("Rusak Semua Nich");
        b2.setKondisi("Rusak");*/

        /*
        List<Barang> listbarang = DBBarang.showQuery();
        System.out.println("ID       || Nama         || Kategori     || Jumlah     || Kondisi    || Keterangan ");
        for(Barang b1: listbarang) {
            System.out.println(+b1.getId()+"    ||  "+b1.getNama()+"  ||    "+b1.getJumlah()+"  ||  "+b1.getKondisi()+" ||  "+b1.getKeterangan());
            System.out.println();
        }
        */
        newMainLy p1=new newMainLy();
        p1.tampilMenuInduk();
    }

}

