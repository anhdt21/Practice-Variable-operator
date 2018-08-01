import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        double pi = 3.14;
        System.out.print("Nhập vào bán kính hình tròn r = ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double P = 2*pi*r;
        double S = Math.pow(r, 2)*pi;
        System.out.println("Chu vi hình tròn là : "+P);
        System.out.println("Diện tích hình tròn là : "+S);
    }
}
