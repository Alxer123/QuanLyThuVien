package com.mycompany.tuan_5_6;

import java.util.Scanner;
import java.util.ArrayList;

public class Tuan_5_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;

        // Bài 1: Mảng cơ bản (Mảng số lượng 5 cuốn sách)
        int[] soLuong = new int[5];

        // Bài 2 & Bài 3: Sử dụng ArrayList để lưu trữ mã sách và toàn bộ thông tin sách
        ArrayList<String> maSachList = new ArrayList<>();
        ArrayList<String> danhSachSach = new ArrayList<>();

        int tongSoLuong = 0;
        double tongGiaTri = 0;

        // Bài 4: Xây dựng menu hoàn chỉnh
        do {
            System.out.println("\n========== MENU QUAN LY THU VIEN ==========");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon chuc nang (0-8): ");

            luaChon = Integer.parseInt(sc.nextLine());

            switch (luaChon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String maSach = sc.nextLine();

                    System.out.print("Nhap ten sach: ");
                    String tenSach = sc.nextLine();

                    System.out.print("Nhap tac gia: ");
                    String tacGia = sc.nextLine();

                    System.out.println("Chon loai sach:");
                    System.out.println("1. Sach giao khoa");
                    System.out.println("2. Sach tham khao");
                    System.out.println("3. Sach chuyen nganh");
                    System.out.println("4. Sach khac");
                    System.out.print("Nhap lua chon (1-4): ");
                    int chonLoai = Integer.parseInt(sc.nextLine());
                    String loaiSach = "";
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
                            loaiSach = "Khong xac dinh";
                            break;
                    }

                    System.out.print("Nhap nam xuat ban: ");
                    int namXuatBan = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhap don gia: ");
                    double donGia = Double.parseDouble(sc.nextLine());

                    System.out.print("Nhap so luong: ");
                    int soLuongNhap = Integer.parseInt(sc.nextLine());

                    // Tính toán chi phí
                    double thanhTien = donGia * soLuongNhap;
                    double phiVanChuyen = thanhTien * 0.05;
                    double tongTienNhap = thanhTien + phiVanChuyen;

                    // Phân loại
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

                    String phanLoaiTonKho;
                    if (soLuongNhap == 0) {
                        phanLoaiTonKho = "Het sach";
                    } else if (soLuongNhap <= 5) {
                        phanLoaiTonKho = "Sap het";
                    } else if (soLuongNhap <= 20) {
                        phanLoaiTonKho = "Con it";
                    } else {
                        phanLoaiTonKho = "Con nhieu";
                    }

                    String thongTinSach = "Ma: " + maSach + " | Ten: " + tenSach + " | Tac gia: " + tacGia + " | Loai: " + loaiSach
                            + " | Nam XB: " + namXuatBan + " | Don gia: " + donGia + " (" + phanLoaiGia + ")"
                            + " | SL: " + soLuongNhap + " (" + phanLoaiTonKho + ")" + " | Thanh tien: " + thanhTien
                            + " | Phi VC: " + phiVanChuyen + " | Tong nhap: " + tongTienNhap;

                    maSachList.add(maSach);
                    danhSachSach.add(thongTinSach);

                    tongSoLuong += soLuongNhap;
                    tongGiaTri += thanhTien;

                    System.out.println("Them sach thanh cong!");
                    break;

                case 2:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach trong!");
                    } else {
                        System.out.println("\n--- DANH SACH CAC CUON SACH ---");
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.println((i + 1) + ". " + danhSachSach.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTimKiem = sc.nextLine();
                    boolean timThay = false;

                    for (int i = 0; i < maSachList.size(); i++) {
                        if (maSachList.get(i).equalsIgnoreCase(maTimKiem)) {
                            System.out.println("\n--- DA TIM THAY SACH ---");
                            System.out.println(danhSachSach.get(i));
                            timThay = true;
                            break;
                        }
                    }
                    if (!timThay) {
                        System.out.println("Khong tim thay sach co ma: " + maTimKiem);
                    }
                    break;

                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    boolean xoaThanhCong = false;

                    for (int i = 0; i < maSachList.size(); i++) {
                        if (maSachList.get(i).equalsIgnoreCase(maXoa)) {
                            String[] cacThanhPhan = danhSachSach.get(i).split("\\|");

                            String slChuoi = cacThanhPhan[6].split(":")[1].trim().split(" ")[0];
                            int slXoa = Integer.parseInt(slChuoi);

                            String tienChuoi = cacThanhPhan[7].split(":")[1].trim();
                            double tienXoa = Double.parseDouble(tienChuoi);

                            tongSoLuong -= slXoa;
                            tongGiaTri -= tienXoa;

                            maSachList.remove(i);
                            danhSachSach.remove(i);
                            System.out.println("Da xoa cuon sach co ma " + maXoa);
                            xoaThanhCong = true;
                            break;
                        }
                    }
                    if (!xoaThanhCong) {
                        System.out.println("Khong tim thay ma sach de xoa!");
                    }
                    break;

                case 5:
                    System.out.print("Nhap ma sach can sua so luong: ");
                    String maSua = sc.nextLine();
                    boolean suaThanhCong = false;

                    for (int i = 0; i < maSachList.size(); i++) {
                        if (maSachList.get(i).equalsIgnoreCase(maSua)) {
                            System.out.println("Thong tin hien tai: " + danhSachSach.get(i));
                            System.out.println("Luu y: Voi cach luu tru chuoi thuan tuy, viec cap nhat se can nhap lai thong tin.");
                            System.out.println("Chuc nang sua chuoi phuc tap se duoc ap dung khi hoc den Class (Huong doi tuong).");
                            suaThanhCong = true;
                            break;
                        }
                    }
                    if (!suaThanhCong) {
                        System.out.println("Khong tim thay ma sach de sua!");
                    }
                    break;

                case 6:
                    System.out.println("=> Tong so luong toan bo sach: " + tongSoLuong);
                    break;

                case 7:
                    System.out.println("=> Tong gia tri toan bo sach (Thanh tien): " + tongGiaTri);
                    break;

            }
        } while (luaChon != 0);
    }
}
