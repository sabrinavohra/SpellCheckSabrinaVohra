public class TSTNode {
    private static final int NUM_CHARS = 255;
    private boolean isWord = false;
    private TSTNode right;
    private TSTNode middle;
    private TSTNode left;
    private char letter;

    public TSTNode(char letter) {
        this.letter = letter;
    }

    boolean isWord() {
        return isWord;
    }

    void setWord(boolean end) {
        isWord = end;
    }

    public TSTNode getLeft() {
        return this.left;
    }

    public TSTNode getMiddle() {
        return this.middle;
    }

    public TSTNode getRight() {
        return this.right;
    }

    public char getLetter() {
        return this.letter;
    }
}
