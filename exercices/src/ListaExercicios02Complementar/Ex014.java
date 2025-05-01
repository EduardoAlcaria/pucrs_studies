package ListaExercicios02Complementar;


//14. Faça um programa que leia 3 cartas (valor e naipe) de um baralho, verifique
//e escreva se as três cartas formam uma trinca. Para ser uma trinca, os
//valores devem ser iguais, mas os naipes diferentes.

import javax.smartcardio.Card;
import java.util.Scanner;

public class Ex014 {
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

        String cardFSuit = suitFinal;
        String cardFValue = valueFinal;

        String cardF = valueFinal + suitFinal;

        System.out.println("type the card: ");
        String card2 = scanner.nextLine().toUpperCase();

        suit = card2.charAt(1);
        value = card2.charAt(0);

        valueFinal = "";
        suitFinal = "";

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

        String card2FSuit = suitFinal;
        String card2FValue = valueFinal;
        String card2F = valueFinal + suitFinal;

        System.out.println("type the card: ");
        String card3 = scanner.nextLine().toUpperCase();

        suit = card3.charAt(1);
        value = card3.charAt(0);

        valueFinal = "";
        suitFinal = "";

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

        String card3FSuit = suitFinal;
        String card3FValue = valueFinal;


        String card3F = valueFinal + suitFinal;

        System.out.println(cardF);
        System.out.println(card2F);
        System.out.println(card3F);

        if (cardFSuit != card2FSuit && card2FSuit != card3FSuit && card3FSuit != cardFSuit){
            if (cardFValue == card2FValue && card2FValue == card3FValue && card3FValue == cardFValue){
                System.out.println("They have the same value");
            }
        }
    }
}
