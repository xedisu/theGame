package proj2;

public class Utils {

    protected static boolean isPerfectNumber(int nr) {
        int sum = 0;
        for (int i = 1; i < nr; i++) {
            if (nr % i == 0) {
                sum = sum + i;
            }
        }
        return sum == nr;
    }

    protected static boolean isPrimeNumber(int nr) {
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

    public static boolean isMagicNr(int nr) {
        while (nr > 10) {
            nr= numberDowngrade(nr);
//            System.out.println(maybeMagic);
        }

        if (nr == 3 || nr == 7 || nr == 9) {
            return true;
        }
        return false;
    }

    public static int numberDowngrade(int number) {
        int downgradedNumber = 0;

        while (number > 0) {
            downgradedNumber += number % 10;
            number /= 10;
        }
//        System.out.println(downgradedNumber);
        return downgradedNumber;
    }
}
