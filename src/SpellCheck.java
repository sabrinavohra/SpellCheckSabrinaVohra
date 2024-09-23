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
        for(String s: text) {
            while(!s.equals(end)) {
                System.out.println(s);
                if (dictionary[mid].equals(s)) {
                    break;
                }
                if (dictionary[mid].compareTo(s) < 0) {
                    start = mid - 1;
                } else if (dictionary[mid].compareTo(s) > 0) {
                    start = mid + 1;
                } else {
                    found.add(s);
                }
            }

        }
        String[] finalFound = new String[found.size()];
        for(int i = 0; i < found.size(); i++) {
            finalFound[i] = found.get(i);
        }
        return finalFound;
    }
    public String found(String[] text, String[] dictionary, int start, int end) {
        int med = (end + start) / 2;
        // Returns true if the dictionary at the medium value is the same as the String currently being searched for
        if(dictionary[med].equals(text[med])) {
            return null;
        }
        // Returns false if all the values have been checked and there's no match
        else if(start >= end) {
            return text[med];
        }
        // Changes end variable if the String being searched for is less than the medium value lexicographically
        else if(dictionary[med].compareTo(text[med]) > 0) {
            end = med - 1;
        }
        // Changes start variable if the String being searched for is greater than the medium value lexicographically
        else if(DICTIONARY[med].compareTo(s) < 0) {
            start = med + 1;
        }
        // Recursively calls the method with the new values until a match is found or not
        return found( s, start, end);
    }
}



// First idea:
    // Try binary search -- will be faster than linear