class Solution {
    public static int subtractProductAndSum(int n) {
        int result = 0;
        int product = 1;
        int sum = 0;
        while(n !=0 ){
            sum += n%10;
            product *= n%10;
            n /=10;
        }
        result = product - sum;
        return result;
    }
}

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        int input = 234;
        int result = Solution.subtractProductAndSum(input);
        System.out.println(String.valueOf(result));
    }


}
