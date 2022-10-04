class Calculator
{
 private int num1,num2;
 public void setCalculator(int a,int b)
 {
  num1=a;
  num2=b;
 }

public void setNum1(int x)
  { 
  num1=x;
  }
public int getNum1()
  {
  return num1;
  }


public void setNum2(int y)
  { 
  num2=y;
  }
public int getNum2()
  {
  return num2;
  }


public void showCalculator()
 {
 int add,sub,multi,div;
 add=num1+num2;
 sub=num1-num2;
 multi=num1*num2;
 div=num1/num2;
 System.out.println("Addition: "+add);
 System.out.println("Subtraction: "+sub);
 System.out.println("Multiplication: "+multi);
 System.out.println("Division: "+div);
 }
}


public class MyCalculator
 {
  public static void main(String args[])
   {
    Calculator c1= new Calculator();
    c1.setCalculator(20,10);
    c1.showCalculator();

    int uttarde=c1.getAdd();
     System.out.println("value is: "+uttarde);

    }
  }
 