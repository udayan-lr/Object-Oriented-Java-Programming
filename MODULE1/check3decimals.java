import java.util.*;
class floatn
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        int x=(int)(a*1000);
        int y=(int)(b*1000);
        if(x-y==0)
        {
            System.out.println("The two numbers are same up to three decimals");
        }
        else
        {
            System.out.println("The two numbers are not same up to three decimals");
        }
    }
}