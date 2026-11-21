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
public class SachThamKhao extends Sach {

    private double thue;

    @Override
    public double tinhThanhTien() {
        return soLuong * donGia + thue;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Nhap tien thue: ");
        thue = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat(); // In thông tin chung từ lớp cha
        System.out.printf(" | Thue: %-5s | Thanh tien: %.2f\n", thue, tinhThanhTien());
    }
}
