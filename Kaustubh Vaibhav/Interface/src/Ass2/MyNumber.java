package Ass2;

public class MyNumber implements Operations {

	@Override
	public boolean isOdd(int num) {
		boolean flag=true;
		if(num%2==0)
		{
			flag=false;
		}
		return flag;
	}

	@Override
	public boolean isEven(int num) {
		boolean flag=true;
		if(num%2!=0)
		{
			flag=false;
		}
		return flag;
	}

	@Override
	public boolean isPrime(int num) {
		boolean flag=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}

	@Override
	public double calFactorial(int num) {
		double fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
