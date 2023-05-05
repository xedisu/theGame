package proj2;
public class Main {
    public static void main(String[] args) {

        LazyNumberDetails testNumber = new LazyNumberDetails(12);

        System.out.println(testNumber.isPrime());
        System.out.println(testNumber.isPrime());
        System.out.println(testNumber.isPerfect());
        System.out.println(testNumber.isPerfect());
        System.out.println(testNumber.isMagic());
        System.out.println(testNumber.isMagic());
        testNumber.updateNumber(17);
        System.out.println();
        System.out.println(testNumber.isPrime());
        System.out.println(testNumber.isPrime());
        System.out.println(testNumber.isPerfect());
        System.out.println(testNumber.isPerfect());
        System.out.println(testNumber.isMagic());
        System.out.println(testNumber.isMagic());
        testNumber.updateNumber(17);
        System.out.println(testNumber.isPrime());
        System.out.println(testNumber.isPerfect());
        System.out.println(testNumber.isMagic());
    }
}