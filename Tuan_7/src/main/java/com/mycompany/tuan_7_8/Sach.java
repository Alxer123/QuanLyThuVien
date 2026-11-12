/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuan_7_8;

import java.time.Year;

public class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    
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
        System.out.println("Ma sach: " + maSach + " | Tieu de: " + tieuDe + " | Tac gia: " + tacGia + " | Nam XB: " + namXuatBan + " | So luong: " + soLuong);
    }
    
    public String GetMaSach()
    {
        return maSach;
    }
    
    public void SetMaSach(String maSach)
    {
        this.maSach = maSach;
    }
    
    public String GetTieuDe() {
        return tieuDe;
    }

    public void SetTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String GetTacGia() {
        return tacGia;
    }

    public void SetTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int GetNamXuatBan() {
        return namXuatBan;
    }
    
    public void SetNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue();
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Lỗi: Năm xuất bản không hợp lệ!");
        }
    }
    
    public int GetSoLuong() {
        return soLuong;
    }

    public void SetSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Lỗi: Số lượng không được âm!");
        }
    }
 
}
