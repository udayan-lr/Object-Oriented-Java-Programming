import java.util.*;
class arithmetic
{
    public static void addi(char a,char b)
    {
        char c=a+b;
        System.out.println("Sum = "+c);
    }
    public static void diff(char a,char b)
    {
        char c=a-b;
        System.out.println("Difference = "+c);
    }
    public static void multiply(char a,char b)
    {
        char c=a*b;
        System.out.println("Product = "+c);
    }
    public static void div(char a,char b)
    {
        char c=a/b;
        System.out.println("Quotient = "+c);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 2 strings:");
        char a=sc.nextChar();
        char b=sc.nextChar();
        addi(a, b);
        diff(a, b);
        multiply(a, b);
        div(a, b);
    }
}

