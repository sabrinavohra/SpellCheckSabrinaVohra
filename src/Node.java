public class Node {
    public static final int NUM_CHARS  = 255;
    private boolean isWord = false;
    private Node[] next = new Node[27];

    public Node() {
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

    // Gets the next node to continue the word
    public Node[] getNext() {
        return next;
    }
}
