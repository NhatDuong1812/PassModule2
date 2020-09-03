public class NhanVienFullTime extends NhanVien {
    public float soTienThuong;
    public float soTienPhat;
    public float luongCung;

    public NhanVienFullTime(){}

    public NhanVienFullTime(int id, String name, int age, String phoneNumber , String email,float soTienThuong, float soTienPhat, float luongCung){
        super(id, name, age, phoneNumber, email);
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }

    public float getSoTienPhat() {
        return soTienPhat;
    }

    public void setSoTienPhat(float soTienPhat) {
        this.soTienPhat = soTienPhat;
    }

    public float getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(float luongCung) {
        this.luongCung = luongCung;
    }

    public float getSoTienThuong() {
        return soTienThuong;
    }

    public void setSoTienThuong(float soTienThuong) {
        this.soTienThuong = soTienThuong;
    }
    public float tinhLuong(){
        return(luongCung+ (soTienThuong - soTienPhat));

    }
}

