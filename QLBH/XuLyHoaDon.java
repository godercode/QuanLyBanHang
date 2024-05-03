package QLBH;

import static QLBH.XuLyNhanVien.fname;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class XuLyHoaDon implements Serializable {
    
    ArrayList<HoaDon> list = new ArrayList<>();
    public static final String fname = "HoaDon.DAT";
    
    public void nhapDSHD() throws IOException, FileNotFoundException, ClassNotFoundException {
        int n;
        System.out.println("\nNhap so luong hoa don: ");
        n = new Scanner(System.in).nextInt();
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            HoaDon x = new HoaDon();
            x.Nhap();
            list.add(x);
        }
        ghiF();
    }

    public void themHD() {
        HoaDon x = new HoaDon();
        System.out.println("\nThem hoa don");
        x.Nhap();
        list.add(x);
    }

    public void timHD() throws IOException, FileNotFoundException, ClassNotFoundException {
        list = docF();
        String a;
        System.out.println("\nNhap ma hoa don can tim");
        a= new Scanner(System.in).nextLine();
        for (HoaDon x : list) {
            if (x.getMaHD().equals(a)) {
                x.Hien();
            }
        }
    }
    
    public void xoaHD() {
        String s;
        boolean a = false;
        System.out.println("Nhap ma hoa don can xoa: ");
        s= new Scanner(System.in).nextLine();
        for (HoaDon x : list) {
            if (x.getMaHD().equals(s)) {
                list.remove(x);
                a = true;
                break;
            }
        }
        if (a == false) System.out.println("Khong tim thay ma hoa don vua nhap: ");
    }

    public void hienDSHD() throws IOException, ClassNotFoundException {
        for (HoaDon x : list) {
            x.Hien();
        }
    }

    public void ghiF() throws FileNotFoundException, IOException {
        File df = new File();
        df.ghiFile(list, fname);
        System.out.println("\nGhi File thành công.");
    }

    public ArrayList<HoaDon> docF() throws FileNotFoundException, IOException, ClassNotFoundException {
        File dg = new File();
        return dg.docFile(fname);
    }
}