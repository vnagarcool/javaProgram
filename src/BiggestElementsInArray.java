import java.util.Scanner;
public class BiggestElementsInArray {

    public static void main(String[] args) {
        int a[] = new int[5]; int max;
        int temp;
        Scanner r = new Scanner(System.in);
        System.out.print("Enter value in array ");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = r.nextInt();
        }
        max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Maximum Element "+max);
    }
}

