import java.util.Scanner;

public class CopyArrayElements {
    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter value in first array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("First array elements ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("Second array elements ");
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }
    }
}
