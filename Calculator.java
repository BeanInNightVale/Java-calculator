public class Calculator {
  
    public Calculator ()//constructor
    {}

  
  
  public int add(int a, int b) //method add
      
  
{
return a + b; 
}
  
  public int substract(int a, int b) //method substract
      
  
{
return a - b; 
}
  
public int multiply(int a, int b) //method multiply
      
  
{
return a * b; 
}
  
public int divide(int a, int b) //method divide
      
  
{
  if (b == 0)
  {
    System.out.println("Error! Dividing by zero is not allowed.");
  return 0;
  }
  else
  {
return a / b; 
  }
    
}
  
public int modulo(int a, int b) //method modulo
      
  
{
if (b == 0)
  {
    System.out.println("Error! Dividing by zero is not allowed.");
  return 0;
  }
  else
  {
return a % b; 
  }
 
}
  
  public static void main(String[] args) {//main method
  Calculator myCalculator = new Calculator ();//object myCalc.
    //changing the integers and operations (i.e. multiply, modulo) here will calculate and change the printed output.
    System.out.println(myCalculator.add(3, 8));
    System.out.println(myCalculator.substract(32, 14));
  }
    
}
