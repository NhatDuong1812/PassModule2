
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Quản Lý Nhân Viên");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị sanh sách");
            System.out.println("3. Tinh Luong Nhan Vien Part Time");
            System.out.println("4. Tinh Luong Nhan Vien Full Time");
            System.out.println("Chọn chức năng");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    Method.add();
                    break;
                case 2:
                    Method.show();
                    break;
                case 3:
                    Method.tinhLuongNVPT();
                    break;
                case 4:
                    Method.tinhLuongNVFT();
                    break;
                default:
                    System.out.println("Lỗi !!");
            }
        }while (true);
    }
}
