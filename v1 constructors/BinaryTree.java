public class BinaryTree{
     // Root of Binary Tree
     Node root;
     
     // Constructors
     BinaryTree(int key){root = new Node(key);}
     BinaryTree() {root = null;}

     public void insert(int key) {
          root = insertRec(root, key);
      }
  
      private Node insertRec(Node root, int key) {
          if (root == null) {
              root = new Node(key);
              return root;
          }
  
          if (key < root.key) {
              root.left = insertRec(root.left, key);
          } else if (key > root.key) {
              root.right = insertRec(root.right, key);
          }
          return root;
      }
}