import java.util.*;
class leapyear
{
    public static void main(String[] args)
    {
        System.out.print("Enter the year that you want to be checked: ");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%400 == 0)
        {
            System.out.println("It is a leap year");
        }
        else if(year%100 == 0)
        {
            System.out.println("It is not a leap year");
        }
        else if(year%4 == 0)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }
    }
}