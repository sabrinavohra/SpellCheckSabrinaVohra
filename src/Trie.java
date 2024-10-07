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
            if (current.getNext()[j] == null) {
                current.getNext()[j] = new Node();
            }
            current = current.getNext()[j];
        }
        current.setWord(true);
    }

    boolean lookup (String s) {
        Node current = root;
        boolean state = true;
        for (int i = 0; i < s.length() - 1; i++) {
            int j = 0;
            if (i == '/') {
                j = 26;
            }
            else if (i >= 'a' && i <= 'z') {
                j = i - 'a';
            }
            if (current.getNext()[j] == null) {
                return false;
            }
            else if(current.getNext()[j].equals(s.charAt(i + 1))) {
                current = current.getNext()[s.charAt(i + 1)];
            }
        }
        return true;
    }

    // Prints out trie for debugging purposes
    void printTrie () {
        System.out.println(root);
    }
}
