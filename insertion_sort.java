import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elemets: ");
        int i,value,hole;
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=1;i<n;i++)
        {
            value=a[i];
            hole=i;
            while(hole>0 && value<a[hole-1])
            {
                a[hole]=a[hole-1];
                hole=hole-1;
            }
            a[hole] =value;
        }
        System.out.println("The sorted array is: ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
