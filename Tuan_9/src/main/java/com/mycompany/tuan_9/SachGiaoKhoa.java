/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuan_9;

import java.util.Scanner;

/**
 *
 * @author Alxer
 */
public class SachGiaoKhoa extends Sach {

    private String tinhTrang;

    public SachGiaoKhoa() {
        super();
    }

    public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    @Override
    public double tinhThanhTien() {
        if (tinhTrang.equalsIgnoreCase("moi")) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * 0.5;
        }
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap tinh trang (moi / cu): ");
        tinhTrang = sc.nextLine().trim();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf(" | Tinh trang: %-5s | Thanh tien: %.2f\n", tinhTrang, tinhThanhTien());
    }
}
