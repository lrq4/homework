public class RevertedNumber {
    public boolean isPalindrome(int x) {
        // 小于0的整数与个位数为0的整数一定不是回文数
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当x为奇数位数字时，可以通过 revertedNumber / 10 去除中间位
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
