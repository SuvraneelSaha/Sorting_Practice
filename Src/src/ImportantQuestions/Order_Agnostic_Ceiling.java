package ImportantQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Order_Agnostic_Ceiling {
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
        System.out.printf("the ceiling element with respect to the target element %d is %d ", target, order_agnostic_ceiling(arr, target));

    }

    static int order_agnostic_ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isasc;
        if (arr[0] < arr[end]) {
            isasc = true;
        } else {
            isasc = false;
        }
        if (isasc) {
            return isascen(arr, target);
        } else {
            return notasc(arr, target);
        }
    }

    static int isascen(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target>arr[end])
        {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return start;
    }

    static int notasc(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return end;
        // role reversal
    }
}
// actually
// ceiling - start
// floor - end

