
import java.util.Scanner;
public class DublicateNUmberFinder {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbers ");
          int [] a=new int[10];
            for(int i=0;i<a.length;i++)
            {
                a[i]= scan.nextInt();
            }
           for (int j=0;j<a.length;j++)
            {
                for(int k=j+1;k<a.length;k++)
                {
                    if (a[j]==a[k])
                    {
                        System.out.print(a[k]+" ");
                    }
               }
            }
        }
}