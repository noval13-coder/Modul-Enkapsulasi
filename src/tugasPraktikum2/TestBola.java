/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum2;

/**
 *
 * @author ASUS
 */
public class TestBola {
    public static void main(String[] args) {
    double jariJari = 21;
    Bola bola = new Bola (7);
    bola.showDiameter();
    bola.showLuasPermukaan();
    bola.showVolume();
        System.out.println("\n\n");
        
        //manipulasi dengan variabel jari-jari yang telah dibuat
        bola.setJariJari(jariJari);
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
    }
    
}
