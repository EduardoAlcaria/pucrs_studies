import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the 1st value: ");
        int value1 = scanner.nextInt();

        System.out.println("Type the 2nd value: ");
        int value2 = scanner.nextInt();

        int sum = value1 + value2;
        double difference = value1 - value2;
        double average = (double) sum / 2;

        double abusolute = Math.abs(difference);

        double max = (value1+value2+abusolute)/2;
        double min = (value1+value2-abusolute)/2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Average: " + average);
        System.out.println("Distance: " + abusolute);
        System.out.println("Greater: " + max);
        System.out.println("Minor: " + min);
        System.out.println("Max (math): " + Math.max(value1, value2));
        System.out.println("Min (math): " + Math.min(value1, value2));
    }
}
