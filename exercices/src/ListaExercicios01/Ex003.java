package ListaExercicios01;

public class Ex003 {
    public static void main(String[] args) {
        double g = 6.67426e-11;
        double m = 5.97e24;
        double r = 6_371_000;

        double t1 = 45.0 * 60.0;
        double t2 = 90.0 * 60.0;
        double t3 = 24.0 * 60.0 * 60.0;


        System.out.printf("For T = %.0f seconds, altitude h = %.2f meters%n", t1, Math.pow(((g * m * Math.pow(t1, 2)) / (4 * Math.pow(Math.PI, 2))), 1.0 / 3) - r);
        System.out.printf("For T = %.0f seconds, altitude h = %.2f meters%n", t2, Math.pow(((g * m * Math.pow(t2, 2)) / (4 * Math.pow(Math.PI, 2))), 1.0 / 3) - r);
        System.out.printf("For T = %.0f seconds, altitude h = %.2f meters%n", t3, Math.pow(((g * m * Math.pow(t3, 2)) / (4 * Math.pow(Math.PI, 2))), 1.0 / 3) - r);
    }
}
