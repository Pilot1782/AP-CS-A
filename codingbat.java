/*Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)


split53([1, 1]) → true
split53([1, 1, 1]) → false
split53([2, 4, 2]) → true0
 */

public class codingbat {
    public static void main (String[] args) {
        System.out.println(split53(new int[] {1, 1}));
        System.out.println(split53(new int[] {1, 1, 1}));
        System.out.println(split53(new int[] {2, 4, 2}));
    }

public static boolean split53(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
    }
    if (sum % 5 == 0 && sum % 3 == 0) {
        return true;
    }
    if (sum % 5 == 0) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0) {
                return false;
            }
        }
        return true;
    }
    if (sum % 3 == 0) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 5 != 0) {
                return false;
            }
        }
        return true;
    }
    return false;
}
}
