/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tuan_7_8;

import java.util.ArrayList;

public class Tuan_7_8{

    public static void main(String[] args) {
        ArrayList<Sach> danhSachSach;
        danhSachSach = new ArrayList<>();
        
        Sach Toan = new Sach();
        Toan.maSach = "001";
        Toan.tieuDe = "Giai Tich";
        Toan.tacGia = "Tran Duc Minh";
        Toan.namXuatBan = 2025;
        Toan.soLuong = 5;
        danhSachSach.add(Toan);
        
        Sach Ly = new Sach();
        Ly.maSach = "002";
        Ly.tieuDe = "Vat Ly Co Quang";
        Ly.tacGia = "Nguyen Ngoc Khanh Han";
        Ly.namXuatBan = 2024;
        Ly.soLuong = 6;
        danhSachSach.add(Ly);
        
        Sach Hoa = new Sach();
        Hoa.maSach = "003";
        Hoa.tieuDe = "Hoa Hoc Luong Tu";
        Hoa.tacGia = "Nguyen Nhu Ngoc";
        Hoa.namXuatBan = 2023;
        Hoa.soLuong = 2;
        danhSachSach.add(Hoa);
        
        Sach TiengAnh = new Sach("004", "Tieng Anh Co Ban", "Mr. Beast", 2022, 9);
        danhSachSach.add(TiengAnh);
        
        System.out.println("--- DANH SACH CAC CUON SACH ---");
        for (int i = 0; i <= danhSachSach.size() - 1; i++)
        {
            danhSachSach.get(i).hienThiThongTin();
        }
    }
}
