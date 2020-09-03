public class NhanVieinPartTime extends NhanVien {
    public int soGioLamViec;
    public float luongPartTime = 100000;

    public NhanVieinPartTime(){}

    public NhanVieinPartTime(int id, String name, int age, String phoneNumber , String email,int soGioLamViec, float luongPartTime){

        super(id, name, age, phoneNumber, email);
        this.luongPartTime = luongPartTime;
        this.soGioLamViec = soGioLamViec;
    }
    public float tinhLuong(){
        return (soGioLamViec * luongPartTime);
    }


}
