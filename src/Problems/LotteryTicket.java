package Problems;

public class LotteryTicket {
    public static int lotteryCoupons(int n, int maxCouponNumber) {
        int[] hash = new int[10];
        for (int i = 1; i <= n; i++) {
            hash[getDigitSum(i)]++;
        }
        int maxCouponCount = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == maxCouponNumber) {
                maxCouponCount++;
            }
        }
        return maxCouponCount;
    }

    public static int getDigitSum(int n) {
        while (true) {
            n = getDigitSumHelper(n);
            if (n >= 0 && n <= 9) {
                return n;
            }
        }
    }

    public static int getDigitSumHelper(int n) {
        if (n == 0)
            return 0;
        return n % 10 + getDigitSumHelper(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(lotteryCoupons(12, 2));
    }
}
