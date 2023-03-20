import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n,rem,arm=0,c;
        System.out.println("Enter any number ");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        c=n;
        while(n>0)
        {
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm)
            System.out.print("Armstrong Number ");
        else
            System.out.print("Not Armstrong number ");
    }
}
