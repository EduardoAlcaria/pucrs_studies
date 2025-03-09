import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bill = 100;

        System.out.print("R$: ");
        int value = scanner.nextInt();

        int[] totBills = new int[7];


        while (true){
            if (value >= bill){
                value -= bill;
                totBills[0]++;
            }else{
                bill = 50;
                if (value >= bill){
                    value -= bill;
                    totBills[1]++;
                }
                bill = 20;
                if (value >= bill){
                    value -= bill;
                    totBills[2]++;
                }
                bill = 10;
                if (value >= bill) {
                    value -= bill;
                    totBills[3]++;
                }
                bill = 5;
                if (value >= bill) {
                    value -= bill;
                    totBills[4]++;
                }
                bill = 2;
                if (value >= bill) {
                    value -= bill;
                    totBills[5]++;
                }
                bill = 1;
                if (value >= bill) {
                    value -= bill;
                    totBills[6]++;
                }
                if (value == 0){
                    break;
                }
            }
        }
        System.out.println(totBills[0] + " R$100 bill(s) ");
        System.out.println(totBills[1] + " R$50 bill(s) ");
        System.out.println(totBills[2] + " R$20 bill(s) ");
        System.out.println(totBills[3] + " R$10 bill(s) ");
        System.out.println(totBills[4] + " R$5 bill(s) ");
        System.out.println(totBills[5] + " R$2 bill(s) ");
        System.out.println(totBills[6] + " R$1 coin(s) ");
    }
}
