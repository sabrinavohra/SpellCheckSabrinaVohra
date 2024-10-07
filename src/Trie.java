import java.util.Arrays;

public class Trie {
    private Node root;

    public Trie() {
        // Creates new root to search
        root = new Node();
    }

    void insert(String s) {
        // Starts the process at the root node
        Node current = root;
        // Creates for loop to work through word
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            // Checks if letter doesn't exist
            if (s.charAt(i) == '\'') {
                j = 26;
            }
            // Checks if letter is between a and z and finds correct index value accordingly
            else if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')) {
                j = s.charAt(i) - 'a';
            }
            // Creates new node if node for the correct letter doesn't exist
            if(current.next[j] == null) {
                current.next[j] = new Node();
            }
            // Changes the current to the next Node
            current = current.next[j];
        }
        // Sets the word to true once it's over
        current.setWord(true);
    }

    // Searches through trie to see if given word is already there
    boolean lookup (String s) {
        // Starts at root
        Node current = root;
        // Creates for loop to search through every letter in word
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            // Checks if letter exists
            if (s.charAt(i) == '\'') {
                j = 26;
            }
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                j = s.charAt(i) - 'a';
            }

            // Returns false if the next letter isn't in the trie because the word isn't in the tree
            if(current.next[j] == null) {
                return false;
            }
            // Moves onto the next letter
            current = current.next[j];
        }
        return current.isWord();
    }

    // Prints out trie for debugging purposes
    void printTrie () {
        System.out.println(Arrays.toString(root.getNext()));
    }
}
