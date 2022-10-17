import java.text.NumberFormat;


public class Ass1 {

	public static void main(String[] args) {
		int no1=Integer.parseInt(args[0]);
		int no2=Integer.parseInt(args[1]);
      
		
		try 
		{
			int div;
			div=no1/no2;
			System.out.println("Division is: "+div);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			e.getMessage();
		}
		/*catch(ArithmeticException a) 
		{
			a.printStackTrace();
		}*/
		finally
		{
			System.out.println("Exception--------------");
		}
	}

}
