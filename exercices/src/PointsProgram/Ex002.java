package PointsProgram;

public class Ex002 {
    public static void main(String[] args) {
        String sentence = "Arise from the shadows";

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
