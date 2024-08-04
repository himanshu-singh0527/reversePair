import java.util.Scanner;

class Solution {
    public int reversePairs(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((long) arr[i] > (long) 2 * arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}

public class ReversePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        int reversePairs = solution.reversePairs(nums);
        System.out.println("The number of reverse pairs is: " + reversePairs);
    }
}
