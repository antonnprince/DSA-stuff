class Node{
    int data;
    Node next;
}


class LinkedList{
    Node head;
    
    public void insertLast(int d)
    {
        Node node = new Node();
        node.data = d;
        node.next=null;
        
        if(head==null)
        {
            head = node;
            return;
        }
        else
        {
            Node n = head;
            
            while(n.next!=null)
            {
                n = n.next;
            }
            
            n.next = node;
            node.next=null;
            return;
        }
    }
    
    public void insertFirst(int d)
    {
        Node node = new Node();
        node.data = d;
        node.next = null;
        
        
        node.next = head;
        head=node;
    }  
    
    public void insertNode(int index, int d)
    {
        Node node = new Node();
        node.data = d;
        node.next=null;
        Node n = head;
        
        if(index==0)
        {
           node.next=head;
           head = node;
           return;
        }
        
        
        for(int i=0;i<index-1;i++)
        {
            if(n.next==null)
            return;
            
            
            n=n.next;
        }
        
        node.next = n.next;
        n.next=node;        
    }
    
    public void deleteLL(int index)
    {
        Node n = head;
        Node n1;
        
        for(int i=0;i<index;i++)
        {
            n=n.next;
        }
        n1=n.next;
        n.next=n1.next;
        n1=null;
    }
    public void displayList()
    {
        Node n = head;
        while(n!=null)
        {   
            System.out.println(n.data);
            n = n.next;
        }
    }
}

public class LL
{
	public static void main(String[] args) {
	    
	    LinkedList l = new LinkedList();
	    l.insertFirst(1);
	    l.insertFirst(0);
	    l.insertLast(2);
	    
	   // l.deleteLL(2);
	   l.insertNode(2,1000);
	   System.out.println("New after insertion is ");
	   l.displayList();
	}
}
