import java.util.*;
class temperature
{
	public static void main(String[] args) {
	    System.out.print("Enter temperature in celsius: ");
		Scanner sc=new Scanner(System.in);
		double c=sc.nextFloat();
		double f=(c*1.8)+32;
		System.out.println("Temperature in fahrenheit = "+f);
	}
}
