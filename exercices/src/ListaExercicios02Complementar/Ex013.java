package ListaExercicios02Complementar;

//13. Implemente um programa que leia a representação das cartas de um baralho (valor e naipe) e escreve por extenso o significado da carta. Use C
//para copas, P para paus, E para espada e O para ouro. Exemplo:
//(a) entrada: AC, saída: ás de copas
//(b) entrada: 2P, saída: dois de paus
//(c) entrada: QE, saida: rainha de espadas


import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type the card: ");
        String card = scanner.nextLine().toUpperCase();

        char suit = card.charAt(1);
        char value = card.charAt(0);

        String valueFinal = "";
        String suitFinal = "";

        if (suit == 'O'){
            suitFinal = "Diamonds";
        }
        if (suit == 'E'){
            suitFinal = "Spades";
        }
        if (suit == 'C'){
            suitFinal = "Hearts";
        }
        if (suit == 'P'){
            suitFinal = "Clubs";
        }

        if (value == 'Q') {
            valueFinal = "Queens of" ;
        }
        if (value == 'A'){
            valueFinal = "As of ";
        }
        if (value == 'J'){
            valueFinal = "Eleven of ";
        }
        if (value == 'Q'){
            valueFinal = "Twelve of ";
        }
        if (value == 'K'){
            valueFinal = "Thirteen of ";
        }
        if (value == '1'){
            valueFinal = "One of ";
        }
        if (value == '2'){
            valueFinal = "Two of ";
        }
        if (value == '3'){
            valueFinal = "Three of ";
        }
        if (value == '4'){
            valueFinal = "Fourth of ";
        }
        if (value == '5'){
            valueFinal = "Five of ";
        }
        if (value == '6'){
            valueFinal = "Six of ";
        }
        if (value == '7'){
            valueFinal = "Seven of ";
        }
        if (value == '8'){
            valueFinal = "Eight of ";
        }
        if (value == '9'){
            valueFinal = "Nine of ";
        }
        if (card.charAt(0) == '1' && card.charAt(1) == '0'){
            valueFinal = "Ten of ";
        }

        System.out.println(valueFinal + suitFinal);

    }
}
