public class Main {

    public static void main(String[] args) {
	// write your code here
        PrimeNumbers primeNumbers = new PrimeNumbers();
        Integer max = Integer.parseInt(args[0]);
        primeNumbers.generateNumbers(max);
    }
}
