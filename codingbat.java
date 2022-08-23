public class codingbat {
    public static void main (String[] args) {
        System.out.println(sum3([1, 2, 3]) == 6, sum3([5, 11, 2]) == 18, sum3([7, 0, 0]) == 7)
    }

public static int sum3(int[] nums) {
    int res = 0;
    for (int i=0;i<nums.length()i++;) {
        res += i;
    }
    return res;
}
}