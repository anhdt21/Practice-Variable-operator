import java.util.Calendar;
import java.util.Scanner;

public class Bai4 {
    private static int NhapSo(String str) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        x = sc.nextInt();
        return x;
    }
    public static void main(String[] args) {
        int year = NhapSo("Nhập vào năm sinh : ");
        Calendar today = Calendar.getInstance();
        int yearNow = today.get(Calendar.YEAR);
        int age = yearNow - year;
        System.out.println("Số tuổi người đó là : "+ age);
    }
}
