public class Node {
    public static final int NUM_CHARS  = 255;
    private boolean isWord = false;
    public Node[] next = new Node[27];

    public Node() {
    }

    // Checks if the node has ended the word / contains the final letter of a word
    boolean isWord() {
        return isWord;
    }

    void setWord(boolean end) {
        if(end) {
            isWord = true;
        }
        isWord = false;
    }

    // Gets the next node to continue the word
    public Node[] getNext() {
        return next;
    }
}
