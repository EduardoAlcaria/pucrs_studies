package ListaExercicios01Complementar;

//3. Faça um programa que leia a capacidade (em litros) do tanque de um carro, o seu
//consumo médio (km/litro) e a distância (em km) que esse carro precisa percorrer. O
//programa deve calcular e escrever tantas vezes será necessário parar para abastecer para
//que o carro consiga percorrer a distância informada.


import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many km your car does for littler: ");
        double kmPerLittler = scanner.nextDouble();

        System.out.println("Tank capacity L:");
        double tankCapacity = scanner.nextDouble();

        System.out.println("How many Km your car will travel: ");
        double km = scanner.nextDouble();

        double range = kmPerLittler * tankCapacity;

        double gasStops = km/range;

        System.out.println("you will have to do " + gasStops + " gas stops");

    }
}
