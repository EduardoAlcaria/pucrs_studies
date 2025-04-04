import java.util.Scanner;

public class Ex03ListaFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("type a number: ");
        
        int n = scan.nextInt();

        n--;
        System.out.println("the predecessos are");
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }


        scan.close();
    }
}