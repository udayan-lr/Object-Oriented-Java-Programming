import java.util.*;
class sumaverage
{
    public static void main(String[] args)
    {
        System.out.println("Enter 5 numbers:");
        Scanner v=new Scanner(System.in);
        int a=v.nextInt();
        int b=v.nextInt();
        int c=v.nextInt();
        int d=v.nextInt();
        int e=v.nextInt();
        int sum=a+b+c+d+e;
        float avg=(float)(sum/5.0);
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
    }
}
