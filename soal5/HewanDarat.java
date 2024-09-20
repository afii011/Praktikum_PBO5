/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal5;

/**
 *
 * @author afifa
 */
public class HewanDarat extends Hewan{
    String tinggal;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tinggal di : " + tinggal);
    }
}
