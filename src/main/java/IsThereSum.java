import java.util.Arrays;

public class IsThereSum {
    /**
     * Check if there exist two numbers in an array add up to some other number.
     * You will likely need a for loop nested inside of another for loop for this problem - each for loop checking
     * sums of two different indexes of arr.
     *
     * @param arr an array of ints.
     * @param target a hypothetical sum of two numbers.
     * @return true if two separate values in the array add up to a target, false otherwise.
     */
    public boolean check(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left < right)
        {
            if(arr[left] + arr[right] > target)
            {
                right--;
            }
            else if(arr[left] + arr[right] < target)
            {
                left++;
            }
            else
            {
                return true;
            }
        }

        return false;
    }
}
