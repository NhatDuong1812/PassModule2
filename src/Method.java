
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Method {
    static List<NhanVien> nhanViens = new ArrayList<>();
    static List<NhanVieinPartTime> nhanVieinPartTimeList = new ArrayList<>();
    static List<NhanVienFullTime> nhanVienFullTimeList = new ArrayList<>();
    NhanVieinPartTime nvpt = new NhanVieinPartTime();
    NhanVienFullTime nvft = new NhanVienFullTime();
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String PHONE_REGEX = "^(0|84)?[0-9]{9}$";

    public Method() {
    }

    public static boolean validEmail(String regex) {
        pattern = Pattern.compile("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$");
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static boolean validPhone(String regex) {
        pattern = Pattern.compile("^(0|84)?[0-9]{9}$");
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void show() {
        for(int i = 0; i < nhanViens.size(); ++i) {
            NhanVien c = (NhanVien)nhanViens.get(i);
            System.out.println(c.toString());
        }
    }

    public static void add() {
        Scanner sc = new Scanner(System.in);
        String phoneNumber = "";
        String emailAddress = "";
        System.out.println("Nhập vào thông tin của nhân viên");
        System.out.println("\n Mã ID : ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("\n Tên : ");
        String name = sc.nextLine();
        System.out.println("\n Tuổi : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("\n Phone Number : ");

        do {
            System.out.print("\n Số điện thoại: ");
            phoneNumber = sc.nextLine();
            if (!validPhone(phoneNumber)) {
                System.out.println("\nSố điện thoại không khả dụng. Vui lòng nhập lại");
            }
        } while(!validPhone(phoneNumber));

        do {
            System.out.print("\n Email: ");
            emailAddress = sc.nextLine();
            if (!validEmail(emailAddress)) {
                System.out.println("\nEmail không khả dụng. Vui lòng nhập lại: ");
            }
        } while(!validEmail(emailAddress));

        NhanVien nhanVien = new NhanVien(id, name, age, phoneNumber, emailAddress);
        nhanViens.add(nhanVien);
        System.out.println("Thêm thành công!!");
    }

    public static void tinhLuongNVPT (){
        Scanner sc =new Scanner(System.in);
        String phoneNumber = "";
        String emailAddress = "";
        System.out.println("Nhập vào thông tin của nhân viên");
        System.out.println("\n Mã ID : ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("\n Tên : ");
        String name = sc.nextLine();
        System.out.println("\n Tuổi : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("\n Phone Number : ");

        do {
            System.out.print("\n Số điện thoại: ");
            phoneNumber = sc.nextLine();
            if (!validPhone(phoneNumber)) {
                System.out.println("\nSố điện thoại không khả dụng. Vui lòng nhập lại");
            }
        } while(!validPhone(phoneNumber));

        do {
            System.out.print("\n Email: ");
            emailAddress = sc.nextLine();
            if (!validEmail(emailAddress)) {
                System.out.println("\nEmail không khả dụng. Vui lòng nhập lại: ");
            }
        } while(!validEmail(emailAddress));

        System.out.println("\n Giờ Làm Việc: ");
        int gioLamViec = Integer.parseInt(sc.nextLine());
        System.out.println("\n Luong part time: ");
        float luongPartTime = Float.parseFloat(sc.nextLine());
        NhanVieinPartTime nhanVienpt = new NhanVieinPartTime(id, name, age, phoneNumber, emailAddress,gioLamViec,luongPartTime);
        nhanVieinPartTimeList.add(nhanVienpt);

        nhanVienpt.tinhLuong();
        System.out.println("Tiền Lương của " + nhanVienpt.name + "là " + nhanVienpt.tinhLuong());
    }

    public static void tinhLuongNVFT (){
        Scanner sc =new Scanner(System.in);
        String phoneNumber = "";
        String emailAddress = "";
        System.out.println("Nhập vào thông tin của nhân viên");
        System.out.println("\n Mã ID : ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("\n Tên : ");
        String name = sc.nextLine();
        System.out.println("\n Tuổi : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("\n Phone Number : ");

        do {
            System.out.print("\n Số điện thoại: ");
            phoneNumber = sc.nextLine();
            if (!validPhone(phoneNumber)) {
                System.out.println("\nSố điện thoại không khả dụng. Vui lòng nhập lại");
            }
        } while(!validPhone(phoneNumber));

        do {
            System.out.print("\n Email: ");
            emailAddress = sc.nextLine();
            if (!validEmail(emailAddress)) {
                System.out.println("\nEmail không khả dụng. Vui lòng nhập lại: ");
            }
        } while(!validEmail(emailAddress));

        System.out.println("\n Lương Thưởng: ");
        float soTienThuong = Float.parseFloat(sc.nextLine());
        System.out.println("\n Lương Phạt: ");
        float soTienPhat = Float.parseFloat(sc.nextLine());
        System.out.println("\n Lương Cứng: ");
        float luongCung = Float.parseFloat(sc.nextLine());
        NhanVienFullTime nhanVienft = new NhanVienFullTime(id, name, age, phoneNumber, emailAddress,soTienThuong,soTienPhat,luongCung);
        nhanVienFullTimeList.add(nhanVienft);

        nhanVienft.tinhLuong();
        System.out.println("Tiền Lương của " + nhanVienft.name + "là " + nhanVienft.tinhLuong());
    }


    public static void writeFile() throws IOException {
        FileWriter writer = new FileWriter("contract.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(nhanViens.toString());
        bufferedWriter.close();
        System.out.println("Thêm thành công");
    }



    public static void readFile() throws IOException {
        FileReader frr = new FileReader("ok");
        BufferedReader br = new BufferedReader(frr);

        String text;
        while((text = br.readLine()) != null) {
            System.out.println(text);
        }

        br.close();
    }
}
