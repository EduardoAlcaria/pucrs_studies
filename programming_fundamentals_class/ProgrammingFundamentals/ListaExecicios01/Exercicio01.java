
import java.util.Scanner;

public class Exercicio01
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("1st value: ");
        double value1 = scan.nextDouble();
        System.out.println("2nd value: ");
        double value2 = scan.nextDouble();
        System.out.println("3th value: ");
        double value3 = scan.nextDouble();
        double res = (value1+value2+value3)/3;
        System.out.println(res);
        
    }
}
