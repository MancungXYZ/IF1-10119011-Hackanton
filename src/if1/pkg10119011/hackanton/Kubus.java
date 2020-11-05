/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.hackanton;

/**
 *
 * @author Reihan Wiyanda
 */
public class Kubus {
    public int panjangSisi;
    public int volume;
    public int massa;
    public int massaJenis;
    
    public int Sisi(int panjangSisi) {
        panjangSisi = 5;
        return panjangSisi;
    }
   
    public int menghitungVolume (int volume, int panjangSisi) {
        
        volume = panjangSisi * panjangSisi * panjangSisi;
        return volume;
    }
    public int menghitungMassaJenis (int massaJenis, int massa, int volume) {
        massa = 250;
        massaJenis = (massa / volume );
        return massaJenis;
    }
}
