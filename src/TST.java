public class TST {
    private TSTNode root;

    public TST() {
        root = new TSTNode();
    }

    public void insert(String s) {
        TSTNode current = root;
        int i = 0;
        while(i <= s.length()) {
            char j = s.charAt(i);
            if(current.getMiddle() == null) {
                current.setMiddle(s.charAt(i));
                i++;
            }
            else if(j > current.getMiddle().getLetter()) {
                if(current.getRight() == null) {
                    current.setRight(s.charAt(i));
                }
                else {
                    current = current.getRight();
                }
            }
            else if(j < current.getMiddle().getLetter()) {
                if(current.getLeft() == null) {
                    current.setLeft(s.charAt(i));
                }
                else {
                    current = current.getLeft();
                }
            }
        }
    }

    public boolean lookup(String s) {
        TSTNode current = root;
        int i = 0;
        while(i <= s.length()) {
            int j = s.charAt(i);
            if(current.getMiddle() == null) {
                return false;
            }
            else if(j > current.getMiddle().getLetter()) {
                if(current.getRight() == null) {
                    current.setRight(s.charAt(i + 1));
                    i++;
                }
                else {
                    current = current.getRight();
                }
            }
            else if(j < current.getMiddle().getLetter()) {
                if(current.getLeft() == null) {
                    current.setLeft(s.charAt(i + 1));
                    i++;
                }
                else {
                    current = current.getLeft();
                }
            }
        }
        return current.isWord();
    }
}
