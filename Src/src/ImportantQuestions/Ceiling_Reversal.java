package ImportantQuestions;

import java.util.Arrays;
import java.util.Scanner;

// the arrays is arranged in the reverse order ie in descending order
public class Ceiling_Reversal {
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
        System.out.printf("the ceiling element with respect to the target element %d is %d ",target,ceiling_reverse(arr,target));

    }
    static int ceiling_reverse(int[] arr , int target)
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
        return end; // cause ceiling in reverse order


    }

    // dont get confused about the ceiling and the floor
    // in normal sorted array
    // ceiling ---> start pointer
    // floor ---> end pointer

}
