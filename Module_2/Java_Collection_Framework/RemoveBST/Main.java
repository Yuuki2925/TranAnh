public class Main {
    public static void main(String[] args) {
        RemoveBST tree = new RemoveBST();

        // Tạo cây BST
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        System.out.println("Cây BST ban đầu:");
        tree.inorder(root);
        System.out.println("\n");

        // Xóa một số node
        root = tree.removeNode(root, 20);
        System.out.println("Sau khi xóa node 20:");
        tree.inorder(root);
        System.out.println("\n");

        root = tree.removeNode(root, 30);
        System.out.println("Sau khi xóa node 30:");
        tree.inorder(root);
        System.out.println("\n");

        root = tree.removeNode(root, 50);
        System.out.println("Sau khi xóa node 50:");
        tree.inorder(root);
        System.out.println("\n");
    }
}