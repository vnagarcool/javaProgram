import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number;
        System.out.print("Enter any Number");
        Scanner r=new Scanner(System.in);
        number=r.nextInt();

        for(int i=1; i<=10; i++)
        {
           System.out.println(number+"*"+i+"= "+number*i);
        }
    }
}
