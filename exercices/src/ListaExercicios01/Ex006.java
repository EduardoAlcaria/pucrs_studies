package ListaExercicios01;

public class Ex006 {
    public static void main(String[] args) {
        int bill = 236;
        int bill100 = 100;
        int bill50 = 50;
        int bill20 = 20;
        int bill10 = 10;
        int bill2 = 2;
        int bill1 = 1;

        bill100 = bill/100;
        bill50 = bill%100/50;
        bill20 = bill%100%50/20;
        bill10 = bill%100%50%20/10;
        bill2 = bill%100%50%20%10/2;
        bill1 = bill%100%50%20%10%2/1;


        System.out.println("100 bills " + bill100 );
        System.out.println("50 bills " + bill50);
        System.out.println("20 bills " +  bill20);
        System.out.println("10 bills " +  bill10);
        System.out.println("2 bills " +  bill2);
        System.out.println("1 bills " +  bill1);
    }
}
