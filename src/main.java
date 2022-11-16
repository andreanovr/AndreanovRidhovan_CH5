import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nAplikasi Hitung Biaya Parkir");
        System.out.print("Masukkan Total Jam Parkir Anda : ");
        int a = input.nextInt();

        float total = 0;
        float fee1 = 1;
        float fee2 = fee1 / 2;
        float fee3 = 15;

        if ( a <= 5) {
            total = a*fee1;
        } else if (a > 5 && a < 24) {
            a = a-5;
            total = (a*fee2)+5;
        } else {
            if (a%24==0) {
                a=a/24;
                total = fee3*a;
            } else {
                a= a-24;
                total = fee3+(a*fee2);
            }
        }

        System.out.println("Total Biaya Parkir Anda adalah $"+total);
    }
}
