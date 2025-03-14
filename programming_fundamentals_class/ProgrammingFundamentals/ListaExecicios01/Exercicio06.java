

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, d, e, f;

        System.out.print("R$: ");
        int value = scanner.nextInt();

        System.out.println(value / 100 + " R$100 bill(s) ");
        a = value % 100;
        System.out.println(a / 50 + " R$50 bill(s) ");
        b = a % 50;
        System.out.println(b / 20 + " R$20 bill(s) ");
        c = b % 20;
        System.out.println(c / 10 + " R$10 bill(s) ");
        d = c % 10;
        System.out.println(d / 5 + " R$5 bill(s) ");
        e = d % 5;
        System.out.println(e / 2 + " R$2 bill(s) ");
        f = e % 2;
        System.out.println(f + " R$1 bill(s) ");

    }
}
