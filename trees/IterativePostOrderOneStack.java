import java.util.Stack;
import java.util.ArrayList;

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
    //ArrayList<Integer> list = new ArrayList<Integer>();

    void postOrderIterative(Node node)
    {
        Stack<Node> stack = new Stack<Node>();
        
        //check for empty tree
        if(node == null)
            return;

        stack.push(node);
        Node prev = null;
        while(!stack.empty())
        {
            Node current = stack.peek();

            //go down the tree in search of a leaf, if exists then process it and pop stack otherwise
            //move down

            if(prev == null || prev.left == current || prev.right == current)
            {
                if(current.left != null)
                    stack.push(current.left);

                else if(current.right != null)
                    stack.push(current.right);

                else
                {
                    stack.pop();
                    System.out.print( current.data + " ");
                }
            }

            /* go up the tree from left node, if the child is right,
            push it into stack otherwise process parent and pop stack */
            else if(current.left == prev)
            {
                if(current.right != null)
                    stack.push(current.right);

                else
                {
                    stack.pop();
                    System.out.print( current.data + " ");
                }
            }

            else if(current.right == prev)
            {
                stack.pop();
                System.out.print( current.data + " ");
            }

            prev = current;
        }
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree(); 
   
        // Let us create trees shown in above diagram 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
   
        /*ArrayList<Integer> mylist = */
           
        System.out.println("Post order traversal of binary tree is :"); 
        tree.postOrderIterative(tree.root); 
        //System.out.println(mylist); 
    }
}