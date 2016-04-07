package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Syamsul Huda on 28/02/2016.
 */
public class DBBarang {
    public static List<Barang> showQuery(){
        List<Barang> barangs = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:Barang.sqlite");
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery( "SELECT * FROM Barang;" );
            while ( rs.next() ) {
                barangs.add(new Barang(rs.getInt("Id"),rs.getString("Nama"),rs.getString("Kategori"),
                        rs.getInt("Jumlah"),rs.getString("Kondisi"),
                        rs.getString("Keterangan")));
            }
            rs.close();
            statement.close();
            connection.close();
        }catch(Exception e){
            System.err.println(e.getClass().getName()+";"+e.getMessage());
            System.exit(0);
        }
        return barangs;
    }
    public static void deleteQuery(DBEntity E){
        Connection connection = null;
        Statement statement = null;
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:Barang.sqlite");
            statement = connection.createStatement();
            String query = E.delete();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        }catch(Exception e){
            System.err.println(e.getClass().getName()+";"+e.getMessage());
            System.exit(0);
        }
        System.out.println("Delete Success");
    }
    public static void updateQuery(DBEntity E) {
        Connection connection = null;
        Statement statement = null;
        try{
            connection = DriverManager.getConnection("jdbc:sqlite:Barang.sqlite");
            statement = connection.createStatement();
            String query=E.update();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        }catch (Exception e){
            System.err.println(e.getClass().getName()+";"+e.getMessage());
            System.exit(0);
        }
        System.out.println("Update Berhasil");
    }
    public static void inputQuery(DBEntity E) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:Barang.sqlite");
            statement = connection.createStatement();
            String query = E.create();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ";" + e.getMessage());
            System.exit(0);
        }
        System.out.println("Input Berhasil");
    }

    public static void createShema() {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:Barang.sqlite");
            statement = connection.createStatement();
            String query = "CREATE TABLE Barang(" +
                    "No INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT ," +
                    "Id INTEGER NOT NULL ," +
                    "Nama VARCHAR(255) NOT NULL," +
                    "Kategori VARCHAR(255) NOT NULL," +
                    "Jumlah INTEGER NOT NULL," +
                    "Kondisi VARCHAR(255) ," +
                    "Keterangan VARCHAR(255) " +
                    ")";
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ";" + e.getMessage());
            System.exit(0);
        }
        System.out.println("Koneksi Berhasil");
    }

}
