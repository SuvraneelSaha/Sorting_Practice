package Bolier_Plate_code;

import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("OG array--> ");
        System.out.println(Arrays.toString(arr));

        System.out.println("please enter the target element :");
        int target = in.nextInt();

        System.out.println("the index of the target element is " + OrderAgnosticBS(arr,target));



    }

    static int OrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc;
        if (arr[0] < arr[end]) // cause end = arr.length-1
        {
            isAsc = true;
        } else {
            isAsc = false;
        }
        while (start <= end)
        {
            int mid = start + (end - start) / 2;

            // case 1 : the target element is the middle element
            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc)
            {
                if (target > arr[mid])
                {
                    start = mid + 1;
                } else
                {
                    end = mid - 1;
                }
            }
            else
            {
                if (target < arr[mid])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }

            }

        }
        return -1;
    }
}
