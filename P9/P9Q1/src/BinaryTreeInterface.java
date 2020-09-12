
public interface BinaryTreeInterface<T> {

    /**
     * * Task: Gets the data in the root node.
     */
    public T getRootData();

    /**
     * * Task: Sees whether the list is empty. * * @return true if the list is
     * empty, or false if not
     */
    public boolean isEmpty();

    /**
     * * Task: Removes all entries from the tree.
     */
    public void clear();

    /**
     * * Task: Sets an existing binary tree to a new one-node binary tree. * *
     * @param rootData an object that is the data in the new tree's root
     */
    public void setTree(T rootData);

    /**
     * * Task: Sets an existing binary tree to a new binary tree. *
     * Precondition: leftTree and rightTree are different trees. * * @param
     * rootData an object that is the data in the new tree's root * @param
     * leftTree the left subtree of the new tree * @param rightTree the right
     * subtree of the new tree *
     */
    public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree);
}
