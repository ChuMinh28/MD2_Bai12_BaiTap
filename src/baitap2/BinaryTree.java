package baitap2;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node insertNode(Node current, int value) {
        if (current == null) {
            current = new Node(value);
            return current;
        } else {
            if (value < current.getValue()) {
                current.setLeft(insertNode(current.getLeft(), value));
            } else if (value > current.getValue()) {
                current.setRight(insertNode(current.getRight(), value));
            } else {
                return current;
            }
        }
        return current;
    }

    public void insert(int value) {
        this.root = insertNode(this.root, value);
    }
    public void posOder(Node node){
        if (node!=null){
            //Duyet cac node ben cay trai
            posOder(node.getLeft());
            //Duyet cac node ben cay phai
            posOder(node.getRight());
            System.out.println(node.getValue()+"");
        }
    }
    public static boolean searchNodeByKey(Node node, int key){
        if (node==null){
            return false;
        }
        if (key==node.getValue()){
            return true;
        } else if (key<node.getValue()) {
           return searchNodeByKey(node.getLeft(),key);
        }else {
           return searchNodeByKey(node.getRight(),key);
        }
    }
    public void preOder(Node node) {
        if (node!=null){
            node.getValue();
            preOder(node.getLeft());
            preOder(node.getRight());
            System.out.println(node.getLeft());
        }
    }
}
