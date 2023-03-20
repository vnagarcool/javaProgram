import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a,b,temp;
        System.out.print("Enter two Number ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("Before Swap "+ a+ " "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap "+ a+" "+b);

    }
}
