public class TST {
    private TSTNode root;

    public TST() {
        root = new TSTNode('m');
    }

    public void insert(String s) {
        TSTNode current = root;
        int i = 0;
        while(i < s.length()) {
            char j = s.charAt(i);
            if(current.getLetter() == j) {
                if(current.getMiddle() == null) {
                    current.setMiddle(s.charAt(i));
                }
                current = current.getMiddle();
                i++;
            }
            else if(j > current.getLetter()) {
                if(current.getRight() == null) {
                    current.setRight(s.charAt(i));
                }
                current = current.getRight();
            }
            else if(j < current.getLetter()) {
                if(current.getLeft() == null) {
                    current.setLeft(s.charAt(i));
                }
                current = current.getLeft();
            }
        }
        current.setWord(true);
    }

    public boolean lookup(String s) {
        TSTNode current = root;
        int i = 0;
        while(i < s.length()) {
            int j = s.charAt(i);
            if(current == null) {
                return false;
            }
            else if (current.getLetter() == j) {
                current = current.getMiddle();
                i++;
            }
            else if(j > current.getLetter()) {
                current = current.getRight();
            }
            else if(j < current.getLetter()) {
                current = current.getLeft();
            }
        }
        if(current == null) {
            return false;
        }
        return current.isWord();
    }
}
