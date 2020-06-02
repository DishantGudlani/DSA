public class HelloWorld
{

     public static void main(String []args)
     {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(50);
        list.insert(15);
        list.insertAtStart(100);
        list.insertAtStart(150);
        
        list.show();
        System.out.println("----------");
        
        list.insertAt(3, 200);
        list.show();
     }
}

 class LinkedList
{
    Node head;
    
    void insert(int number)
    {
        Node node = new Node();
        node.data = number;
        node.next = null;
        
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node n = this.head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    void insertAtStart(int number)
    {
        Node node = new Node();
        node.data = number;
        node.next = this.head;
        this.head = node;
        
    }
    void insertAt(int index, int number)
    {
        if(index == 0)
            insertAtStart(number);
        else
        {
        Node node = new Node();
        node.data = number;
        
        Node n = this.head;
        for(int i = 0; i < index - 1; i++)
        {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
        }
        
    }
    void show()
    {
        Node node = this.head;
        while(node.next!= null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data); //to print last node's data whose next is null
    }
}

class Node
{
    int data;
    Node next;
}