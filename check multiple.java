import java.util.*;
class multiplechecking
{
	public static void main(String[] args) {
		System.out.print("Enter Integer: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%5==0 && n%7==0)
		{
		    System.out.println("The entered integer is a multiple of both 5 and 7");
		}
		else
		{
		    System.out.println("The entered integer is not a multiple of both 5 and 7");
		}
	}
}

