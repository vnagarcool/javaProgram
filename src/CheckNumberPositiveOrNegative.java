import java.util.Scanner;

public class CheckNumberPositiveOrNegative {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any Number");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if(n>0)
        {
            System.out.println("+ve number");
        }
        else if(n<0)
        {
            System.out.println("-ve Number");
        }
        else
        {
            System.out.println("Neither +ve nor -ve number");
        }
    }
}
