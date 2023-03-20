import java.util.Scanner;

public class ArrayElementsInReverseOrder {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print("Enter elements in array");
        for(int i=0;i<5;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("array elements ");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("array reverse elements ");
        for(int i=5-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
