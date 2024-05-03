package QLBH;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class test  {

    
    public static void menu() throws IOException, FileNotFoundException, ClassNotFoundException{
        int chon;
        do {
            System.out.println("\n=======+ CHUONG TRINH QUAN LY KINH DOANH MAY TINH+=======");
            System.out.println("1. Quan ly nhan vien");
            System.out.println("2. Quan ly khach hang");
            System.out.println("3. Quan ly san pham");
            System.out.println("4. Quan ly hoa don");
            System.out.println("0. Thoat");
            System.out.println("Moi ban chon:");
            chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1 -> qlnv();
                case 2 -> qlkh();
                case 3 -> qlhh();
                case 4 -> qlhd();
            }
        }while (chon != 0);
        }
    
    public static void qlkh() throws IOException, FileNotFoundException, ClassNotFoundException{
        XuLyKhachHang kh = new XuLyKhachHang();
                    int chon2;
                    do {
                        System.out.println("\nQUAN LY KHACH HANG");
                        System.out.println("1. Nhap danh sach khach hang");
                        System.out.println("2. Ghi danh sach khach hang vao file");
                        System.out.println("3. Xuat danh sach khach hang tu file");
                        System.out.println("4. Them khach hang");
                        System.out.println("5. Xoa khach hang ra khoi danh sach");
                        System.out.println("6. Tim kiem khach hang theo ma khach hang");
                        System.out.println("7. Quay lai");
                        System.out.println("0. Thoat");
                        System.out.println("Moi ban chon:");
                        chon2 = new Scanner(System.in).nextInt();
                        switch (chon2) {
                            case 1:
                                kh.nhap();
                                break;
                            case 2:
                                kh.ghiF();
                                break;
                            case 3:
                                kh.docF();
                                kh.hien();
                                break;
                            case 4:
                                kh.themKH();
                                break;
                            case 5:
                                kh.xoaKH();
                                break;
                            case 6:
                                kh.timHH();
                                break;
                            case 7:
                                menu();
                                break;
                            case 0:
                            default:
                                break;
                        }
                    } while (chon2 != 0);
                }
    
    public static void qlnv() throws IOException, FileNotFoundException, ClassNotFoundException{
        XuLyNhanVien nv = new XuLyNhanVien();
                    int chon1;
                    do {
                        System.out.println("\nQUAN LY NHAN VIEN");
                        System.out.println("1. Nhap danh sach nhan vien");
                        System.out.println("2. Ghi danh sach nhan vien vao file");
                        System.out.println("3. Xuat danh sach nhan vien tu file");
                        System.out.println("4. Them nhan vien");
                        System.out.println("5. Xoa nhan vien theo ma nhan vien");
                        System.out.println("6. Tim kiem nhan vien theo ma nhan vien");
                        System.out.println("7. Tinh tong luong nhan vien");
                        System.out.println("8. Quay lai");
                        System.out.println("0. Thoat");
                        System.out.println("Moi ban chon:");
                        chon1 = new Scanner(System.in).nextInt();

                        switch (chon1) {
                            case 1:
                                nv.nhap();
                                break;
                            case 2:
                                nv.ghiF();
                                break;
                            case 3:
                                nv.docF();
                                nv.hien();
                                break;
                            case 4:
                                nv.themNV();
                                break;
                            case 5:
                                nv.xoaNV();
                                break;
                            case 6:
                                nv.timNV();
                                break;
                            case 7:
                                System.out.println("Tong luong nhan vien la: " + nv.tongLuong());
                                break;
                            case 8:
                                menu();
                                break;
                            case 0:
                            default:
                                break;
                        }
                    } while (chon1 != 0);
                }
    
    public static void qlhh() throws IOException, ClassNotFoundException{
        XuLyHangHoa hh = new XuLyHangHoa();
                    int chon;
                    do {
                        System.out.println("\nQUAN LY SAN PHAM");
                        System.out.println("1. Nhap danh sach san pham");
                        System.out.println("2. Luu danh sach san pham vao file");
                        System.out.println("3. Xuat danh sach san pham tu file");
                        System.out.println("4. Tim kiem san pham theo ma san pham");
                        System.out.println("5. Them san pham");
                        System.out.println("6. Xoa san pham");
                        System.out.println("7. Tinh tong tien san pham");
                        System.out.println("8. Quay lai");
                        System.out.println("0. Thoat");
                        System.out.println("Moi ban chon:");
                        chon = new Scanner(System.in).nextInt();
                        switch (chon) {
                            case 1:
                                hh.nhap();
                                break;
                            case 2:
                                hh.ghiF();
                                break;
                            case 3:
                                hh.docF();
                                hh.hien();
                                break;
                            case 4:
                                hh.timHH();
                                break;
                            case 5:
                                hh.themHH();
                                break;
                            case 6:
                                hh.xoaHH();
                                break;
                            case 7:
                                System.out.println("Tong tien san pham la: " + hh.tongTien());
                                break;
                            case 8:
                                menu();
                                break;
                            case 0:
                            default:
                                break;
                        }
                    } while (chon != 0);
                }
    
    public static void qlhd() throws IOException, FileNotFoundException, ClassNotFoundException{
        XuLyHoaDon hd = new XuLyHoaDon();
                    int chon;
                    do {
                        System.out.println("\nQUAN LY HOA DON");
                        System.out.println("1. Nhap danh sach hoa don");
                        System.out.println("2. Luu danh sach hoa don vao file");
                        System.out.println("3. Xuat danh sach hoa don tu file");
                        System.out.println("4. Them hoa don");
                        System.out.println("5. Xoa hoa don");
                        System.out.println("6. Tim hoa don");
                        System.out.println("7. Quay lai");
                        System.out.println("0. Thoat");
                        System.out.println("Moi ban chon:");
                        chon = new Scanner(System.in).nextInt();
                        switch (chon) {
                            case 1:
                                hd.nhapDSHD();
                                break;
                            case 2:
                                hd.ghiF();
                                break;
                            case 3:
                                hd.docF();
                                hd.hienDSHD();
                                break;
                            case 4:
                                hd.themHD();
                                break;
                            case 5:
                                hd.xoaHD();
                                break;
                            case 6:
                                hd.timHD();
                                break;
                            case 7: 
                                menu();
                                break;
                            case 0:
                            default:
                                break;
                        }
                    } while (chon != 0);
                }

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        menu();
        }
}
