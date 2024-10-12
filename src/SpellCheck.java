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
        // Creates new TST or Trie for dictionary
        TST glossary = new TST();
        // Comment below implements trie solution
        //Trie glossary = new Trie();
        // Adds every word in the dictionary into the glossay Trie/TST
        for (int i = 0; i < dictionary.length; i++) {
            glossary.insert(dictionary[i]);
        }

        // Creates an ArrayList and Trie/TST to keep track of the misspelled words
        ArrayList<String> finalList = new ArrayList<>();
        TST misspelled = new TST();
        // Comment below implements Trie solution
        //Trie misspelled = new Trie();
        for (int i = 0; i < text.length; i++) {
            // Adds any misspelled words to both the Trie/TST and the ArrayList
            if (!misspelled.lookup(text[i])) {
                if (!glossary.lookup(text[i])) {
                    misspelled.insert(text[i]);
                    finalList.add(text[i]);
                }
            }
        }
        // Adds all the misspelled words in the ArrayList into an Array and returns it
        String[] finalMisspelled = new String[finalList.size()];
        for(int i = 0; i < finalList.size(); i++) {
            finalMisspelled[i] = finalList.get(i);
        }
        return finalMisspelled;
    }
}