package thigk2.NguyenThaiBaoHien;
import java.util.Scanner;
public class Cau1 {
	/*
	Cau 1:
	- Nhap chieu cao, can nang tu ban phim
	- Tinh chi so BMI = canNang / (chieuCao^2)
	- Dua ra tinh trang co the:
	    + <18.5: Gay
	    + 18.5-24.9: Binh thuong
	    + 25-29.9: Thua can
	    + >=30: Beo phi
	*/
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       double chieuCao;
       double canNang;
       double bmi;

       System.out.print("Nhap chieu cao (m): ");
       chieuCao = sc.nextDouble();

       System.out.print("Nhap can nang (kg): ");
       canNang = sc.nextDouble();

       bmi = canNang / (chieuCao * chieuCao);

       System.out.println("BMI = " + bmi);

       if (bmi < 18.5) {
           System.out.println("Gay");
       } else if (bmi < 25) {
           System.out.println("Binh thuong");
       } else if (bmi < 30) {
           System.out.println("Thua can");
       } else {
           System.out.println("Beo phi");
       }

       sc.close();
   }
}

