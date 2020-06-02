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

class Iterative
{
    void postOrderIterative(Node root)
    {
    Stack<Node> s1 = new Stack<Node>();
    Stack<Node> s2 = new Stack<Node>();

    if(root == null)
        return;

    //push root into 1st stack
    s1.push(root);

    while(!s1.empty())
    {   
        //pop from s1 and push to s2
        Node temp = s1.pop();
        s2.push(temp);

        //push left and right child of popped item to s1
        if(temp.left != null)
            s1.push(temp.left);

        if(temp.right != null)
            s1.push(temp.right);

        
    }
    
    //print all elements of 2nd stack
    while(!s2.empty())
    {
        Node temp = s2.pop();
        System.out.print(temp.data + " ");
    }
    }

public static void main(String[] args)
{
    Iterative obj = new Iterative();
    Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
    obj.postOrderIterative(root);
}
}