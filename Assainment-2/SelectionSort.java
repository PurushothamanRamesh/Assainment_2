import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort
    //
{
    public static void main(String[] args)
    {
       // int[] arr={4,2,1,4,4,6,9,6,8,5};
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbers <11(10 index only) ");
        int [] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= scan.nextInt();

        }
        System.out.println("YOUR GIVEN ARRAY IS ");
        for (int i = 0; i <arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();





        for (int i = 0; i <arr.length; i++)
        {
            int low =arr[i];
            int minIndex=i;
            for(int j=i+1;j< arr.length;j++)
            {
                if (low>arr[j])
                {
                   low=arr[j];
                   minIndex=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=low;
            arr[minIndex]=temp;

        }
        System.out.println("YOUR SELECTION SORT ARRAY IS ");
        System.out.println(Arrays.toString(arr));


    }
}
