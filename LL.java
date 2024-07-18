class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    public void insertLast(int d) {
        Node node = new Node();
        node.data = d;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertFirst(int d) {
        Node node = new Node();
        node.data = d;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }
    
    public void insert(int index,int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(head==null)
        {
            insertFirst(data);
        }
        
        else
        {
             Node n = head;
                
            for(int i = 0;i < index-2;i++)
            {
               
                n = n.next;
            }
            
            node.next = n.next;
            
            n.next = node;
            
            
        }
    }
    
    public void delete(int index)
    {
        Node n = head;
        
        Node n1;
        
        for(int i = 0;i<index-2;i++)
        {
            n = n.next;
        }
        
        n1 = n.next;
        
        n.next = n1.next;
        
        n1 = null;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }
}

public class LL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(5);
        list.insert(2,0);
        list.delete(2);
        list.display();
    }
}
