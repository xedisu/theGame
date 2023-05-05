package proj2;

public class LazyNumberDetails {

    private int number;
    private boolean isPrimeNumber;
    private boolean isPerfectNumber;
    private boolean isMagicNumber;

    private boolean isPrimeMethodCalled;
    private boolean isPerfectMethodCalled;
    private boolean isMagicMethodCalled;

    
    public LazyNumberDetails(int number) {
        this.number = number;
        isPrimeNumber = false;
        isPerfectNumber = false;
        isMagicNumber = false;

        isPrimeMethodCalled = false;
        isPerfectMethodCalled = false;
        isMagicMethodCalled = false;

    }

	public void updateNumber(int number) {
        if (this.number != number) {
            this.number = number;
            System.out.println("new number = " + number);
            isPrimeNumber = false;
            isPerfectNumber = false;
            isMagicNumber = false;
            isPrimeMethodCalled = false;
            isPerfectMethodCalled = false;
            isMagicMethodCalled = false;
        }
    }

    public boolean isPrime() {
        if (isPrimeMethodCalled) {
            System.out.println("Prime cached version returned");
            return isPrimeNumber;
        } else {
            isPrimeNumber = Utils.isPrimeNumber(number);
            isPrimeMethodCalled = true;
            System.out.println("Prime computation version returned");
            return isPrimeNumber;
        }
    }

    public boolean isPerfect() {
        if (isPerfectMethodCalled) {
            System.out.println("Perfect cached version returned");
            return isPerfectNumber;
        } else {
            isPerfectNumber = Utils.isPerfectNumber(number);
            System.out.println("Perfect computation version returned");
            isPerfectMethodCalled = true;
            return isPerfectNumber;
        }
    }

    public boolean isMagic() {
        if (isMagicMethodCalled) {
            System.out.println("Magic cached version returned");
            return isMagicNumber;
        } else {
            isMagicNumber = Utils.isMagicNr(number);
            System.out.println("Magic computation version returned");
            isMagicMethodCalled = true;
            return isMagicNumber;
        }
    }
}
