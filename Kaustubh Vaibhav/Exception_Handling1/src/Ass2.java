import java.util.Scanner;

public class Ass2 {

	public static void main(String[] args) {
		try {
			
		int size;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the ARRAY SIZE: ");
		size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter "+i+"elements: ");
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the index of arrays: ");
		int in= sc.nextInt();
		System.out.println("Your elements: "+a[in]);
		}
		catch(NumberFormatException e)
		{
		System.out.println("Check number format: "+e.getMessage());
		e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Check your index again: "+a.getMessage());
			a.printStackTrace();
		}
	}

}
