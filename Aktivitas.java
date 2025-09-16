package Model;


import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Aktivitas {
    
    public String nama;
    public LocalDate tenggat;
    public String status;

    public Aktivitas(String nama, LocalDate tenggat) {
        this.nama = nama;
        this.tenggat = tenggat;
        this.status = "Belum selesai"; 
    }
}

  