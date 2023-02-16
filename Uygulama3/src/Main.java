import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kenar1,kenar2,kenar3;
        double u,cevre,alan;

        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci kenar uzunluğunu giriniz : ");
        kenar1 = scan.nextInt();
        System.out.print("İkinci kenar uzunluğunu giriniz : ");
        kenar2 = scan.nextInt();
        System.out.print("Üçüncü kenar uzunluğunu giriniz : ");
        kenar3 = scan.nextInt();

        u = (kenar1+kenar2+kenar3)/2;
        cevre = 2*u;
        alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));

        System.out.println("Çevre : " + cevre);
        System.out.println("Alan : " + alan);
    }
}