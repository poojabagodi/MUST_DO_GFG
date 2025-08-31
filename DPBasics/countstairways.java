package DPBasics;

public class countstairways {
    //Memoization
    public static int countWays(int n) {
        int[] memo = new int[n + 1];
        return countWaysUtil(n, memo);
    }

    private static int countWaysUtil(int n, int[] memo) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        if (memo[n] != 0) return memo[n];
        memo[n] = countWaysUtil(n - 1, memo) + countWaysUtil(n - 2, memo);
        return memo[n];
    }

    //Tabulation
    public static int countWaysTab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            if (i - 2 >= 0) dp[i] += dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(countWays(n));
        System.out.println(countWaysTab(n));
    }
}
