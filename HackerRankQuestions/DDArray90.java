//Java program to Rotate a given matrix by 90°s right.

//CODE:-    
import java.util.*;
public class DDArray90 
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of matrix");
        n=sc.nextInt();
        int arr[][]=new int [n][n];
        int arr1[][]=new int [n][n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        arr[i][j]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<n;i++)
            {
                arr1[i][n-1-j]=arr[j][i];
            }
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(arr1[i][j]+" ");
            System.out.println();
        }
    }    
}
# CompetetiveProgramming
