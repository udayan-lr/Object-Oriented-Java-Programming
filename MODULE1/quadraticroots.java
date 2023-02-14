import java.util.*;
import java.lang.Math;
class quadraticroots
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the coefficient (lets say a) of x^2: ");
		int a=sc.nextInt();
		System.out.print("Enter the coefficient (lets say b) of x: ");
		int b=sc.nextInt();
		System.out.print("Enter the value of c: ");
		int c=sc.nextInt();
		float d=(float)((Math.pow(b,2)-(4*a*c)));
		float r1 = (float)((-b + (Math.sqrt(d)))/(2*a));
		float r2 = (float)((-b - (Math.sqrt(d)))/(2*a));
		System.out.println("The roots of the quadratic equation are "+r1+" and "+r2);
	}
}
