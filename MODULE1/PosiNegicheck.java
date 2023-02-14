import java.util.*;
class positiveornegative 
{
  public static void main(String[] args) 
  {
    System.out.print("Enter the number to be checked:");
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();  
    if(a>=0)
    {
        System.out.println("It is a Positive number");
    }
    else
    {
        System.out.println("It is a Negative number");
    }
  }
}