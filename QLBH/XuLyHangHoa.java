package QLBH;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class XuLyHangHoa {
    ArrayList<HangHoa> list = new ArrayList<>();
    public static final String fname = "HangHoa.DAT";

    public void nhap() throws IOException {
        System.out.println("Nhap so hang hoa: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i<n;++i){
            HangHoa hh = new HangHoa();
            hh.Nhap();
            list.add(hh);
        }
        ghiF();
    }
    public void ghiF() throws FileNotFoundException, IOException {
        File df = new File();
        df.ghiFile(list, fname);
        System.out.println("\nGhi File thành công.");
    }

    public ArrayList<HangHoa> docF() throws FileNotFoundException, IOException, ClassNotFoundException {
        File dg = new File();
        return dg.docFile(fname);
    }

    public void hien() throws IOException, ClassNotFoundException {
        list = docF();
        for(HangHoa hh : list) {
            hh.Hien();
        }
    }
    
    public float tongTien(){
        float tongTien=0;
        for(HangHoa x: list){
            tongTien+=x.tinhTien();
        }
        return tongTien;
    }
    public void themHH(){
        HangHoa x= new HangHoa();
        x.Nhap();
        list.add(x);
    }
    public void xoaHH(){
        String s;
        System.out.println("Nhap ma hang hoa can xoa: ");
        s= new Scanner (System.in).nextLine();
        for(HangHoa x: list){
            if(x.getMaHH().equals(s)){
                list.remove(x);
            }
            else{
                System.out.println("Khong tim thay ma hang hoa vua nhap !");
            }
        }
        
    }
    public void timHH(){
        String s;
        System.out.println("\nNhap ma hang hoa can tim: ");
        s= new Scanner(System.in).nextLine();
        for(HangHoa x: list){
            if(x.getMaHH().equals(s)){
                x.Hien();
            }else{
                System.out.println("Khong tim thay ma hang hoa vua nhap !");
            }
        }
    }
}
