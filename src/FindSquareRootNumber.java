import java.util.Scanner;

public class FindSquareRootNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number ");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        double m=Math.sqrt(n);
        System.out.print("Square root of "+n+" is "+m);
    }
}
