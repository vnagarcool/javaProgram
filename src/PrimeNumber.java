import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int n,count=0;
        System.out.print("Enter any number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
            System.out.print("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}
