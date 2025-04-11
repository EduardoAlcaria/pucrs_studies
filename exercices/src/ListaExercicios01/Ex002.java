package ListaExercicios01;

public class Ex002 {
    public static void main(String[] args) {
        double t = (double) 45.0F;
        double r = (double) 6371.0F;
        double m = 5.97 * Math.pow((double) 10.0F, (double) 24.0F);
        double g = 6.67426 * Math.pow((double) 10.0F, (double) -13.0F) * Math.pow(m, (double) 3.0F);
        double h = g * m * Math.pow(t, (double) 2.0F) / ((double) 4.0F * Math.pow(3.14, (double) 2.0F)) - r;
        double div = (double) 0.0F;
        System.out.println(Math.pow(h,div));
    }
}
