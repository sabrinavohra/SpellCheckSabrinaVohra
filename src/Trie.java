import java.util.Arrays;

public class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }

    void insert(String s) {
        Node current = root;
        for (int i = 0; i < s.length() - 1; i++) {
            int j = 0;
            if (i == '/') {
                j = 26;
            } else if (i >= 'a' && i <= 'z') {
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
        for (int i = 0; i < s.length() - 1; i++) {
            int j = 0;
            if (i == '/') {
                j = 26;
            }
            else if (i >= 'a' && i <= 'z') {
                j = i - 'a';
            }
            if (current.next[j] == null) {
                return false;
            }
            else if(current.next[j].equals(s.charAt(i+1))) {
                current = current.next[s.charAt(i + 1)];
            }
        }
        return true;
    }

    // Prints out trie for debugging purposes
    void printTrie () {
        System.out.println(Arrays.toString(root.getNext()));
    }
}
