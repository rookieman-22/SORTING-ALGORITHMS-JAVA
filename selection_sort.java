import java.util.Scanner;

public class selection_sort {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,imin;
        System.out.println("Enter array size: ");
        int n=s.nextInt();
        int a[]=new int [n];
        System.out.println("Enter array elemens: ");
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            imin=i;
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[imin])
                {
                    imin=j;
                }
            }
            int temp= a[imin];
            a[imin]=a[i];
            a[i]=temp;
        }
        System.out.println("The sorted array is: ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
