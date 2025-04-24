package PointsProgram;

public class Ex001 {
    public static void main(String[] args) {
        String sentence = "Bombardilo crocodilo";
        char l;

        int wordConter = 1;

        for (int i = 0; i < sentence.length(); i++) {
            l = sentence.charAt(i);
            if (l == ' ' || l == '\t'){
                wordConter++;
            }
        }

        System.out.println(wordConter);
    }
}
