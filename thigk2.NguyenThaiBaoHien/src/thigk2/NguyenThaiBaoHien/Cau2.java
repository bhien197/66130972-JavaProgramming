package thigk2.NguyenThaiBaoHien;
import java.util.*;

public class Cau2 {
	/*
    - Tao danh sach sinh vien
    - Hard-code 3 sinh vien
    - Nhap them 1 sinh vien
    - In danh sach
    - Loc sinh vien > 20 tuoi
   */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> ds = new ArrayList<>();

        // 3 sinh vien ban dau
        ds.add(new SinhVien("SV01", "A", 2003, 8));
        ds.add(new SinhVien("SV02", "B", 2002, 7));
        ds.add(new SinhVien("SV03", "C", 2005, 9));

        System.out.println("Danh sach ban dau:");
        for (SinhVien sv : ds) {
            sv.hienThi();
        }

        sc.nextLine();

        // Nhap them
        System.out.print("Nhap ma: ");
        String ma = sc.nextLine();

        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();

        System.out.print("Nhap nam sinh: ");
        int ns = sc.nextInt();

        System.out.print("Nhap diem: ");
        double d = sc.nextDouble();

        ds.add(new SinhVien(ma, ten, ns, d));

        System.out.println("Sau khi them:");
        for (SinhVien sv : ds) {
            sv.hienThi();
        }

        int nam = 2026;
        System.out.println("Sinh vien > 20 tuoi:");
        for (SinhVien sv : ds) {
            if (nam - sv.getNamSinh() > 20) {
                sv.hienThi();
            }
        }

        sc.close();
    }
}
