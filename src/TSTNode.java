public class TSTNode {
    private static final int NUM_CHARS = 255;
    private boolean isWord = false;
    private TSTNode right;
    private TSTNode middle;
    private TSTNode left;
    private char letter;

    public TSTNode() {
    }

    public TSTNode(char letter) {
        this.letter = letter;
    }
    boolean isWord() {
        return isWord;
    }

    void setWord(boolean end) {
        isWord = end;
    }

    public void setLetter (char letter) {
        this.letter = letter;
    }

    public TSTNode getLeft() {
        return this.left;
    }

    public void setLeft(char lletter)
    {
        letter = lletter;
    }

    public TSTNode getMiddle() {
        return this.middle;
    }

    public void setMiddle(char mletter) {
        letter = mletter;
    }

    public TSTNode getRight() {
        return this.right;
    }

    public void setRight(char rletter) {
        letter = rletter;
    }

    public char getLetter() {
        return this.letter;
    }
}
