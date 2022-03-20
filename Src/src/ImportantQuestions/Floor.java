package ImportantQuestions;

import java.util.Arrays;
import java.util.Scanner;
    // Returning the index of the floor element which is related to the target element 
public class Floor {
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

        System.out.printf("the index of the floor value of the target element %d is %d",target,floor(arr,target));

    }
    static int floor(int[] arr,int target)
    {
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
                return mid; // this is present cause of the presence of the condition that floor
                // is <=
                // if < was present then there would be no returning of the middle element
            }
        }
        return end;
    }
}
