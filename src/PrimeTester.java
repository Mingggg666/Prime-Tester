import java.util.Scanner;

public class PrimeTester {
	public static void main(String[] args) {
		boolean run = true;
		while (run == true)
		{
			System.out.println("Enter an integer to test if it's a prime number: (Enter 0 to exit)"); 
	    	Scanner scanner = new Scanner(System.in);
	    	int num = scanner.nextInt();
			int origin = num;
			if (num == 0)
			{
				run = false;
			}
			else 
			{
				TestPrime machine = new TestPrime(num);
				boolean y = machine.isPrime(num);
				System.out.println("Is " + num + " prime?");
				System.out.println(y);
				while (y == false)
				{
					System.out.println(num + " divided by " + machine.findDivisor(num) + " is " + num / machine.findDivisor(num));
					num = num / machine.findDivisor(num);
					y = machine.isPrime(num);
				}
				System.out.println(num + " is the largest prime factor of " + origin);
			}
	    	
		}
		
	}
}
