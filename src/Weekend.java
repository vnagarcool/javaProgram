import java.util.Scanner;

public class Weekend {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter code of day ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        switch (n)
        {
            case 0: System.out.print("Sunday");
            break;
            case 1: System.out.print("Monday");
            break;
            case 2: System.out.print("Tuesday");
            break;
            case 3: System.out.print("Wednesday");
            break;
            case 4: System.out.print("Thursday");
            break;
            case 5: System.out.print("Friday");
            break;
            case 6: System.out.print("Saturday");
            break;
            default: System.out.print("Invalid Code");
            break;
        }
    }
}
