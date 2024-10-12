public class TSTNode {
    private boolean isWord = false;
    private TSTNode right;
    private TSTNode middle;
    private TSTNode left;
    private char letter;

    // Constructor takes in a char value
    public TSTNode(char letter) {
        this.letter = letter;
    }

    // Getters and setters for instance variables initialized
    boolean isWord() {
        return isWord;
    }

    // Sets word as true if the method is called
    void setWord() {
        isWord = true;
    }

    public void setLetter (char letter) {
        this.letter = letter;
    }

    public TSTNode getLeft() {
        return this.left;
    }

    // Creates new TST Node for the left letter and sets the value to the letter
    public void setLeft(char left) {
        this.left = new TSTNode(left);
    }

    public TSTNode getMiddle() {
        return this.middle;
    }

    public void setMiddle(char middle) {
        this.middle = new TSTNode(middle);
    }

    public TSTNode getRight() {
        return this.right;
    }

    public void setRight(char right) {
        this.right = new TSTNode(right);
    }

    public char getLetter() {
        return this.letter;
    }
}
