class Solution {
    public boolean checkDivisibility(int n) {
        
        int sum=0;
        int product =1;
        int a=n;

        while (n > 0) {
            int digit = n % 10;

            sum+=digit;
            product*=digit;

            n /= 10;
        }

        return a% (sum + product) == 0;

    }
}