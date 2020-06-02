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

    void inOrder()
    {
        if(root == null)
            return;

        Stack<Node> stack = new Stack<Node>();
        Node curr = root;

        while(curr != null || stack.size() > 0)
        {
            while(curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            System.out.println(curr.data + " ");

            curr = curr.right;
        }
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.inOrder();
    }
}