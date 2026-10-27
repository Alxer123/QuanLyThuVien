/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quanlythuvien;

import java.util.Scanner;
/**
 *
 * @author Alxer
 */
public class QuanLyThuVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- NHAP THONG TIN SACH ---");
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();
        
        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();
        
        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        
        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = sc.nextInt();
        
        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();
        
        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();

        double thanhTien = donGia * soLuong;

        double phiVanChuyen = thanhTien * 0.05;

        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n--- KET QUA TINH TOAN NHAP KHO ---");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Thanh tien: " + thanhTien);
        System.out.println("Phi van chuyen: " + phiVanChuyen);
        System.out.println("Tong tien nhap: " + tongTienNhap);
    }
}
