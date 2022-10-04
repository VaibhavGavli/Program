public class Ass2
{
  public static void main(String args[])
  {
   int no=5;
   int fact;
   for(int i=0;i<=no;i++)
      {
          fact=1; 
     for(int j=1;j<=i;j++)
      {
           fact=fact*j;
       }
       System.out.println("Factorial  of "+i+" is "+fact);
       }    
  }
}