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
public class Bus4 {
    private double penumpang;
    private double maxPenumpang;
    private double counter;
    
    //konstruktor kelas Bus
    public Bus4(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    //method mutator untuk menambahkan penumpang
    public void addPenumpang (double penumpang){
        double temp ;
        temp = this.penumpang + penumpang;
        if (temp >= maxPenumpang){
            System.out.println("Penumpang Melebihi Kuota");
        }else{
            this.penumpang = temp;
            counter++;
        }
    }
    public void getPenumpang (int password){
        if (password == 81){
            System.out.println("Password Benar");
            addPenumpang(5);
        }else{
            System.out.println("Password salah");
        }
    }
    
    public double getAverage(){
        return penumpang/counter;
    }
    //membuat method untuk menampilkan jumlah
    public void cetak(){
        System.out.println("Penumpang Bus Sekarang adalah = "+penumpang);
        System.out.println("Penumpang Maksimum seharusnya adalah = "+maxPenumpang);
    }
}
