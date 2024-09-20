/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal5;

/**
 *
 * @author afifa
 */
public class Main {
    public static void main (String[] args) {
        Kucing Louis = new Kucing();
        Louis.nama = "Louis Simanjuntak";
        Louis.jenis = "Persia";
        Louis.suara = "Meoww";
        Louis.tinggal = "Darat";
        
        Anjing Bam = new Anjing ();
        Bam.nama = "Jeon Bam";
        Bam.jenis = "Dobberman";
        Bam.suara = "Barkk";
        Bam.tinggal = "Darat";
        
        Louis.tampilkanInfo();
        Bam.tampilkanInfo();
    }
}
