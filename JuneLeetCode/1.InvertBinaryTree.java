//recursive

public TreeNode invertTree(TreeNode root) {
    if (root == null) {
        return null;
    }
    TreeNode right = invertTree(root.right);    //goes until right leaf node
    TreeNode left = invertTree(root.left);      //goes until right leaf node of left subtree
    root.left = right;
    root.right = left;      //swap left and right child
    return root;
}


//iterative

//we use level order traversal technique where we
//traverse each node and when an element is popped
//, we swap its children 
//and then we add its children to the queue

public TreeNode invertTree(TreeNode root) {
    if (root == null) return null;
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);
    while (!queue.isEmpty()) {
        TreeNode current = queue.poll();
        TreeNode temp = current.left;
        current.left = current.right;
        current.right = temp;
        if (current.left != null) queue.add(current.left);
        if (current.right != null) queue.add(current.right);
    }
    return root;
}