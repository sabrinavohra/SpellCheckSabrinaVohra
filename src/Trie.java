public class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }

    void insert(String s) {
        Node current = root;
        for(int i = 0; i < s.length() - 1; i++) {
            int j = 0;
            if(i == '/') {
                j = 26;
            }
            else if(i >= 'a' && i <= 'z') {
                j = (int) i - 'a';
            }
            if(current.trie[j] == null) {
                current.trie[j] = new Node();
            }
        }


            Node current = new Node(s.charAt(i));
            if(current.getNext(s.charAt(i + 1)).equals(s.charAt(i+1)) {
            }

            int next = trie.getNext();
            if(current.getNext(s.charAt(i + 1)).equals(s.charAt(i + 1))) {
                current.setValue(s.charAt(i + 1));
            }
            else {
                Node theNext = new Node(s.charAt(i + 1));
            }
        }
        // Add word into trie, letter by letter
    }

    boolean lookup (String s) {
        // Check if word is in trie already
        return false;
    }

    // Prints out trie for debugging purposes
    void printTrie () {
        System.out.println(trie);
    }
}
