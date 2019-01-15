package hashtable;

import java.util.Arrays;

public class RepeatedWord {

    public static void main(String[] args) {
        System.out.println(repeatedWord("A-B!C,D#F'G&H@A"));
    }

    public static String repeatedWord(String sentence) {
        Hashtable hashtable = new Hashtable();

        // Shifts all characters to lowercase
        String morphString = sentence.toLowerCase();
        System.out.println(morphString);;

        // Eliminates all punctuation
        morphString = morphString.replaceAll("[^a-z]"," ");
        System.out.println(morphString);;

        // Splits up string into individual array parts
        String[] splitString = morphString.split(" ");
        System.out.println(Arrays.toString(splitString));

        // TODO: need logic to account for null pointer exception. Perhaps a do/while?
        for (String string : splitString) {
            hashtable.add(string, string);
            if (hashtable.contains(string)) {
                return string;
            }
        }
        return "No Repeats";
    }
}
