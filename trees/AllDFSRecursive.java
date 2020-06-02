class Node
{
	int data;
	Node left;
	Node right;
	
	Node(){}

	Node(int data)
	{
		this.data = data;		
		this.left = null;
		this.right = null;
	}

	int getData()
	{
		return data;
	}

	void setData(int data)
	{
		this.data = data;
	}

	Node getLeft()
	{
		return this.left;
	}

	void setLeft(Node left)
	{
		this.left = left;
	}

	Node getRight()
	{
		return this.right;
	}

	void setRight(Node right)
	{
		this.right = right;
	}
}

public class BinaryTree
{
	Node root;

	public void printPostOrder(Node node)
	{
		if(node == null)
			return;

		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println("Key is " + node.data);

	}

	public void printPreOrder(Node node)
	{
		if(node == null)
			return;

		System.out.println("Key is " + node.data);
		printPreOrder(node.left);
		printPreOrder(node.right);
		
	}

	public void printInOrder(Node node)
	{
		if(node == null)
			return;

		
		printInOrder(node.left);
		System.out.println("Key is " + node.data);
		printInOrder(node.right);
	}

	public static void main(String[] args)
{

	BinaryTree tree = new BinaryTree();
	tree.root = new Node(1);
	tree.root.left = new Node(2);
	tree.root.right = new Node(3);
	tree.root.left.left = new Node(4);
	tree.root.left.right = new Node(5);

	System.out.println("Preorder traversal of binary tree is "); 
        tree.printPreOrder(tree.root); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInOrder(tree.root); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.printPostOrder(tree.root); 

	/*bst.insert(root, 15);
	bst.insert(root, 10);
	bst.insert(root, 20);
	*/
	//bst.insert(root, 15);
}

void insert(Node root, int data)
{
	if(root == null)
	{
		root = new Node(data);
	}
	else
	{
		insertHelper(root, data);
	}
}

void insertHelper(Node root, int data)
{
	if(root.data >= data)
	{
		if(root.left == null)
		{
			root.left = new Node(data);
		}
		else
		{
			insertHelper(root.left, data);
		}
	}
	else
	{
		if(root.right == null)
		{
			root.right = new Node(data);
		}

		else
		{
			insertHelper(root.right, data);
		}
	}
}
}
	