package Arrays;

import java.util.HashMap;

public class FindDuplicate {
    public static void main(String[] args)
    {
        int[] arr = {2, 4, 8, 24, 8, 36, 4};
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0 ; i<arr.length ; i++)
    {
        if(map.containsKey(arr[i]))
    {
        count++;
        System.out.println("Duplicate element: " + arr[i] + " Count: " + count);
        }
        else
        {
            map.put(arr[i], 1);
        }
    }
        System.out.println("Total duplicate count: " + count);
}
}
