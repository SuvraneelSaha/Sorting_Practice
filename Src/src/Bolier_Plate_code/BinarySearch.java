package Bolier_Plate_code;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args)
    {
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

            if(target>arr[mid])
            {
                start = mid+1;
            }
            else if(target<arr[mid])
            {
                end = mid - 1 ;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    // CASE 1 :  // THE TARGET ELEMENT WILL LIE ON THE RIGHT SIDE
    // CASE 2 :   // THE TARGET ELEMENT WILL LIE ON THE LEFT HAND SIDE
    // CASE 1 :     // THE TARGET ELEMENT WILL BE THE MIDDLE ELEMENT ONLY


}

