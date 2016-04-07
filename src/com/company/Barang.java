package com.company;

/**
 * Created by Syamsul Huda on 28/02/2016.
 */
public class Barang implements DBEntity {
    int Id,Jumlah;
    String Nama,Kategori,Kondisi,Keterangan;

    public Barang(int Id,String Nama,String Kategori,int Jumlah,String Kondisi,String Keterangan){
        this.Id=Id;
        this.Nama=Nama;
        this.Kategori=Kategori;
        this.Jumlah=Jumlah;
        this.Kondisi=Kondisi;
        this.Keterangan=Keterangan;
    }
    public String create(){
        return "INSERT INTO Barang(Id,Nama,Kategori,Jumlah,Kondisi,Keterangan)VALUES("+
                this.getId()+","+
                "'"+this.getNama()+"'"+","+
                "'"+this.getKategori()+"'"+","+
                this.getJumlah()+","+
                "'"+this.getKondisi()+"'"+","+
                "'"+this.getKeterangan()+"'"+
                ")";
    }
    public String update(){
        int up = getId();
        String kategorinew = getKategori();
        double jumlahnew = getJumlah();
        String kondisinew = getKondisi();
        String keterangannew = getKeterangan();
        return "UPDATE Barang set Kategori = '"+kategorinew+"', Jumlah = '"
                +jumlahnew+"', Kondisi = '"+kondisinew+"', Keterangan = '"+keterangannew+"' where Id='"+up+"';";
    }
    public String delete(){
        int  del = getId();
        return "DELETE from Barang where Id='"+del+"';";
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int jumlah) {
        Jumlah = jumlah;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getKategori() {
        return Kategori;
    }

    public void setKategori(String kategori) {
        Kategori = kategori;
    }

    public String getKondisi() {
        return Kondisi;
    }

    public void setKondisi(String kondisi) {
        Kondisi = kondisi;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String keterangan) {
        Keterangan = keterangan;
    }
}
