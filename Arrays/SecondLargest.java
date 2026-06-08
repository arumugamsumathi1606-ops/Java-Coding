package Arrays;
public class SecondLargest {
    public static void main(String[] args)
    {
        int[] arr = {2, 4, 8, 24, 7, 36};
        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        
        for (int i=0 ; i<arr.length ; i++)
        {
            if (arr[i] > Largest)
            {
                SecondLargest = Largest;
                Largest = arr[i];
            }

            else
            {
                if (arr[i] > SecondLargest && arr[i] != Largest)
                {
                    SecondLargest = arr[i];
                } 
            }
           
        }
 System.out.println("Second largest element: " + SecondLargest);
        
    }
    
}
