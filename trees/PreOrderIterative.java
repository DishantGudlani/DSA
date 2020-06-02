import java.util.Stack;

class Node
{
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree
{
    Node root;

    void preOrder(Node node)
    {
        if(node == null)
            return;

        Stack<Node> stack = new Stack<Node>();
        
        stack.push(root);

        while(!stack.empty())
        {
            Node current = stack.pop();
            System.out.print(current.data + " ");

            if(current.right != null)
                stack.push(current.right);

            if(current.left != null)
                stack.push(current.left);
        }
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(10); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(2); 
        tree.root.left.left = new Node(3); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(2); 
        tree.preOrder(tree.root); 
    }
}