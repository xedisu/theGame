package theGame;
public class Utils {

    protected boolean isPerfectNumber(int nr) {
        int sum = 0;
        for (int i = 1; i < nr; i++) {
            if (nr % i == 0) {
                sum = sum + i;
            }
        }
        return sum == nr;
    }

     int calculateSumOfDigits(int nr) {
        int digit, sum = 0;
        while (nr > 0) {
            digit = nr % 10;
            sum += digit;
            nr /= 10;
        }
        return sum;
    }

    protected boolean isPrimeNumber(int nr) {
        int i, m = 0;

        m = nr / 2;
        if (nr == 0 || nr == 1) {
            return false;
        } else {
            for (i = 2; i <= m; i++) {
                if (nr % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}