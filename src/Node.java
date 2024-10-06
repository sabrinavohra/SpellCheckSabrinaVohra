public class Node {
    public static final int NUM_CHARS  = 255;
    private boolean isWord;
    private char value;
    private Node[] next;

    public Node(char value) {
        Node[] currentArray = new Node[NUM_CHARS];
        Node[] next = new Node[NUM_CHARS];
        this.value = value;
    }

    // Checks if the node has ended the word / contains the final letter of a word
    boolean isWord() {
        return false;
    }

    // Sets the node as the final letter of a word
    void setWord(boolean value) {
        if(value) {
            isWord = true;
        }
        else {
            isWord = false;
        }
    }

    public void setValue(char value) {
        this.value = value;
    }

    public char getValue () {
        return value;
    }
    // Gets the next node to continue the word
    public Node[] getNext() {
        return next;
    }
}
