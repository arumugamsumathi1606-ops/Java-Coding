package Arrays;
import java.util.Arrays;
public class ReverseDuplicateArray {
    public static void main(String[] args) {
        int arr[] = {919, 22, 73, 574, 3335, 22, 574, 919};

        Arrays.sort(arr);
        System.out.println("Sorted array: ");
        System.out.print(arr[0] + " ");
        for (int i = 1; i < arr.length; i++) 
            {
             if (arr[i] != arr[i-1])
        {
            System.out.print(arr[i] + " ");
        }
        }
       
    }
}
