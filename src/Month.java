import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter month number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if(n==1)
        {
            System.out.print("jan =31 Days");
        }
        else if(n==2)
        {
            System.out.print("Feb = 28 Days");
        }
        else if(n==3)
        {
            System.out.print("March = 28 Days");
        }
        else if(n==4)
        {
            System.out.print("Apr = 30 Days");
        }
        else if(n==5)
        {
            System.out.print("May = 31 Days");
        }
        else if(n==6)
        {
            System.out.print("jun = 30 Days");
        }
        else if(n==7)
        {
            System.out.print("july = 31 Days");
        }
        else if(n==8)
        {
            System.out.print("Aug = 31 Days");
        }
        else if(n==9)
        {
            System.out.print("Sept = 30 Days");
        }
        else if(n==10)
        {
            System.out.print("Oct =  31Days");
        }
        else if(n==11)
        {
            System.out.print("Nov = 30 Days");
        }
        else if(n==12)
        {
            System.out.print("Dec = 31 Days");
        }
        else
        {
            System.out.println("Invalid month Number");
        }
    }
}
