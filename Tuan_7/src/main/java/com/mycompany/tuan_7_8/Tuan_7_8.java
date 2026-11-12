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
        // Sử dụng Setter thay vì gán trực tiếp do thuộc tính đã chuyển thành private
        Toan.SetMaSach("001");
        Toan.SetTieuDe("Giai Tich");
        Toan.SetTacGia("Tran Duc Minh");
        Toan.SetNamXuatBan(2025);
        Toan.SetSoLuong(5);
        danhSachSach.add(Toan);
        
        Sach Ly = new Sach();
        Ly.SetMaSach("002");
        Ly.SetTieuDe("Vat Ly Co Quang");
        Ly.SetTacGia("Nguyen Ngoc Khanh Han");
        Ly.SetNamXuatBan(2024);
        Ly.SetSoLuong(6);
        danhSachSach.add(Ly);
        
        Sach Hoa = new Sach();
        Hoa.SetMaSach("003");
        Hoa.SetTieuDe("Hoa Hoc Luong Tu");
        Hoa.SetTacGia("Nguyen Nhu Ngoc");
        Hoa.SetNamXuatBan(2023);
        Hoa.SetSoLuong(2);
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
