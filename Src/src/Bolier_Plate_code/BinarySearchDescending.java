package Bolier_Plate_code;

import java.util.Arrays;
import java.util.Scanner;
// Descending order binary search
// ex - 55 44 33 22 11 0
public class BinarySearchDescending {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements in the array:");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("OG array--> ");
        System.out.println(Arrays.toString(arr));

        System.out.println("please enter the target element :");
        int target = in.nextInt();

        System.out.println("the target element has the index of " + binarysearch(arr,target));
    }
    static int binarysearch(int[] arr , int target)
    {
        // BINARY SEARCH IN A SORTED ARRAY
        int start = 0 ;
        int end = arr.length-1 ;
        while (start<=end)
        {
            int mid = start + (end -start)/2;

            if(target>arr[mid]) // alternate can be sign change
            {
                end = mid -1 ; // og --> start = mid + 1
            }
            else if(target<arr[mid]) // alternate can be side change
            {
                start = mid + 1; // og --> end = mid -1
            }
            else
            {
                return mid; // middle element is the target element only
            }
        }
        return -1;
    }

}
