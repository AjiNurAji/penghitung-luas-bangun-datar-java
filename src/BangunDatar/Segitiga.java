/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

import Interfaces.Menghitung;

/**
 *
 * @author lenovo
 */
public class Segitiga implements Menghitung {
    public float alas, tinggi;
    
    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public float hitungluas() {
        return (float) 0.5 * this.alas * this.tinggi;
    }
}
