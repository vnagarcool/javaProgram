import java.util.Scanner;

public class FindAverageArrayElements {
    public static void main(String[] args) {
        int a[]=new int[5]; int sum=0; double avg;
        Scanner r=new Scanner(System.in);
        System.out.print("Enter array elements ");
        for(int i=0;i<a.length;i++)
        {
            a[i]= r.nextInt();
        }
        System.out.print("Array Elements");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        for(int i=0;i<a.length;i++)
        {
            sum=a[i]+sum;
        }
        avg=sum/a.length;
        System.out.println(sum+" "+ avg);
    }
}
