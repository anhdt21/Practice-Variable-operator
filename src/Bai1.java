import java.util.Scanner;

public class Bai1 {
    private static float nhapSo(String str) {
        float x;
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        x = sc.nextFloat();
        return x;
    }

    public static void main(String[] args) {
        System.out.println("Nhập điểm 3 môn của sinh viên");
        float a = nhapSo("Vật lý :");
        float b = nhapSo("Hóa học :");
        float c = nhapSo("Sinh học :");
        float average = (a + b + c)/3;
        System.out.println("Tổng điểm là : " + (a+b+c));
        System.out.println("Điểm trung bình cộng là : "+ (float)Math.round(average*100)/100 );
    }
}
