import java.util.*;

public class PlagiarismDetector {

    public static Set<String> getNGrams(String text, int n) {
        String[] words = text.split(" ");
        Set<String> grams = new HashSet<>();

        for (int i = 0; i <= words.length - n; i++) {
            String gram = "";
            for (int j = 0; j < n; j++)
                gram += words[i + j] + " ";
            grams.add(gram);
        }
        return grams;
    }

    public static void main(String[] args) {

        String doc1 = "java is a programming language";
        String doc2 = "java is a powerful programming language";

        Set<String> set1 = getNGrams(doc1, 2);
        Set<String> set2 = getNGrams(doc2, 2);

        set1.retainAll(set2);

        System.out.println("Matching phrases: " + set1);
    }
}