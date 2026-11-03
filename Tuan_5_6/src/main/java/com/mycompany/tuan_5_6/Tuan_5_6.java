package com.mycompany.tuan_5_6;

import java.util.Scanner;
import java.time.Year;

public class Tuan_5_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int luaChon;
        int namHienTai = Year.now().getValue();
        
        int tongSoLuong = 0;
        double tongGiaTri = 0;
        
        String maSach = "", tenSach = "", tacGia = "", loaiSach = "";
        int namXuatBan = 0, soLuong = 0;
        double donGia = 0, thanhTien = 0, phiVanChuyen = 0, tongTienNhap = 0;
        String phanLoaiGia = "", phanLoaiTonKho = "";

        // Bai 3: Menu lap den khi chon thoat
        do {
            System.out.println("\n========== MENU QUAN LY THU VIEN ==========");
            System.out.println("1. Nhap n sach");
            System.out.println("2. In ra tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon chuc nang (0-3): ");
            
            luaChon = Integer.parseInt(sc.nextLine());

            switch (luaChon) {
                case 1:
                    // Bai 1: Nhap n sach bang vong lap
                    System.out.print("Nhap so luong sach can them (n): ");
                    int n = Integer.parseInt(sc.nextLine());
                    
                    tongSoLuong = 0;
                    tongGiaTri = 0;
                    
                    for (int i = 1; i <= n; i++) {
                        System.out.println("\n--- Nhap thong tin sach thu " + i + " ---");
                        System.out.print("Nhap ma sach: ");
                        maSach = sc.nextLine();
                        
                        System.out.print("Nhap ten sach: ");
                        tenSach = sc.nextLine();
                        
                        System.out.print("Nhap tac gia: ");
                        tacGia = sc.nextLine();
                        
                        System.out.println("Chon loai sach:");
                        System.out.println("1. Sach giao khoa");
                        System.out.println("2. Sach tham khao");
                        System.out.println("3. Sach chuyen nganh");
                        System.out.println("4. Sach khac");
                        System.out.print("Nhap lua chon (1-4): ");
                        int chonLoai = Integer.parseInt(sc.nextLine());
                        
                        switch (chonLoai) {
                            case 1: loaiSach = "Sach giao khoa"; break;
                            case 2: loaiSach = "Sach tham khao"; break;
                            case 3: loaiSach = "Sach chuyen nganh"; break;
                            case 4: loaiSach = "Sach khac"; break;
                            default: loaiSach = "Khong xac dinh"; break;
                        }
                        
                        System.out.print("Nhap nam xuat ban: ");
                        namXuatBan = Integer.parseInt(sc.nextLine());
                        
                        System.out.print("Nhap don gia: ");
                        donGia = Double.parseDouble(sc.nextLine());
                        
                        System.out.print("Nhap so luong: ");
                        soLuong = Integer.parseInt(sc.nextLine());

                        // Tinh toan chi phi
                        thanhTien = donGia * soLuong;
                        phiVanChuyen = thanhTien * 0.05;
                        tongTienNhap = thanhTien + phiVanChuyen;

                        // Phan loai gia
                        if (donGia < 50000) phanLoaiGia = "Sach gia thap";
                        else if (donGia <= 100000) phanLoaiGia = "Sach gia trung binh";
                        else if (donGia <= 200000) phanLoaiGia = "Sach gia cao";
                        else phanLoaiGia = "Sach gia dac biet";

                        // Phan loai ton kho
                        if (soLuong == 0) phanLoaiTonKho = "Het sach";
                        else if (soLuong <= 5) phanLoaiTonKho = "Sap het";
                        else if (soLuong <= 20) phanLoaiTonKho = "Con it";
                        else phanLoaiTonKho = "Con nhieu";
                        
                        // Bai 2: Cong don tong
                        tongSoLuong += soLuong;
                        tongGiaTri += thanhTien;
                    }
                    System.out.println("Da nhap xong!");
                    break;

                case 2:
                    // Bai 2: Tinh tong so luong va tong gia tri sach
                    if (tongSoLuong == 0) {
                        System.out.println("Chua co du lieu sach!");
                    } else {
                        System.out.println("=> Tong so luong toan bo sach da nhap: " + tongSoLuong);
                        System.out.println("=> Tong gia tri toan bo sach (Thanh tien): " + tongGiaTri);
                    }
                    break;

                case 3:
                    // Bai 4: Tim sach theo ma va hien thi chi tiet
                    System.out.print("Nhap ma sach can tim: ");
                    String maTimKiem = sc.nextLine();
                    
                    if (maSach.equals("")) {
                        System.out.println("Chua co du lieu sach!");
                    } else if (maSach.equalsIgnoreCase(maTimKiem)) {
                        System.out.println("\n--- DA TIM THAY SACH ---");
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
                    } else {
                        System.out.println("Khong tim thay!");
                    }
                    break;

                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (luaChon != 0);
        
        sc.close();
    }
}