public class CongTy {
    private String tenCongTy;
    private int soNhanVien;
    public static final int SO_NV_MAX = 100;
    private NhanVien[] dsNhanVien;
    private double loiNhuan;
    
    public CongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
        this.soNhanVien = 0;
        this.dsNhanVien = new NhanVien[SO_NV_MAX];
        this.loiNhuan = 0;
    }
    
    public void inThongTin() {
        System.out.println("Thong tin cong ty:");
        System.out.println("Ten cong ty: " + tenCongTy);
        System.out.println("So nhan vien: " + soNhanVien);
        
        System.out.println("\nDanh sach nhan vien:");
        for (int i = 0; i < soNhanVien; i++) {
            dsNhanVien[i].inThongTin();
        }
    }
    
    public void setLoiNhuan(double loiNhuan) {
        this.loiNhuan = loiNhuan;
    }
    
    public double getLoiNhuan() {
        return loiNhuan;
    }
    
    public boolean themNV(NhanVien nv) {
        if (soNhanVien < SO_NV_MAX) {
            dsNhanVien[soNhanVien] = nv;
            soNhanVien++;
            return true;
        }
        return false;
    }
    
    public double tinhTongLuong() {
        double tongLuong = 0;
        for (int i = 0; i < soNhanVien; i++) {
            tongLuong += dsNhanVien[i].tinhLuong();
        }
        return tongLuong;
    }
}