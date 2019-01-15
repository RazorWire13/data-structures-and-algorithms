package hashtable;

import java.util.Arrays;
import java.util.HashSet;

public class RepeatedWord {

    public static void main(String[] args) {
        System.out.println(repeatedWord("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."	));
    }

    public static String repeatedWord(String sentence) {
        Hashtable hashtable = new Hashtable();

        // Shifts all characters to lowercase
        String morphString = sentence.toLowerCase();
        System.out.println(morphString);;

        // Eliminates all punctuation
        morphString = morphString.replaceAll("[^a-z ]","");
        System.out.println(morphString);;

        // Splits up string into individual array parts
        String[] splitString = morphString.split(" ");
        System.out.println(Arrays.toString(splitString));

        HashSet<String> wordBank = new HashSet<>();
        for (String string : splitString) {
            if (wordBank.contains(string)) {
                return string;
            } else {
                wordBank.add(string);
            }
        }
        return "No Repeats";
    }
}
