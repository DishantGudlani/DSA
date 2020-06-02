class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        this.data = item;
        left = right = null;
    }

}

class BinaryTree
{
    Node root;

    public BinaryTree()
    {
        root = null;
    }
    
    void printLevelOrder()
    {
        int h = height(root);
        for(int i = 1; i <= h; i++)
            printGivenLevel(root, i);
    }

    void printGivenLevel(Node root, int level)
    {
        if(root == null)
            return;

        if(level == 1)
            System.out.print(root.data + " ");

        else if(level > 1)
        {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    int height(Node root)
    {
        if(root == null)
            return 0;

        else
        {
            int Lheight = height(root.left);
            int Rheight = height(root.right);

            if(Lheight > Rheight)
                return Lheight + 1;

            else
                return Rheight + 1;
        }
    }

    

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(7);
        tree.root.left = new Node(6);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(2);
        tree.root.right.right = new Node(1);

        System.out.println("Level Order Traversal: ");
        tree.printLevelOrder();
    }
}

