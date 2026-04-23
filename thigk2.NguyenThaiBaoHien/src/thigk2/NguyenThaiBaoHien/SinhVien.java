package thigk2.NguyenThaiBaoHien;

public class SinhVien {
	private String maSV;
    private String hoTen;
    private int namSinh;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, int namSinh, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diem = diem;
    }

    public String getMaSV() { return maSV; }
    public void setMaSV(String maSV) { this.maSV = maSV; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public int getNamSinh() { return namSinh; }
    public void setNamSinh(int namSinh) { this.namSinh = namSinh; }

    public double getDiem() { return diem; }
    public void setDiem(double diem) { this.diem = diem; }

    public void hienThi() {
        System.out.println(maSV + " - " + hoTen + " - " + namSinh + " - " + diem);
    }
}
