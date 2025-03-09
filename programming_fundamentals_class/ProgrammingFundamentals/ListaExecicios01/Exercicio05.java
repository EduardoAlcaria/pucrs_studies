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

        double distance = Math.abs(difference);
        double max;
        double min;

        if (value1 > value2) {
            max = value1;
        } else {
            max = value2;
        }
        if (value1 < value2) {
            min = value1;
        } else {
            min = value2;
        }


        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Average: " + average);
        System.out.println("Distance: " + distance);
        System.out.println("Greater: " + max);
        System.out.println("Minor: " + min);
        System.out.println("Max (math): " + Math.max(value1, value2));
        System.out.println("Min (math): " + Math.min(value1, value2));


    }
}
