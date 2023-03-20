import java.util.Scanner;

public class MaximumNumberBetweenTwoNumber {
    public static void main(String[] args) {
        int a,b;
        System.out.print("Enter two number");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        if(a>b)
        {
            System.out.print(a);
        }
        else
        {
            System.out.print(b);
        }
    }
}
