package PointsProgram;

import java.util.Scanner;

public class EduardoAlcariaSemana11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a sentence: ");
        String sentence = scanner.nextLine();

        char l;
        StringBuilder stringBuilder = new StringBuilder(sentence);

        for (int i = 0; i < sentence.length(); i++) {
            l = sentence.charAt(i);
            if (l == 'a' || l == 'e' || l == 'i' ||  l == 'o' || l == 'u'){
                stringBuilder.setCharAt(i, Character.toUpperCase(l));
            }
        }
        System.out.println(stringBuilder);
    }
}
