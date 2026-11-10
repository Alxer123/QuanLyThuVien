/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuan_7_8;


public class Sach {
    public String maSach;
    public String tieuDe;
    public String tacGia;
    public int namXuatBan;
    public int soLuong;
    
    public Sach() 
    {
        
    }
    
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong)
    {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    
    public void hienThiThongTin()
    {
        System.out.println("Ma sach: " + maSach + " | Tieu de: " + tieuDe + " | Tac gia: " + tacGia + " | Nam XB: " + namXuatBan + " | Sa luong: " + soLuong);
    }
    
}
