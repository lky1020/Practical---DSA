
public class BinaryTree<T> implements BinaryTreeInterface<T> {

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(T rootData) {
        root = new Node(rootData);
    }

    public BinaryTree(T rootData, BinaryTreeInterface leftTree, BinaryTreeInterface rightTree) {
        privateSetTree(rootData, (BinaryTree) leftTree, (BinaryTree) rightTree);
    }

    public void setTree(T rootData) {
        root = new Node(rootData);
    }

    public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree) {
        privateSetTree(rootData, (BinaryTree) leftTree, (BinaryTree) rightTree);
    }

    private void privateSetTree(T rootData, BinaryTree leftTree, BinaryTree rightTree) {
        root = new Node(rootData);
        if ((leftTree != null) && !leftTree.isEmpty()) {
            root.setLeft(leftTree.root);
        }
        if ((rightTree != null) && !rightTree.isEmpty()) {
            root.setRight(rightTree.root);
        }
    }

    public T getRootData() {
        T rootData = null;
        if (root != null) {
            rootData = root.data;
        }
        return rootData;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void clear() {
        root = null;
    }

    protected void setRootData(T rootData) {
        root.data = rootData;
    }

    protected void setRootNode(Node rootNode) {
        root = rootNode;
    }

    protected Node getRootNode() {
        return root;
    }

    public void postorderTraverse() {
        postorderTraverse(root);
        System.out.println("\n");
    }

    private void postorderTraverse(Node node) {
        if (node != null) {
            postorderTraverse(node.getLeft());
            postorderTraverse(node.getRight());
            System.out.print(node.data + " ");
        }
    }

    private class Node {

        private T data;
        private Node left;
        private Node right;

        public Node() {
            this(null);
        }

        public Node(T data) {
            this(data, null, null);
        }

        public Node(T data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public boolean hasLeft() {
            return left != null;
        }

        public boolean hasRight() {
            return right != null;
        }

        public boolean isLeaf() {
            return (left == null) && (right == null);
        }
    }
}
