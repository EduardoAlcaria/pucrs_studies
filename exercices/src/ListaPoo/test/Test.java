package ListaPoo.test;

import ListaPoo.Domain.Retangulo;

public class Test {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10, 10);

        System.out.println(retangulo.area());
        System.out.println(retangulo.perimeter());
        System.out.println(retangulo.pitagoras());

    }
}
