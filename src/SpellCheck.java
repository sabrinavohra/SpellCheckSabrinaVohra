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
        Trie dictionaryList = new Trie();
        for(int i = 0; i < dictionary.length; i++) {
            dictionaryList
            // Add each letter into the trie in the word's order using Trie methods
        }

        Trie misspelled = new Trie();
        for(int i = 0; i < text.length; i++) {
            // If word is not in dictionary's trie and not already in the misspelled trie
                // Insert into misspelled trie
                // Remove word from text
                    i--;
        }
        return text;
    }
//        ArrayList<String> finalList = new ArrayList<>();
//        int start = 0;
//        int end = dictionary.length - 1;
//        for(String s: text) {
//            String current = found(s, dictionary, start, end);
//            if(current != null && !finalList.contains(current)) {
//                finalList.add(current);
//            }
//        }
//        String[] finalFound = new String[finalList.size()];
//        for(int i = 0; i < finalList.size(); i++) {
//            finalFound[i] = finalList.get(i);
//        }
//        return finalFound;
//    }
//
//    public String found(String s, String[] dictionary, int start, int end) {
//        int med = (end + start) / 2;
//        if(dictionary[med].equals(s)) {
//            return null;
//        }
//        else if(start >= end) {
//            return s;
//        }
//        else if(dictionary[med].compareTo(s) > 0) {
//            end = med - 1;
//        }
//        else if(dictionary[med].compareTo(s) < 0) {
//            start = med + 1;
//        }
//        return found(s, dictionary, start, end);
//    }
}
