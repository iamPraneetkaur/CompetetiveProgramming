import java.util.*;
public class IntToString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        int n=sc.nextInt();
        String s=Integer.toString(n);
        if(n==Integer.parseInt(s))
        System.out.println("Good job");
        else
        System.out.println("Wrong answer");
    }
i}
