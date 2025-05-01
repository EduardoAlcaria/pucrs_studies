package ListaExercicios01Complementar;

//1. Implemente umprograma que leia o horário de umevento qualquer ocorrido durante o
//dia. Considerando que o horário é representado emhora, minuto e segundo, o programa
//deve:
//(a) converter esse horário para segundos e escrever tal informação na tela.
//(b) escrever na tela quantos segundos faltam para o dia acabar.


import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("hour");
        int h = scanner.nextInt();

        System.out.println("mins");
        int m = scanner.nextInt();

        System.out.println("segs");
        int s = scanner.nextInt();


        double totSeg = (double) (h + m + s) * 3600;

        System.out.println(totSeg);
        System.out.println(86400 - totSeg);


    }
}
