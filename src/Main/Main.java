/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import BangunDatar.*;

/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        Persegi square = new Persegi(6);
        Lingkaran circle = new Lingkaran(21);
        Segitiga triangle = new Segitiga(10, 15);
        
        System.out.println("Luas persegi dengan panjang sisi "+square.sisi+" adalah "+square.hitungluas());
        System.out.println("Luas lingkaran dengan panjang jari-jari "+circle.jariJari+" adalah "+circle.hitungluas());
        System.out.println("Luas persegi dengan alas "+triangle.alas+" dan tinggi "+triangle.tinggi+" adalah "+triangle.hitungluas());
    }
}
