package baitap2;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(8);
        bt.insert(3);
        bt.insert(10);
        bt.insert(9);
        //Duyet cay nhi phan theo posOder tinh tu node root
//        bt.posOder(bt.getRoot());
        //Duyet cay nhi phan theo preOder
        bt.preOder(bt.getRoot());
        //Tim kiem gai tri 10 co ton tai trong bt
        boolean exitKey =  BinaryTree.searchNodeByKey(bt.getRoot(),10);
       if (exitKey){
           System.out.println("Yes");
       }else {
           System.out.println("Not Found");
       }
    }
}
