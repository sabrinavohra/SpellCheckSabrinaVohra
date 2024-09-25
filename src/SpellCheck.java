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
        ArrayList<String> finalList = new ArrayList<>();
        int start = 0;
        int end = dictionary.length - 1;
        boolean repeat = false;
        for(String s: text) {
            String current = found(s, dictionary, start, end);
            if(current != null ) {
                if(!(finalList.contains(current))) {
                    finalList.add(current);
                }
            }
        }
        String[] finalFound = new String[finalList.size()];
        for(int i = 0; i < finalList.size(); i++) {
            finalFound[i] = finalList.get(i);
        }
        return finalFound;
    }

    public String found(String s, String[] dictionary, int start, int end) {
        int med = (end + start) / 2;
        if(dictionary[med].equals(s)) {
            return null;
        }
        else if(start >= end) {
            return s;
        }
        else if(dictionary[med].compareTo(s) > 0) {
            end = med - 1;
        }
        else if(dictionary[med].compareTo(s) < 0) {
            start = med + 1;
        }
        return found(s, dictionary, start, end);
    }
}



// First idea:
    // Try binary search -- will be faster than linear