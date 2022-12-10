import java.util.Scanner;

public class PrimeTester {
	public static void main(String[] args) {
		System.out.println("Enter an integer to test if it's a prime number: "); 
	    Scanner scanner = new Scanner(System.in);
	    int num = scanner.nextInt();
	    TestPrime machine = new TestPrime(num);
	    boolean y = machine.isPrime(num);
	    System.out.println("Is " + num + " prime?");
	    System.out.println(y);
	    if (y == false)
	    {
	    	System.out.println(num + " can be divided by " + machine.findDivisor(num));
	    }
	}
}
