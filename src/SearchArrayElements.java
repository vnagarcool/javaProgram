import java.util.Arrays;
import java.util.Scanner;

public class SearchArrayElements {
    public static void main(String[] args) {
        int a[]=new int[5];
        int n,
        count=0;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter Array Elements ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Array Elements ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.print("Enter search Elements ");
        n=r.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                count++;
            }
        }
        if(count>0)
            System.out.print("Item Found "+count+" times");
        else
            System.out.print("Item Not Found ");
    }
}
