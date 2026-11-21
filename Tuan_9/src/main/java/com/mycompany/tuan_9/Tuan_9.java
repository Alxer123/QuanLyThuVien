/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tuan_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alxer
 */
public class Tuan_9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Sach> danhSach = new ArrayList<>();

        System.out.print("Nhap tong so luong dau sach can quan ly: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhap thong tin sach thu " + (i + 1) + " ---");
            System.out.print("Chon loai sach (1 - Sach giao khoa, 2 - Sach tham khao): ");
            int loai = Integer.parseInt(sc.nextLine());

            Sach s;
            if (loai == 1) {
                s = new SachGiaoKhoa();
            } else {
                s = new SachThamKhao();
            }
            s.nhap(sc);
            danhSach.add(s);
        }

        System.out.println("\n================ DANH SACH SACH TRONG THU VIEN ================");
        for (Sach s : danhSach) {
            s.xuat();
        }

        double tongTienSGK = 0;
        double tongTienSTK = 0;
        double tongDonGiaSTK = 0;
        int demSTK = 0;

        for (Sach s : danhSach) {
            if (s instanceof SachGiaoKhoa) {
                tongTienSGK += s.tinhThanhTien();
            } else if (s instanceof SachThamKhao) {
                tongTienSTK += s.tinhThanhTien();
                tongDonGiaSTK += s.getDonGia();
                demSTK++;
            }
        }

        System.out.println("\n================ THONG KE ================");
        System.out.printf("Tong thanh tien Sach giao khoa: %.2f\n", tongTienSGK);
        System.out.printf("Tong thanh tien Sach tham khao: %.2f\n", tongTienSTK);

        if (demSTK > 0) {
            System.out.printf("Trung binh cong don gia sach tham khao: %.2f\n", (tongDonGiaSTK / demSTK));
        } else {
            System.out.println("Khong co sach tham khao nao trong danh sach.");
        }
        
        System.out.print("\nNhap ten nha xuat ban X can tim (doi voi SGK): ");
        String nxbCanTim = sc.nextLine().trim();
        
        System.out.println("--- Danh sach Sach giao khoa cua NXB \"" + nxbCanTim + "\" ---");
        boolean timThay = false;
        for (Sach s : danhSach) {
            if (s instanceof SachGiaoKhoa && s.getNhaXuatBan().equalsIgnoreCase(nxbCanTim)) {
                s.xuat();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay sach giao khoa nao cua nha xuat ban nay.");
        }
    }
}
