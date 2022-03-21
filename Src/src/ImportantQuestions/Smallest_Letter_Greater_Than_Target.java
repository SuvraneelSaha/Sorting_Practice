package ImportantQuestions;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {

    }
    static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end  = arr.length-1;
        while (start<=end)
        {
            int mid = start + (end - start)/2;
            if(target<arr[mid])
                // always start up with the lowest possible thing or to be more precisely
            // the condition
            {
                end = mid -1 ;
            }
            else
            {
                start = mid + 1 ;
            }

        }
        return arr[start%arr.length];
        // or
        // use this
//         if(start == arr.length)
//        {
//            return arr[0];
//        }
//        else
//        {
//            return arr[start];
//        }
    }
}
