public class Bubble{
    
    public static int[] bubble(int[] arr)
    {
        int n = arr.length;
        
        for(int i = 0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[ j ] > arr[ j + 1 ])
                {
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
            }
        }
        
        return arr;
        
    }
    public static void main(String[] args)
    {
        int[] test = {2,3,1,5,6,10};
        
        int[] result = bubble(test);
        
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
}
