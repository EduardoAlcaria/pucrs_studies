package ListaExercicios02Complementar;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type the card: ");
        String card = scanner.nextLine().toUpperCase();

        char suit = card.charAt(1);
        char value = card.charAt(0);

        String valueFinal = "";
        String suitFinal = "";

        String predecessorValueCard1 = "";
        String sucessorValueCard1 = "";

        if (suit == 'O') {
            suitFinal = "Diamonds";
        }
        if (suit == 'E') {
            suitFinal = "Spades";
        }
        if (suit == 'C') {
            suitFinal = "Hearts";
        }
        if (suit == 'P') {
            suitFinal = "Clubs";
        }

        if (value == 'A') {
            predecessorValueCard1 = "Thirteen of ";
            valueFinal = "As of ";
            sucessorValueCard1 = "Two of ";
        }
        if (value == 'Q') {
            predecessorValueCard1 = "Eleven of ";
            valueFinal = "Twelve of  ";
            sucessorValueCard1 = "Thirteen of ";
        }
        if (value == 'J') {
            predecessorValueCard1 = "Ten of ";
            valueFinal = "Eleven of ";
            sucessorValueCard1 = "Twelve of  ";
        }
        if (value == 'K') {
            predecessorValueCard1 = "Twelve of ";
            valueFinal = "Thirteen of ";
            sucessorValueCard1 = "As of ";
        }
        if (value == '2') {
            predecessorValueCard1 = "As of ";
            valueFinal = "Two of ";
            sucessorValueCard1 = "Three of ";
        }
        if (value == '3') {
            predecessorValueCard1 = "Two of ";
            valueFinal = "Three of ";
            sucessorValueCard1 = "Fourth of ";
        }
        if (value == '4') {
            predecessorValueCard1 = "Three of ";
            valueFinal = "Fourth of ";
            sucessorValueCard1 = "Five of ";
        }
        if (value == '5') {
            predecessorValueCard1 = "Fourth of ";
            valueFinal = "Five of ";
            sucessorValueCard1 = "Six of ";
        }
        if (value == '6') {
            predecessorValueCard1 = "Five of ";
            valueFinal = "Six of ";
            sucessorValueCard1 = "Seven of ";
        }
        if (value == '7') {
            predecessorValueCard1 = "Six of ";
            valueFinal = "Seven of ";
            sucessorValueCard1 = "Eight of ";
        }
        if (value == '8') {
            predecessorValueCard1 = "Seven of ";
            valueFinal = "Eight of ";
            sucessorValueCard1 = "Nine of ";
        }
        if (value == '9') {
            predecessorValueCard1 = "Eight of ";
            valueFinal = "Nine of ";
            sucessorValueCard1 = "Ten of ";
        }
        if (card.charAt(0) == '1' && card.charAt(1) == 0){
            predecessorValueCard1 = "Nine of ";
            valueFinal = "Ten of";
            sucessorValueCard1 = "Eleven of ";
        }

        String cardFSuit = suitFinal;
        String cardFValue = valueFinal;

        String cardF = valueFinal + suitFinal;

        System.out.println("type the card: ");
        String card2 = scanner.nextLine().toUpperCase();

        suit = card2.charAt(1);
        value = card2.charAt(0);

        String predecessorValueCard2 = "";
        String sucessorValueCard2 = "";

        valueFinal = "";
        suitFinal = "";

        if (suit == 'O') {
            suitFinal = "Diamonds";
        }
        if (suit == 'E') {
            suitFinal = "Spades";
        }
        if (suit == 'C') {
            suitFinal = "Hearts";
        }
        if (suit == 'P') {
            suitFinal = "Clubs";
        }

        if (value == 'A') {
            predecessorValueCard2 = "Thirteen of ";
            valueFinal = "As of ";
            sucessorValueCard2 = "Two of ";
        }
        if (value == 'Q') {
            predecessorValueCard2 = "Eleven of ";
            valueFinal = "Twelve of  ";
            sucessorValueCard2 = "Thirteen of ";
        }
        if (value == 'J') {
            predecessorValueCard2 = "Ten of ";
            valueFinal = "Eleven of ";
            sucessorValueCard2 = "Twelve of  ";
        }
        if (value == 'K') {
            predecessorValueCard2 = "Twelve of ";
            valueFinal = "Thirteen of ";
            sucessorValueCard2 = "As of ";
        }
        if (value == '2') {
            predecessorValueCard2 = "As of ";
            valueFinal = "Two of ";
            sucessorValueCard2 = "Three of ";
        }
        if (value == '3') {
            predecessorValueCard2 = "Two of ";
            valueFinal = "Three of ";
            sucessorValueCard2 = "Fourth of ";
        }
        if (value == '4') {
            predecessorValueCard2 = "Three of ";
            valueFinal = "Fourth of ";
            sucessorValueCard2 = "Five of ";
        }
        if (value == '5') {
            predecessorValueCard2 = "Fourth of ";
            valueFinal = "Five of ";
            sucessorValueCard2 = "Six of ";
        }
        if (value == '6') {
            predecessorValueCard2 = "Five of ";
            valueFinal = "Six of ";
            sucessorValueCard2 = "Seven of ";
        }
        if (value == '7') {
            predecessorValueCard2 = "Six of ";
            valueFinal = "Seven of ";
            sucessorValueCard2 = "Eight of ";
        }
        if (value == '8') {
            predecessorValueCard2 = "Seven of ";
            valueFinal = "Eight of ";
            sucessorValueCard2 = "Nine of ";
        }
        if (value == '9') {
            predecessorValueCard2 = "Eight of ";
            valueFinal = "Nine of ";
            sucessorValueCard2 = "Ten of ";
        }
        if (card.charAt(0) == '1' && card.charAt(1) == 0){
            predecessorValueCard2 = "Nine of ";
            valueFinal = "Ten of";
            sucessorValueCard2 = "Eleven of ";
        }

        String card2FSuit = suitFinal;
        String card2FValue = valueFinal;
        String card2F = valueFinal + suitFinal;

        System.out.println("type the card: ");
        String card3 = scanner.nextLine().toUpperCase();

        suit = card3.charAt(1);
        value = card3.charAt(0);

        String predecessorValueCard3 = "";
        String sucessorValueCard3 = "";

        valueFinal = "";
        suitFinal = "";

        if (suit == 'O') {
            suitFinal = "Diamonds";
        }
        if (suit == 'E') {
            suitFinal = "Spades";
        }
        if (suit == 'C') {
            suitFinal = "Hearts";
        }
        if (suit == 'P') {
            suitFinal = "Clubs";
        }

        if (value == 'A') {
            predecessorValueCard3 = "Thirteen of ";
            valueFinal = "As of ";
            sucessorValueCard3 = "Two of ";
        }
        if (value == 'Q') {
            predecessorValueCard3 = "Eleven of ";
            valueFinal = "Twelve of  ";
            sucessorValueCard3 = "Thirteen of ";
        }
        if (value == 'J') {
            predecessorValueCard3 = "Ten of ";
            valueFinal = "Eleven of ";
            sucessorValueCard3 = "Twelve of  ";
        }
        if (value == 'K') {
            predecessorValueCard3 = "Twelve of ";
            valueFinal = "Thirteen of ";
            sucessorValueCard3 = "As of ";
        }
        if (value == '2') {
            predecessorValueCard3 = "As of ";
            valueFinal = "Two of ";
            sucessorValueCard3 = "Three of ";
        }
        if (value == '3') {
            predecessorValueCard3 = "Two of ";
            valueFinal = "Three of ";
            sucessorValueCard3 = "Fourth of ";
        }
        if (value == '4') {
            predecessorValueCard3 = "Three of ";
            valueFinal = "Fourth of ";
            sucessorValueCard3 = "Five of ";
        }
        if (value == '5') {
            predecessorValueCard3 = "Fourth of ";
            valueFinal = "Five of ";
            sucessorValueCard3 = "Six of ";
        }
        if (value == '6') {
            predecessorValueCard3 = "Five of ";
            valueFinal = "Six of ";
            sucessorValueCard3 = "Seven of ";
        }
        if (value == '7') {
            predecessorValueCard3 = "Six of ";
            valueFinal = "Seven of ";
            sucessorValueCard3 = "Eight of ";
        }
        if (value == '8') {
            predecessorValueCard3 = "Seven of ";
            valueFinal = "Eight of ";
            sucessorValueCard3 = "Nine of ";
        }
        if (value == '9') {
            predecessorValueCard3 = "Eight of ";
            valueFinal = "Nine of ";
            sucessorValueCard3 = "Ten of ";
        }
        if (card.charAt(0) == '1' && card.charAt(1) == 0){
            predecessorValueCard3 = "Nine of ";
            valueFinal = "Ten of";
            sucessorValueCard3 = "Eleven of ";
        }

        String card3FSuit = suitFinal;
        String card3FValue = valueFinal;

        String card3F = valueFinal + suitFinal;

        if (sucessorValueCard1 == card2FValue && sucessorValueCard2 == card3FValue || sucessorValueCard3 == card2FValue
        && sucessorValueCard2 == cardFValue){
            if (cardFSuit == card2FSuit && card2FSuit == card3FSuit && card3FSuit == cardFSuit)
                System.out.println("they are a sequence");
        }
    }
}
