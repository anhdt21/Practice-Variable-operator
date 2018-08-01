import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Chuyển đổi độ oC sang oF \n Nhập vào giá trị cần đổi : ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = (9*x)/5 + 32;
        System.out.println("=====> "+ x +"_oC = "+ y +"_oF");
    }
}