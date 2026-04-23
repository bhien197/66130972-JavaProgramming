package thigk2.NguyenThaiBaoHien;
import java.util.ArrayList;
import java.util.Scanner;

public class Cau3 {
	 /*
     * Doc file chua cac so nguyen
     * In danh sach so ra man hinh
     * Kiem tra gia tri X co trong danh sach hay khong
     */

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        ArrayList<Integer> ds = new ArrayList<>();

        while (sc.hasNextInt()) {
            ds.add(sc.nextInt());
        }

        sc.close();

        System.out.println("Danh sach so nguyen:");
        for (int x : ds) {
            System.out.println(x);
        }

        int X = 2; // so cuoi cua MSSV 

        if (ds.contains(X)) {
            System.out.println("Co " + X + " trong danh sach");
        } else {
            System.out.println("Khong co " + X + " trong danh sach");
        }
    }
}

