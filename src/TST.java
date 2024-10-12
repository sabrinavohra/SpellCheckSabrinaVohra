public class TST {
    private TSTNode root;

    public TST() {
        // Sets root instance variable to 'm' because it's the middle letter in the alphabet
        root = new TSTNode('m');
    }

    // Method inserts a new word into the TST
    public void insert(String s) {
        TSTNode current = root;
        int i = 0;
        // Moves through while loop until all the letters in the word have been added
        while(i < s.length()) {
            // Holds current letter
            char j = s.charAt(i);
            // If the current Node's letter is equal to j, and the node below is null, the middle node will be set to j
            if(current.getLetter() == j) {
                if(current.getMiddle() == null) {
                    current.setMiddle(j);
                }
                // No matter if the middle TST Node is null, the current Node will become the middle.
                current = current.getMiddle();
                i++;
            }
            // Follows process for if the value of j is greater than the value of the current TST node
            else if(j > current.getLetter()) {
                if(current.getRight() == null) {
                    current.setRight(j);
                }
                current = current.getRight();
            }
            // Follows process for if the value of j is less than the current TST Node
            else if(j < current.getLetter()) {
                if(current.getLeft() == null) {
                    current.setLeft(j);
                }
                current = current.getLeft();
            }
        }
        // Sets the current word to true if the while loop has closed (meaning the word has been completely added)
        current.setWord();
    }

    // Method checks if a word is already in the TST
    public boolean lookup(String s) {
        TSTNode current = root;
        int i = 0;
        // Moves through the while loop until the whole word has been passed through
        while(i < s.length()) {
            int j = s.charAt(i);
            if(current == null) {
                return false;
            }
            // Continues to move through the word if the current letter matches the node's value
            else if (current.getLetter() == j) {
                current = current.getMiddle();
                i++;
            }
            // Checks if the current letter is greater than the current node's value, and changes it to its value
            else if(j > current.getLetter()) {
                current = current.getRight();
            }
            // Checks if the current letter is less than the current node's value, and changes it to its value
            else if(j < current.getLetter()) {
                current = current.getLeft();
            }
        }
        // Checks for edge case before declaring word
        if(current == null) {
            return false;
        }
        // Returns true if the current Node is the end of a word
        return current.isWord();
    }
}
