import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type the value for N");
        int n = scanner.nextInt();
        for (int i = 2; i < 5; i++) {
            System.out.println(Math.pow(n, i));
        }
    }
}
