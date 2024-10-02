public class Trie {
    Node root;

    public Trie() {
        Node[] trie = new Node[];
    }

    void insert(String s) {
        for(int i = 0; i < s.length(); i++) {

            Node current = new Node(s.charAt(i));
        }
        // Add word into trie, letter by letter
    }

    boolean lookup (String s) {
        // Check if word is in trie already
        return false;
    }

    // Prints out trie for debugging purposes
    void printTrie () {
        System.out.println(root);
    }
}
