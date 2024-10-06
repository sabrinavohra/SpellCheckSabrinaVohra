public class Trie {
    Node root;
    Node[] leaves;

    public Trie() {
        Node[] trie = new Node['0'];
    }

    void insert(String s) {
        for(int i = 0; i < s.length(); i++) {
            Node current = root;
            for(int i = 0; i < s.length() - 1; i++) {
                int j = 0;
                if(i == '/') {
                    j = 26;
                }
                else if(i >= 'a' && i <= 'z') {
                    j = (int) i - 'a';
                }
                if(current.getNext() == null) {
                    Node theNext = current.getNext();
                    current.getNext().setValue(s.charAt(i));
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
