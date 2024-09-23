import java.util.ArrayList;
import java.util.Arrays;
/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Sabrina Vohra
 * */

public class SpellCheck {


    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {
        ArrayList<String> found = new ArrayList<>();
        int start = 0;
        int end = text.length - 1;
        int mid = (start + end) / 2;
        for (String s : text) {
            if (dictionary[mid].equals(s)) {
                break;
            }
            if (dictionary[mid].compareTo(s) < 0) {
                start = mid + 1;
            } else if (dictionary[mid].compareTo(s) > 0) {
                start = mid - 1;
            } else {
                found.add(s);
            }
        }
        String[] finalFound = new String[found.size()];
        for(int i = 0; i < found.size(); i++) {
            finalFound[i] = found.get(i);
        }
        return finalFound;
    }
}

// First idea:
    // Try binary search -- will be faster than linear