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
     * @param text       The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {
        Trie dictionaryList = new Trie();
        for (int i = 0; i < dictionary.length; i++) {
            dictionaryList.insert(dictionary[i]);
        }

        ArrayList<String> finalList = new ArrayList<>();
        Trie misspelled = new Trie();
        for (int i = 0; i < text.length; i++) {
            if (!misspelled.lookup(text[i])) {
                if (!dictionaryList.lookup(text[i])) {
                    misspelled.insert(text[i]);
                    finalList.add(text[i]);
                    i--;
                }
            }
        }
        String[] finalMisspelled = new String[finalList.size()];
        for(int i = 0; i < finalList.size(); i++) {
            finalMisspelled[i] = finalList.get(i);
        }
        return finalMisspelled;
    }
}