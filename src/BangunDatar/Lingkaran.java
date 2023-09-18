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
public class Lingkaran implements Menghitung {
    public float jariJari;
    
    public Lingkaran(float jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public float hitungluas() {
       if(jariJari %7 == 0) {
           return 22 * this.jariJari * this.jariJari / 7;
       } else {
           return (float) (3.14 * this.jariJari * this.jariJari); 
       }
    }
}
