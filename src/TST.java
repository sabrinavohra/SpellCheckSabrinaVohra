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
                current.setMiddle(s.charAt(i + 1));
                i++;
            }
            else if(j > current.getMiddle().getLetter()) {
                if(current.getRight() == null) {
                    current.setRight(s.charAt(i + 1));
                }
                else {
                    current = current.getRight();
                }
            }
            else if(j < current.getMiddle().getLetter()) {
                if(current.getLeft() == null) {
                    current.setLeft(s.charAt(i + 1));
                }
                else {
                    current = current.getLeft();
                }
            }
        }
    }

    public void lookup() {

    }
}
