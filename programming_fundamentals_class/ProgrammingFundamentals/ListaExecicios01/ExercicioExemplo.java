import java.util.Scanner;

public class ExercicioExemplo{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the 1st value: ");
        int value1 = scan.nextInt();
        System.out.println("Type the 2nd value: ");
        int value2 = scan.nextInt();
        System.out.println(value1 + value2);
    }
}