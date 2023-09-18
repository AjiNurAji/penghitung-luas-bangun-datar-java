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
public class Persegi implements Menghitung {
    public float sisi;
    
    public Persegi(float sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public float hitungluas() {
       return this.sisi * this.sisi;
    }
}
