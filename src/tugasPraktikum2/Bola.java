/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum2;

import java.lang.Math;
public class Bola {

    private double jariJari;
    
    public Bola(double jariJari){
        this.jariJari = jariJari;
    }
    
    public void setJariJari (double jariJari){
        this.jariJari = jariJari;
    }
    
    //method untuk menampilkan diameter 
    public void showDiameter(){
        double diameter = this.jariJari*2;
        System.out.println("Diameter Bola = "+diameter);
    }
    
     //method untuk menampilkan Luas
    public void showLuasPermukaan(){
        double luas = 4*Math.PI*Math.pow(jariJari,2);
        System.out.println("Luas Permukaan Bola = "+luas);
    }
    
    //method untuk menampilkan keliling
    public void showVolume(){
        double volume = (4*Math.PI*Math.pow(jariJari, 2))/3;
        System.out.println("volume Bola = "+volume);
    }
    
   
}
