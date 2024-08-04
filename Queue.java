import java.util.Stack;

public class Queue{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        
        int front=0;
        int rear=-1;
        int size=0;
        int capacity=5;
        
        public void enqueue(int[] arr, int n) //adds element
        {
            if(arr.length==capacity)
                {
                    System.out.println("Max size reached");
                    return;
                }
            else{
                rear++;
                arr[rear]=n;
                size++;
            }
        }
        
        public int dequeue(int[] arr) //removes and returns first element
        {
            if(isEmpty(arr))
            {
                System.out.println("Queue is empty");
                return;
            }
            else
            {
               int n = arr[front];
               front++;
               size--;
                return n;
                
            }
        }
        
        public int peek(int[] arr) //returns last element
        {
            if(isEmpty(arr))
            {
                System.out.println("no elements in queue");
                return;
            }
            else{
                return arr[front];
            }
        }
        
        public boolean isEmpty(int[] arr)
        {
            return size==0;
        }
    }
}
