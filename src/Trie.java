import java.util.Arrays;

public class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }

    void insert(String s) {
        Node current = root;
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            if (s.charAt(i) == '\'') {
                j = 26;
            } else if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')) {
                j = i - 'a';
            }

            if(current.next[j] == null) {
                current.next[j] = new Node();
            }
            current = current.next[j];
        }
        current.setWord(true);
    }

    boolean lookup (String s) {
        Node current = root;
        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            if (s.charAt(i) == '\'') {
                j = 26;
            }
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                j = i - 'a';
            }

            if(current.next[j] == null) {
                return false;
            }
            current = current.next[j];
        }
        return current.isWord();
    }

    // Prints out trie for debugging purposes
    void printTrie () {
        System.out.println(Arrays.toString(root.getNext()));
    }
}
