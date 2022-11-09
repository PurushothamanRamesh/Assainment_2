import java.util.Scanner;

public class BubbleSort {
    static void BP(int[] a)
    {
        int temp = 0;
        for (int i = 0; i < a.length; i++)
        {
             for(int j=1;j<a.length;j++)
             {
                 if (a[j]<a[j-1])
                 {
                     temp=a[j];
                     a[j]=a[j-1];
                     a[j-1]=temp;
                 }
             }
        }
        System.out.println("YOUR SORTED ARRAY IS");
        for (int m:a)
        {
            System.out.print(m+" ");
        }
    }

    public static  void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbers <11(10 index only) ");
        int [] a=new int[10];
        for(int i=0;i<a.length;i++)
        {
            a[i]= scan.nextInt();
        }
        System.out.println("YOUR GIVEN ARRAY IS ");
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        BP(a);
    }
}

