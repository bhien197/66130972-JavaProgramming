import java.util.Scanner;

public class DoiNhietDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap nhiet do C:");
		double C = sc.nextDouble();
		double K = C + 273.15;
		System.out.print("Nhiet do K la:" + K);
		sc.close();
	}

}