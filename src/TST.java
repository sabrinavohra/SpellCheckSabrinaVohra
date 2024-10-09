public class TST {
    private Node root;

    public TST() {
        root = new Node();
    }

    public void insert(String s) {
        Node current = root;
        int i = 0;
        while(i <= s.length()) {
            int j = s.charAt(i);
            if(current.next[j].equals(j)) {
                current = current.next[j];
                i++;
            }
            if(current.next[j] )
        }
    }

    public void lookup() {

    }
}
