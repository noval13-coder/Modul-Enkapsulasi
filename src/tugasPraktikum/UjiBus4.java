/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum;

/**
 *
 * @author ASUS
 */
public class UjiBus4 {
    public static void main(String[] args) {
    //membuat objek bus dari class Bus4
        Bus4 bus = new Bus4(45);
        bus.cetak();
        
        //penambahan jumlah penumpang
        bus.getPenumpang(81);
        bus.cetak();
        
        //penambahan jumlah penumpang
        bus.getPenumpang(81);
        bus.cetak();
        
        //penambahan jumlah penumpang
        bus.getPenumpang(8);
        bus.cetak();
        
        System.out.println("Rata-rata Jumlah Penumpang Bus = "+bus.getAverage());
    }
   
}
