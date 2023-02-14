import java.util.*;
import java.lang.Math;
class Area
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first side of the triangle in cms: ");
		double a=sc.nextDouble();
		System.out.print("Enter second side of the triangle in cms: ");
		double b=sc.nextDouble();
		System.out.print("Enter third side of the triangle in cms: ");
		double c=sc.nextDouble();
		double s=(a+b+c)/2.0;
		double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area of the triangle is "+area+" cms");
	}
}