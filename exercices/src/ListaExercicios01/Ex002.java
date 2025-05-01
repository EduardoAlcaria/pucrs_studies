package ListaExercicios01;

public class Ex002 {
    public static void main(String[] args) {

        double t = 45*60;
        double t2 = 90*60;
        double t3 = 24*60*60;
        double m = 5.97 * Math.pow(10, 24);
        double g = 6.67426 * Math.pow(10, -11);


        double r = 6371*1000;
        double h = g * m * (Math.pow(t,2)/(4 * Math.pow(Math.PI, 2)));
        double h2 = g * m * (Math.pow(t2,2)/(4 * Math.pow(Math.PI, 2)));
        double h3 = g * m * (Math.pow(t3,2)/(4 * Math.pow(Math.PI, 2)));

        System.out.println(Math.pow(h, (double) 1 /3) - r);
        System.out.println(Math.pow(h2, (double) 1 /3) - r);
        System.out.println(Math.pow(h3, (double) 1 /3) - r);
    }

}
