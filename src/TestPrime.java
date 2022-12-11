import java.lang.Math;

public class TestPrime {
	private int test;
	private int k = 1;
	
	public TestPrime(int input)
	{
		test = input;
	}
	
	public boolean isPrime(int test)
	{
		for (int i = 2; i <= (int)(Math.sqrt(test)); i++)
		{
			if (test % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public int findDivisor(int test)
	{
		for (int i = 2; i <= (int)(Math.sqrt(test)); i++)
		{
			if (test % i == 0)
			{
				return i;
			}
		}
		return k;
	}
}
