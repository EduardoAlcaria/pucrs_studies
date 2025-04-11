package ListaExercicios02;


import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("type your age: ");
        int age = scan.nextInt();

        scan.nextLine();

        if (age >= 18) {
            System.out.println("you are an adult");
        }else {
            System.out.println("you are not an adult");
        }
        scan.close();
    }
}
