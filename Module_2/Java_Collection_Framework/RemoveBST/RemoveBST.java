public class RemoveBST {
    public RemoveBST() {
    }

    // Tìm node trái cùng của một cây
    private TreeNode findLeftMostNode(TreeNode root) {
        while (root != null && root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Xóa node trong BST
    public TreeNode removeNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = removeNode(root.left, key);
        } else if (key > root.val) {
            root.right = removeNode(root.right, key);
        } else { // root.val == key
            // TH1: Node là lá
            if (root.left == null && root.right == null) return null;

            // TH2 & TH3: Node có một con duy nhất
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // TH4: Node có hai con, tìm node trái cùng của cây con phải
            TreeNode leftMost = findLeftMostNode(root.right);
            root.val = leftMost.val;
            root.right = removeNode(root.right, leftMost.val);
        }
        return root;
    }

    // In cây theo thứ tự trung tố (Inorder)
    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }
}
