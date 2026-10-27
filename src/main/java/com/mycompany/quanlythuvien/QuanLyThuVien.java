package com.mycompany.quanlythuvien;

import java.util.Scanner;
import java.time.Year;

public class QuanLyThuVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int namHienTai = Year.now().getValue();

        System.out.println("--- NHAP THONG TIN SACH ---");
        System.out.print("Nhap ma sach: ");
        String maSach = sc.nextLine();
        
        System.out.print("Nhap ten sach: ");
        String tenSach = sc.nextLine();
        
        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        
        String loaiSach = "";
        System.out.println("Chon loai sach:");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap lua chon (1-4): ");
        int chonLoai = sc.nextInt();
        
        switch (chonLoai) {
            case 1:
                loaiSach = "Sach giao khoa";
                break;
            case 2:
                loaiSach = "Sach tham khao";
                break;
            case 3:
                loaiSach = "Sach chuyen nganh";
                break;
            case 4:
                loaiSach = "Sach khac";
                break;
            default:
                loaiSach = "Khong xac dinh"; // Neu nhap sai 1-4 se vao day
                break;
        }
        
        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = sc.nextInt();
        
        System.out.print("Nhap don gia: ");
        double donGia = sc.nextDouble();
        
        System.out.print("Nhap so luong: ");
        int soLuong = sc.nextInt();

        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        // Gia sach thuoc muc nao?
        String phanLoaiGia;
        if (donGia < 50000) {
            phanLoaiGia = "Sach gia thap";
        } else if (donGia <= 100000) {
            phanLoaiGia = "Sach gia trung binh";
        } else if (donGia <= 200000) {
            phanLoaiGia = "Sach gia cao";
        } else {
            phanLoaiGia = "Sach gia dac biet";
        }

        // So luong con nhieu hay it
        String phanLoaiTonKho;
        if (soLuong == 0) {
            phanLoaiTonKho = "Het sach";
        } else if (soLuong <= 5) {
            phanLoaiTonKho = "Sap het";
        } else if (soLuong <= 20) {
            phanLoaiTonKho = "Con it";
        } else {
            phanLoaiTonKho = "Con nhieu";
        }

        // Hien thi thong tin
        System.out.println("\n--- KET QUA QUAN LY SACH ---");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Loai sach: " + loaiSach);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia + " (" + phanLoaiGia + ")");
        System.out.println("So luong: " + soLuong + " (" + phanLoaiTonKho + ")");
        System.out.println("Thanh tien: " + thanhTien);
        System.out.println("Phi van chuyen: " + phiVanChuyen);
        System.out.println("Tong tien nhap: " + tongTienNhap);
    }
}