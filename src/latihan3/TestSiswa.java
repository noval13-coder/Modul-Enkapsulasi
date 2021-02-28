/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author ASUS
 */
public class TestSiswa {
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setNama("Noval Akbar Ramadhany");
        siswa.setAbsen(28);
        siswa.setAlamat("Blitar");
        
        System.out.println("Nama : "+siswa.getNama()+", Absem : "+siswa.getAbsen()
        +", Alamat : "+siswa.getAlamat());
    }
}
