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
public class Sach {

    protected String maSach;
    protected String ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public Sach() {

    }

    public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    
    public double tinhThanhTien() {
        return 0;
    }
    
    public void nhap(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ngay nhap (dd/mm/yyyy): ");
        ngayNhap = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
    }

    public void xuat() {
        System.out.printf("Ma: %-8s | Ngay nhap: %-10s | Don gia: %-10.2f | SL: %-4d | NXB: %-15s",
                maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
    }
}
