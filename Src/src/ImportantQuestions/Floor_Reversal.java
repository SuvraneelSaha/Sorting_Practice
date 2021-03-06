package ImportantQuestions;

import java.util.Arrays;
import java.util.Scanner;

// the array is arranged in descending order
// and we have to dinf the floor element according to the target element
public class Floor_Reversal {
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
        System.out.printf("the floor element with respect to the target element %d is %d ",target,floor_reverse(arr,target));


    }
    static int floor_reverse(int[] arr , int target) // these are known as parameters and the
            // values that are passed are known as arguments

            // as the array is reversed soo
    // ex - 55 44 33 22 11 ; t - 25 floor - 22
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                end = mid -1 ;
            } else if (target < arr[mid]) {
                start = mid + 1 ;
            } else {
                return mid;
            }

        }
        return start; // cause floor

    }
    // ex - 55 44 33 22 11 ; t - 25 floor - 22

}
