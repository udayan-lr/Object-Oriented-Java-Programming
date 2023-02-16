import java.util.*;
class arithmetic
{
    public static void addi(int a,int b)
    {
        int c=a+b;
        System.out.println("Sum = "+c);
    }
    public static void diff(int a,int b)
    {
        int c=a-b;
        System.out.println("Difference = "+c);
    }
    public static void multiply(int a,int b)
    {
        int c=a*b;
        System.out.println("Product = "+c);
    }
    public static void div(int a,int b)
    {
        int c=a/b;
        System.out.println("Quotient = "+c);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        addi(a, b);
        diff(a, b);
        multiply(a, b);
        div(a, b);
    }
}
